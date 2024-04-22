package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Tiro extends GameObject{

    private Handler handler;
    private Random r = new Random();

    public Tiro(float x, float y, ID id, Handler handler) {
        super(x, y, id);

        this.handler = handler;

        int aux = r.nextInt(11) - 5; 
        while(aux == 0){
            aux = r.nextInt(11) - 5; 
        }
        velX = aux;
        velY = 10;

    }

    public Rectangle getBounds(){       //barreira de colisão do inimigo
        return new Rectangle((int) x, (int) y, 5, 5);
    }

    public void tick() {
        x += velX;
        y += velY;

        if(y >= Game.HEIGHT)
            handler.removerObjeto(this);

        //handler.addObjeto(new Rastro((int) x, (int) y, ID.Rastro, Color.darkGray, 5, 5, (float) 0.02, handler));
    }


    public void render(Graphics g) {
        g.setColor(Color.DARK_GRAY);
        g.fillRect((int) x, (int) y, 5, 5);
    }
    
}
