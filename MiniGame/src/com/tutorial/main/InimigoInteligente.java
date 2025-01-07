package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class InimigoInteligente extends GameObject{

    private Handler handler;
    private GameObject player;

    public InimigoInteligente(float x, float y, ID id, Handler handler) {
        super(x, y, id);

        this.handler = handler;

        for (int i = 0; i < handler.objeto.size(); i++) {
            if(handler.objeto.get(i).getId() == ID.Player){
                player = handler.objeto.get(i);
            }
        }

    }

    public Rectangle getBounds(){       //barreira de colisão do inimigo
        return new Rectangle((int) x, (int) y, 16, 16);
    }

    public void tick() {
        x += velX;
        y += velY;

        float localX = x - player.getX() - 8; //-8 para pegar o centro do player
        float localY = y - player.getY() - 8;

        float distancia = (float) Math.sqrt((x - player.getX()) * (x - player.getX()) + (y - player.getY()) * (y - player.getY()));

        velX = (float) ((-1.0/distancia) * localX);
        velY = (float) ((-1.0/distancia) * localY);
        
        if(y <= 0 || y >= (Game.HEIGHT - 48))  //se a posição dele estiver na borda da janela, ele vai na direção contrária
            velY *= -1;
        if(x <= 0 || x >= (Game.WIDTH - 32))
            velX *= -1;
        
        handler.addObjeto(new Rastro((int) x, (int) y, ID.Rastro, Color.BLACK, 16, 16, (float) 0.02, handler));
    }


    public void render(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect((int) x, (int) y, 16, 16);
    }
    
}
