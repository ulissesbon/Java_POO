package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;

public class HUD {          //barra de vida

    public static int HEALTH = 100;

    public void tick(){
        HEALTH = Game.clamp(HEALTH, 0, 100);

    }

    public void render(Graphics g){
        g.setColor(Color.gray);
        g.fillRect(15, 15, 200, 16);      //cor de fundo para vida vazia
        g.setColor(Color.green);
        g.fillRect(15, 15, HEALTH * 2, 16);     //cor da vida cheia
        g.setColor(Color.white);
        g.drawRect(15, 15, 200, 16);      //borda da barra
    }

}
