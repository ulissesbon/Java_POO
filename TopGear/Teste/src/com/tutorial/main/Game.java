package com.tutorial.main;

import java.awt.Color;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Random;

public class Game extends Canvas implements Runnable{

    public static final int WIDTH = 720, HEIGHT = WIDTH / 12 * 9;
    
    private Thread thread;
    private boolean running = false;

    private Handler handler;
    private Random r;
    private HUD hud;


    public Game(){

        handler = new Handler();    //cria o handler para o jogo
        this.addKeyListener(new KeyInput(handler));    //avisa para o programa haverá teclas para ele responder

        new Window(WIDTH, HEIGHT, "Top Gear de pobre", this);   //cria a janela do jogo

        hud = new HUD();
        
        r = new Random();

        handler.addObjeto(new Player(WIDTH/2-32, HEIGHT/2-32, ID.Player, handler)); //adicionando objeto Player no jogo, e qual posição
        
        handler.addObjeto(new InimigoBasico(r.nextInt(WIDTH), r.nextInt(HEIGHT), ID.InimigoBasico, handler));    //inimigo
        
    }


    public synchronized void start(){
        thread = new Thread(this);
        thread.start();
        running = true;  //verificar se o jogo está rodando
    }

    public synchronized void stop(){
        try {
            thread.join();      //parando thread
            running = false;    //verificar se o jogo está rodando
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run(){          //loop do jogo 
        this.requestFocus();    //não precisa clicar na janela, já abre com prioridade

        long lastTime = System.nanoTime();  //armazena o tempo de cada iteração do loop
        double amountOfTicks = 60.0;            //  setam a taxa de atualização... 
        double ns = 1000000000 / amountOfTicks; //    ...para 60 ticks por segundo
        double delta = 0;                   //tempo decorrido
        long timer = System.currentTimeMillis();
        @SuppressWarnings("unused")
        int frames = 0;

        while(running){
            long now = System.nanoTime();       //pega o tempo atual
            delta += (now - lastTime) / ns;     //pega tempo decorrido
            lastTime = now;

            while(delta >= 1){
                tick();                         
                delta--;
            }
            
            if(running){
                render();                       //mostrar o estado de renderização
            }
            frames++;                           //acompanha o numero de quadros atualizados

            if(System.currentTimeMillis() - timer > 1000){  //mostra o total de frames a cada 1 segundo
                timer += 1000;
                //System.out.println("FPS: " + frames);
                frames = 0;
            }
        }
        stop();     //para o loop quando o jogo parar de rodar
    }

    private void tick(){
        handler.tick();
        hud.tick();
    }

    private void render(){                              //diminuindo o fps da janela
        BufferStrategy bs = this.getBufferStrategy();   //criando um componente de renderização
        if(bs == null){
            this.createBufferStrategy(3);    //quantos buffers são criados
            return;
        }

        Graphics g = bs.getDrawGraphics();

        g.setColor(Color.pink);                        //setando a cor da janela
        g.fillRect(0, 0, WIDTH, HEIGHT);            //preenchendo a janela

        handler.render(g);

        hud.render(g);

        g.dispose();
        bs.show();
    }

    public static int clamp(int valor, int min, int max){   
        if(valor >= max)
            return valor = max;
        else if(valor <= min)
            return valor = min;
        else
            return valor;

    }


    public static void main(String[] args) {
        new Game();
    }
}
