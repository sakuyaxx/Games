package palgames.wintergame;

import org.newdawn.slick.*;

public class MainGame extends BasicGame {

private CircleActor ca1, ca2;

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        this.ca1 = new CircleActor(100,100);
        this.ca2 = new CircleActor(100,200);
    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
      this.ca1.update(gc, delta);
      this.ca2.update(gc, delta);
    }

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        this.ca1.render(graphics);
        this.ca2.render(graphics);
    }

    /*public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("Winter Game"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }*/
}
