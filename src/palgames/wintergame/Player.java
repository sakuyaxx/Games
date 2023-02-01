package palgames.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;

public class Player implements Actor{

    private float x,y,speed;
    private HomerActor homerActor;

    public Player(){
        this.x = 300;
        this.y = 300;
        this.speed = 1f;
    }

    public void setHomerActor(HomerActor homerActor) {
        this.homerActor = homerActor;
    }

    @Override
    public void update(GameContainer gc, int delta) {
        if (gc.getInput().isKeyDown(Input.KEY_LEFT)) {
            this.x -= (float) delta * speed;
        }
        if (gc.getInput().isKeyDown(Input.KEY_RIGHT)) {
            this.x += delta * speed;
        }
        if (this.x > 700) {
            this.homerActor.inform();
        }
    }

    @Override
    public void render(Graphics graphics) {
        graphics.fillRect(this.x, this.y, 50, 50);
    }
}
