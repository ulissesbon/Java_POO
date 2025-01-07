package com.tutorial.main;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.ImageIcon;

public class Chefao extends GameObject{

    private int timer = 100;
    private int timer2 = 70;

    private Handler handler;
    private String imagem = "com\\tutorial\\main\\chefao.png";

    private Random r = new Random();

    ImageIcon imagemChefao = new ImageIcon(imagem);

    public Chefao(float x, float y, ID id, Handler handler) {
        super(x, y, id);

        this.handler = handler;

        velX = 0;
        velY = 2;

    }

    public Rectangle getBounds(){       //barreira de colisão do inimigo
        return new Rectangle((int) x, (int) y, 64, 64);
    }

    public void tick() {
        x += velX;
        y += velY;

        if(timer <= 0)
            velY = 0;   //movimenta o chefe até uma altura
        else    
            timer--;    //temporizador da descida

        if(timer <= 0)  //temporizador para começar a mover
            timer2--;
        if(timer2 <= 0){    //começa a movimentar o chefe horizontalmente
            if(velX == 0)
                velX = 2;

            if(velX >= 0)   //aumenta a velocidade gradualmente
                velX += 0.01;

            velX = Game.clamp(velX, -10, 10);   //velocidade máxima
            
            int spawn = r.nextInt(6);   //aleatoriedade dos tiros
            if(spawn ==0)
                handler.addObjeto(new Tiro((int) (x + 32), (int) (y + 64), ID.Tiro, handler));  //adiciona os tiros
        }

        
        if(x <= 0 || x >= (Game.WIDTH - 78))    //bate na borda e volta na outra direção
            velX *= -1;
        
    }


    public void render(Graphics g) {        //imagem do chefao renderizada
        g.drawImage(imagemChefao.getImage(), (int) x, (int) y, 64, 64, null);
    }
    
}
