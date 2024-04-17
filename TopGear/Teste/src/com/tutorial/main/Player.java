package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Player extends GameObject{

    Random r = new Random();

    public Player(int x, int y, ID id) {
        super(x, y, id);


    }

    public void tick() {        //a cada tick atualiza a posição do player
        x += velX;
        y += velY;
    }

    public void render(Graphics g) {
        if(id == ID.Player)
            g.setColor(Color.BLUE);                 //adiciona um objeto azul
        else
            g.setColor(Color.RED);
        g.fillRect(x, y, 32, 32);               //caracteristicas do objeto
    }

    
    
}
