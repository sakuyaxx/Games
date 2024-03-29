package palgames.wintergame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class CircleActor implements Actor{

    public MoveStrategy moveStrategy;

    public CircleActor(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    @Override
    public void update(GameContainer gc, int delta) {
        moveStrategy.update(delta);
    }

    public void render(Graphics graphics){
        graphics.drawOval(this.moveStrategy.getX(), this.moveStrategy.getY(), 20, 20);
    }

}
