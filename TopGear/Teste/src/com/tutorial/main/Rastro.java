package com.tutorial.main;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Rastro extends GameObject{

    private float alpha = 1;
    private float life;
    
    private Handler handler;
    private Color color;

    private int width, height;
    

    public Rastro(int x, int y, ID id, Color color, int width, int height, float life, Handler handler){
        super(x, y, id);
        this.color = color;
        this.height = height;
        this.width = width;
        this.life = life;       //life = 0.001 - 0.1
        this.handler = handler;
    }

    public void tick() {
        if(alpha > life){       //diminui o tamanho das particulas
            alpha -= (life - 0.0000000001f);
        }
        else{
            handler.removerObjeto(this);
        }
    }

    public void render(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setComposite(transparecer(alpha));
        g.setColor(color);
        g.fillRect(x, y, width, height);

        g2d.setComposite(transparecer(1));
    }

    private AlphaComposite transparecer(float alpha){   
        int type = AlphaComposite.SRC_OVER;

        return (AlphaComposite.getInstance(type, alpha));
    }

    public Rectangle getBounds() {
        return null;
    }
}
