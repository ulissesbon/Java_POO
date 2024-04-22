package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class InimigoRapido extends GameObject{

    private Handler handler;

    public InimigoRapido(float x, float y, ID id, Handler handler) {
        super(x, y, id);

        this.handler = handler;

        velX = 2;
        velY = 9;

    }

    public Rectangle getBounds(){       //barreira de colisão do inimigo
        return new Rectangle((int) x, (int) y, 16, 16);
    }

    public void tick() {
        x += velX;
        y += velY;

        if(y <= 0 || y >= (Game.HEIGHT - 48))  //se a posição dele estiver na borda da janela, ele vai na direção contrária
            velY *= -1;
        if(x <= 0 || x >= (Game.WIDTH - 32))
            velX *= -1;

        handler.addObjeto(new Rastro((int) x, (int) y, ID.Rastro, Color.MAGENTA, 16, 16, (float) 0.02, handler));
    }


    public void render(Graphics g) {
        g.setColor(Color.MAGENTA);
        g.fillRect((int) x, (int) y, 16, 16);
    }
    
}
