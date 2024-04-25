package com.tutorial.main;

import java.util.Random;

public class Spawn {

    @SuppressWarnings("unused")
    private Handler handler;
    private HUD hud;

    @SuppressWarnings("unused")
    private Random r = new Random();

    private int scoreKeep = 0;


    public Spawn(Handler handler, HUD hud){
        this.handler = handler;
        this.hud = hud;
    }

    public void tick(){
        scoreKeep++;

        if(scoreKeep >= 200){          //level muda a cada N pontos
            scoreKeep = 0;
            hud.setLevel(hud.getLevel() + 1);

            
            if(hud.getLevel() == 2){    //adiciona 1 inimigo
                handler.addObjeto(new InimigoBasico(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.InimigoBasico, handler));
            } else if (hud.getLevel() == 3) {   
                handler.addObjeto(new InimigoRapido(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.InimigoRapido, handler));
            } else if (hud.getLevel() == 4) {   
                handler.addObjeto(new InimigoInteligente(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.InimigoInteligente, handler));
            }else if (hud.getLevel() == 10) {   
                handler.limparInimigos();
                handler.addObjeto(new Chefao(((Game.WIDTH) / 2) - 32, -120, ID.Chefao, handler));
            }

        }
    }

}
