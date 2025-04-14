package org.example;

public class MusicBox implements MusicPlayer{
    @Override
    public void playMusic() {
        System.out.println("A caixa de música está tocando música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("A caixa de música está pausando musica");
    }

    @Override
    public void stopMusic() {
        System.out.println("A caixa de música está parando a música");
    }
}
