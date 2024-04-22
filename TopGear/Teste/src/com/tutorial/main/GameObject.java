package com.tutorial.main;

import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class GameObject {  //objetos de jogo
    
    protected float x, y; //x,y no plano cartesiano
    protected ID id;    //id para diferenciar jogador e inimigos
    protected float velX, velY;

    public GameObject(float x, float y, ID id){
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public abstract void tick();
    public abstract void render(Graphics g);
    public abstract Rectangle getBounds();      //adiciona bordas aos retangulos para colisão


    public void setX(float x) {
        this.x = x;
    }
    public float getX() {
        return this.x;
    }

    public void setY(float y) {
        this.y = y;
    }  
    public float getY() {
        return this.y;
    }

    public void setId(ID id) {
        this.id = id;
    }
    public ID getId() {
        return this.id;
    }

    public void setVelX(float velX) {
        this.velX = velX;
    }
    public float getVelX() {
        return this.velX;
    }
    
    public void setVelY(float velY) {
        this.velY = velY;
    }    
    public float getVelY() {
        return this.velY;
    }

}
