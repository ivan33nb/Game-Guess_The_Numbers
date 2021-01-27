package game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnswerReader {

  private static final String TRY_MORE_MSG = "Попробуйте еще раз!";
  private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

  public int readLine() throws IOException {
    String input = reader.readLine();

    if (isInputValid(input)) {
      return Integer.parseInt(input);
    } else {
      throw new InvalidInputException();
    }
  }

  private boolean isInputValid(String input) {
    boolean isValid = true;
    int number;

    try {
      number = Integer.parseInt(input);
      if (number > 100) {
        isValid = false;
        System.out.println(
            "Вы ввели слишком большое число! (Максимальное число для ввода - 100). "
                + TRY_MORE_MSG);
      }
      if (number < 0) {
        isValid = false;
        System.out.println(
            "Вы ввели слишком маленькое число! (Минимально число для ввода - 0). " + TRY_MORE_MSG);
      }

    } catch (NumberFormatException nfe) {
      isValid = false;
      System.out.println("То что вы ввели не является числом! " + TRY_MORE_MSG);
    }
    return isValid;
  }
}
