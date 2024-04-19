package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Player extends GameObject{

    Random r = new Random();
    Handler handler;

    public Player(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;
    }

    public Rectangle getBounds(){       //barreira de colisão do player
        return new Rectangle(x, y, 32, 32);
    }

    public void tick() {        //a cada tick atualiza a posição do player
        y += velY;
        x += velX;

        x = Game.clamp(x, 0, Game.WIDTH - 48);      //para impedir que o jogador ultrapasse o limite da janela de jogo
        y = Game.clamp(y, 0, Game.HEIGHT - 70); 

        colisao();
    }

    private void colisao(){     
        for (int i = 0; i < handler.objeto.size(); i++) {
            GameObject objetoTemporario = handler.objeto.get(i);

            if(objetoTemporario.getId() == ID.InimigoBasico){   //se o inimigo encostar, a vida diminui
                if(getBounds().intersects(objetoTemporario.getBounds())){
                    HUD.HEALTH -= 2;
                }
            }
        }
    }

    public void render(Graphics g) {

        g.setColor(Color.BLUE);                 //adiciona um objeto azul
        g.fillRect(x, y, 32, 32);               //caracteristicas do objeto
    }

    
    
}
