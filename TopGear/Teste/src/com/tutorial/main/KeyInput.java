package com.tutorial.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{

    private Handler handler;

    public KeyInput(Handler handler){
        this.handler = handler;
    }
    
    
    public void keyPressed(KeyEvent e){     //é um override de KeyAdapter
        int key = e.getKeyCode();

        for(int i = 0 ; i < handler.objeto.size(); i++){
            GameObject objetoTemporario = handler.objeto.get(i);

            if(objetoTemporario.getId() == ID.Player){      //os eventos do player para cada tecla
                                                            //não permite o jogador se mover além das bordas
                if(key == KeyEvent.VK_W)
                       objetoTemporario.setVelY(-5);
                if(key == KeyEvent.VK_S)
                    objetoTemporario.setVelY(+5);
                if(key == KeyEvent.VK_A)
                    objetoTemporario.setVelX(-5);
                if(key == KeyEvent.VK_D)
                    objetoTemporario.setVelX(+5);

            }            
        }

        if(key == KeyEvent.VK_ESCAPE)       //apertar Esc pra sair
            System.exit(1);

    }


    public void keyReleased(KeyEvent e){    //é um override de KeyAdapter
        int key = e.getKeyCode();

        for(int i =0 ; i < handler.objeto.size(); i++){
            GameObject objetoTemporario = handler.objeto.get(i);

            if(objetoTemporario.getId() == ID.Player){      //os eventos do player para cada tecla

                if(key == KeyEvent.VK_W)
                    objetoTemporario.setVelY(0);
                else if(key == KeyEvent.VK_S)
                    objetoTemporario.setVelY(0);
                else if(key == KeyEvent.VK_A)
                    objetoTemporario.setVelX(0);
                else if(key == KeyEvent.VK_D)
                    objetoTemporario.setVelX(0);
            }            
        }
    }
}
