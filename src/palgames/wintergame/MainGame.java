package palgames.wintergame;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame {

    private List<Actor> actors;

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
       this.actors = new ArrayList<>();
        this.actors.add(new CircleActor(100,100));
        this.actors.add(new CircleActor(200,100));
        this.actors.add(new RectActor(100,300));
    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        for (Actor actor : this.actors){
            actor.update(gc, delta);
        }
    }

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
       for (Actor actor : this.actors){
           actor.render(graphics);
       }
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
