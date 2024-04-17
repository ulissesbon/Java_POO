package com.tutorial.main;

import java.awt.Graphics;

public abstract class GameObject {  //objetos de jogo
    
    protected int x, y;
    protected ID id;    //id para diferenciar jogador e inimigos
    protected int velX, velY;

    public GameObject(int x, int y, ID id){
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public abstract void tick();
    public abstract void render(Graphics g);


    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        this.y = y;
    }  
    public int getY() {
        return this.y;
    }

    public void setId(ID id) {
        this.id = id;
    }
    public ID getId() {
        return this.id;
    }

    public void setVelX(int velX) {
        this.velX = velX;
    }
    public int getVelX() {
        return this.velX;
    }
    
    public void setVelY(int velY) {
        this.velY = velY;
    }    
    public int getVelY() {
        return this.velY;
    }

}
