package palgames.firstgame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class rectangles extends BasicGame {
    private int xAxis;
    private int yAxis;

    public rectangles(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.xAxis = 100;
        this.yAxis = 100;
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        this.xAxis++;
        this.yAxis++;
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.xAxis,this.yAxis,100,100);
        graphics.drawString("Hello world", 50, 50);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new rectangles("Rectangles"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
