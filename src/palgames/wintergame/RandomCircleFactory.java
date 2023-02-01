package palgames.wintergame;

import java.util.Random;

public class RandomCircleFactory {

    public static Actor getRandomActor(){
      Random random = new Random();
      int num = random.nextInt(3);

    if (num == 0) {
        return new CircleActor();
    }
    if (num == 1) {
        return new HomerActor(random.nextInt(600), random.nextInt(600));
    }
    return new CircleActor();
}
}
