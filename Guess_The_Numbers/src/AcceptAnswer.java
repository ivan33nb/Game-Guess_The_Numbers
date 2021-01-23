import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AcceptAnswer {
    private int i;
    private boolean b;

    public AcceptAnswer() throws Exception {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число: ");

        while (!b) {
            try {
                i = Integer.parseInt(buf.readLine());
                b = true;

                if (i > 100) {
                    System.out.println("Вы ввели слишком большое число! (Максимальное число для ввода - 100)");
                    System.out.println("Попробуйте еще раз!");
                    b = false;
                } else if (i < 0) {
                    System.out.println("Вы ввели слишком маленькое число! (Минимально число для ввода - 0)");
                    System.out.println("Попробуйте еще раз!");
                    b = false;
                }


            } catch (NumberFormatException e) {
                System.out.println("То что вы ввели не является числом! Попробуйте еще раз!");
                System.out.println("Введите число: ");
                b = false;
            }
        }

    }

    public int getI() {
        return i;
    }
}
