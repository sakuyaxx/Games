package palgames.wintergame;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class HomerActor implements Actor, Observer{

    private float x, y, speed;

    public HomerActor(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    private Color color;
    @Override
    public void update(GameContainer gc, int delta) {
        if (this.x <= 1000) {
            this.x+= delta * speed;
        }
        else {
            this.x = 0;
        }
    }

    @Override
    public void render(Graphics graphics) {
    graphics.fillOval(this.x, this.y, 20, 20);
    graphics.setColor(Color.white);
    }

    public void inform() {
        this.color = Color.orange;
    }
}
