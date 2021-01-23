public class GameImplementation {
    private boolean b;

    public GameImplementation() throws Exception {
        gameImplementation();
    }

    private void gameImplementation() throws Exception {
        CreatedNumbers createdNumbers = new CreatedNumbers();

        while (!b) {
            AcceptAnswer acceptAnswer = new AcceptAnswer();
            if (acceptAnswer.getI() == createdNumbers.getI()) {
                System.out.println("Вы угадали загаданное число! С победой!");
                b = true;
            } else if (acceptAnswer.getI() < createdNumbers.getI()) {
                System.out.println("Загаданное число больше чем ваше!");
                System.out.println("Попробуйте еще раз!");
                b = false;
            } else if (acceptAnswer.getI() > createdNumbers.getI()) {
                System.out.println("Загаданное число меньше чем ваше!");
                System.out.println("Попробуйте еще раз!");
                b = false;
            }
        }
    }
}
