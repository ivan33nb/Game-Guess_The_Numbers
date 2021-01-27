package game;

public class GameImplementation {

  public GameImplementation() throws Exception {
    start();
  }

  private void start() throws Exception {
    AnswerReader answerReader = new AnswerReader();
    final int number = NumberGenerator.getRandomNumber();
    boolean isGuessed = false;

    System.out.println("Загадано число от 1 до 100. Попробуйте угадать:");
    while (!isGuessed) {
      int answer;
      try {
        answer = answerReader.readLine();
      } catch (InvalidInputException iie) {
        continue;
      }
      if (answer == number) {
        System.out.println("Вы угадали загаданное число! С победой!");
        isGuessed = true;
      } else if (answer < number) {
        System.out.println("Загаданное число больше чем ваше! Попробуйте еще раз:");
      } else {
        System.out.println("Загаданное число меньше чем ваше! Попробуйте еще раз:");
      }
    }
  }
}
