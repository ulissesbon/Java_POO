package com.tutorial.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{

    private Handler handler;
    private boolean[] keyDown = new boolean[4];

    public KeyInput(Handler handler){
        this.handler = handler;

        keyDown[0] = false; //w
        keyDown[1] = false; //s
        keyDown[2] = false; //d
        keyDown[3] = false; //a
    }
    
    
    public void keyPressed(KeyEvent e){     //é um override de KeyAdapter
        int key = e.getKeyCode();

        for(int i = 0 ; i < handler.objeto.size(); i++){
            GameObject objetoTemporario = handler.objeto.get(i);

            if(objetoTemporario.getId() == ID.Player){      //os eventos do player para cada tecla
                                                            //não permite o jogador se mover além das bordas
                if(key == KeyEvent.VK_W){
                    objetoTemporario.setVelY(-5);
                    keyDown[0] = true;
                }
                if(key == KeyEvent.VK_S){
                    objetoTemporario.setVelY(+5);
                    keyDown[1] = true;
                }
                if(key == KeyEvent.VK_D){
                    objetoTemporario.setVelX(+5);
                    keyDown[2] = true;
                }
                if(key == KeyEvent.VK_A){
                    objetoTemporario.setVelX(-5);
                    keyDown[3] = true;
                }

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

                if(key == KeyEvent.VK_W){
                    //objetoTemporario.setVelY(0);
                    keyDown[0] = false;
                }
                else if(key == KeyEvent.VK_S){
                    //objetoTemporario.setVelY(0);
                    keyDown[1] = false;
                }
                else if(key == KeyEvent.VK_D){
                    //objetoTemporario.setVelX(0);
                    keyDown[2] = false;
                }
                else if(key == KeyEvent.VK_A){
                    //objetoTemporario.setVelX(0);
                    keyDown[3] = false;
                }
                
                //movimento vertical
                if(!keyDown[0] && !keyDown[1])
                    objetoTemporario.setVelY(0);
                    
                //movimento horizontal
                if(!keyDown[2] && !keyDown[3])
                    objetoTemporario.setVelX(0);
            }            
        }
    }
}
