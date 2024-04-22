package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;

public class HUD {          //barra de vida

    public static float HEALTH = 100;     //quantidade de vida

    private float valorVerde = 255;       //valor de verde no rgb

    private int score = 0;
    private int level = 1;


    public void tick(){
        HEALTH = Game.clamp( HEALTH, 0, 100);

        valorVerde = Game.clamp(valorVerde, 0, 255);    //a barra de vida vai ficando vermelha a cada hit tomado

        valorVerde = HEALTH * 2;

        score++;
    }

    public void render(Graphics g){
        g.drawString("Vida: " + HEALTH, 15, 12);    //pontos de vida

        g.setColor(Color.gray);
        g.fillRect(15, 15, 200, 16);      //cor de fundo para vida vazia
        g.setColor(new Color(75, (int) valorVerde, 0));
        g.fillRect(15, 15, (int) HEALTH * 2, 16);     //cor da vida cheia
        g.setColor(Color.white);
        g.drawRect(15, 15, 200, 16);      //borda da barra

        g.drawString("Pontos: " + score, 15, 48);
        g.drawString("Level: " + level, 15, 64);
    }


    public void setScore(int score) {
        this.score = score;
    }
    public int getScore() {
        return this.score;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public int getLevel() {
        return this.level;
    }
}
