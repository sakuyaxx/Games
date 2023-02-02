package palgames.wintergame;

import org.newdawn.slick.*;

public class HomerActor implements Actor, Observer{

    private Color color;
    private float x, y, speed;

    public HomerActor(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    @Override
    public void update(GameContainer gc, int delta) {
        if (this.x <= 750) {
            this.x+= delta * speed;
        }
        else {
            this.x = 0;
        }
    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(this.color);
        graphics.fillOval(this.x, this.y, 20, 20);
        graphics.setColor(Color.white);
        //System.out.println("hallo");
    }

    public void inform() {
        this.color = Color.green;
    }
}
