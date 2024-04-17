package com.tutorial.main;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends Canvas {

    //criando uma janela para o jogo

    public Window(int width, int height, String title, Game game){
        JFrame frame = new JFrame(title);

        frame.setPreferredSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //ter um botão para encerrar o jogo
        frame.setResizable(false);  //travando o tamanho da janela
        frame.setLocationRelativeTo(null);  //começa o jogo centralizado na tela
        frame.add(game);              //coloca o jogo no frame
        frame.setVisible(true);     //torna visível
        game.start();   
    }   
    

}
