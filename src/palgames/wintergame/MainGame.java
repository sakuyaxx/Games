package palgames.wintergame;
import org.newdawn.slick.*;
import org.w3c.dom.css.Counter;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame {

    private List<Actor> actors;
    private Player player;

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
       this.actors = new ArrayList<>();
       this.player = new Player();

       MoveStrategy mr1 = new MoveRight(0, 0, 0.3f);
       MoveStrategy ml2 = new MoveLeft(500, 100, 0.1f);

        this.actors.add(new CircleActor());
        this.actors.add(new CircleActor());

        this.actors.add(new RectActor(100,300));
        HomerActor ha1 = new HomerActor(100, 200, 0.1f);
        this.actors.add(ha1);

        this.player.setHomerActor(ha1);

        for (int i = 0; i < 10; i++) {
            this.actors.add(RandomCircleFactory.getRandomActor());
        }

        CounterSingleton cs1 = CounterSingleton.getInstance();

        cs1.incCounter();                          //DEBUG
        System.out.println(cs1.getCounter());
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
       player.render(graphics);
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
