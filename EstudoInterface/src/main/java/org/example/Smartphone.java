package org.example;

public class Smartphone implements VideoPlayer, MusicPlayer{

    @Override
    public void playMusic() {
        System.out.println("O smarthpone está tocando música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O smarthpone está pausando musica");
    }

    @Override
    public void stopMusic() {
        System.out.println("O smarthpone está parando a mmúsica");
    }

    @Override
    public void playVideo() {
        System.out.println("O smarthpone está tocando o video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O smarthpone está pausando o video");
    }

    @Override
    public void stopVideo() {
        System.out.println("O smarthpone está parando o video");
    }
}
