package palgames.wintergame;

import org.newdawn.slick.*;
import palgames.firstgame.rectangles;

public class MainGame extends BasicGame {

    private float x,y;

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.x = 100;
        this.y = 100;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        this.x+= (float)delta/5.0;
        this.y+= (float)delta/5;

        if (this.x >= 800){
            this.x = 0;
            this.y = 0;
        }

        System.out.println(delta);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x,this.y,50,50);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("Winter Game"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
