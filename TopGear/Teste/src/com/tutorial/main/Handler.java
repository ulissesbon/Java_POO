package com.tutorial.main;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler { //manter e renderizar todos os objetos

    LinkedList<GameObject> objeto = new LinkedList<GameObject>();  //lista dos objetos para serem mantidos

    public void tick(){
        for(int i = 0; i < objeto.size(); i++){
            GameObject objetoTemporario = objeto.get(i);   //copiando o objeto em um temporario

            objetoTemporario.tick();
        }
    }

    public void render(Graphics g){
        for (int i = 0; i < objeto.size(); i++){
            GameObject objetoTemporario = objeto.get(i);   //copiando o objeto em um temporario

            objetoTemporario.render(g);
        }
    }

    public void addObjeto(GameObject objeto){
        this.objeto.add(objeto);
    }

    public void removerObjeto(GameObject objeto){
        this.objeto.remove(objeto);
    }

}
