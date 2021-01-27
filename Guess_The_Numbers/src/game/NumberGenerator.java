package game;

import java.util.Random;

public class NumberGenerator {

  public static int getRandomNumber() {
    return new Random().nextInt(101);
  }
}
