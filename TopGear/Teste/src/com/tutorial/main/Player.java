package com.tutorial.main;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.ImageIcon;

public class Player extends GameObject{

    Random r = new Random();
    Handler handler;

    private String imagem = "com\\tutorial\\main\\carro.png";

    ImageIcon imagemPlayer = new ImageIcon(imagem);

    public Player(float x, float y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;
    }

    public Rectangle getBounds(){       //barreira de colisão do player
        return new Rectangle((int) x, (int) y, 32, 32);
    }

    public void tick() {        //a cada tick atualiza a posição do player
        y += velY;
        x += velX;

        x = Game.clamp((int) x, 0, Game.WIDTH - 108);      //para impedir que o jogador ultrapasse o limite da janela de jogo
        y = Game.clamp((int) y, 0, Game.HEIGHT - 96); 

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
            if(objetoTemporario.getId() == ID.InimigoRapido){
                if(getBounds().intersects(objetoTemporario.getBounds())){    //inimigo rápido dá mais dano
                    HUD.HEALTH -= 5;
                }
            }
            if(objetoTemporario.getId() == ID.InimigoInteligente){
                if(getBounds().intersects(objetoTemporario.getBounds())){     //inimigo inteligente dá mais dano
                    HUD.HEALTH -= 10;
                }
            }
            if(objetoTemporario.getId() == ID.Chefao){
                if(getBounds().intersects(objetoTemporario.getBounds())){    //chefão dá mais dano
                    HUD.HEALTH -= 20;
                }
            }

            if(objetoTemporario.getId() == ID.Tiro){
                if(getBounds().intersects(objetoTemporario.getBounds())){    //chefão dá mais dano
                    HUD.HEALTH -= 5;
                }
            }            
        }
    }

    public void render(Graphics g) {
        g.drawImage(imagemPlayer.getImage(), (int) x, (int) y, 100, 64, null);
    }

    
    
}
