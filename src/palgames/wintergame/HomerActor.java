package palgames.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class HomerActor implements Actor{
    @Override
    public void update(GameContainer gc, int delta) {

    }

    @Override
    public void render(Graphics graphics) {
    graphics.drawString("I am Homer", 50,50);
    }
}
