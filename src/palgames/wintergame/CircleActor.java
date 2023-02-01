package palgames.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class CircleActor implements Actor{
    private double x,y;

    public CircleActor(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    public void update(GameContainer gc, int delta){
        if(this.y <= 600){
            this.y++; //snowflake effect
        }
        else{
            this.y = 0;
        }
    }

    public void render(Graphics graphics){
        graphics.drawOval((float)this.x, (float)this.y, 20, 20);
    }
}
