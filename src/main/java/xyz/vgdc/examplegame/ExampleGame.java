package xyz.vgdc.examplegame;

import github.chorman0773.sentry.GameBasic;
import github.chorman0773.sentry.annotation.Game;
import github.chorman0773.sentry.generic.GenericGame;

import java.awt.*;

@Game(gameId="VGDC Example",uuid="00f916a6-f728-451f-82bd-62f7895e4e2f",version="1.0")
public class ExampleGame extends GenericGame {


    protected ExampleGame() {
        super(60);
    }

    @Override
    protected void tick() {}

    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(0,0,700,550);
    }
}
