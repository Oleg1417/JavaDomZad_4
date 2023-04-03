import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// В калькулятор добавьте возможность отменить последнюю операцию.

public class Task3 {

    public class laCalculatrice {

        private static final Logger logger = Logger.getLogger(laCalculatrice.class.getName());

        public static void main(String[] args) throws Exception {

            Handler fHandler = new FileHandler("Calculator.txt");
            logger.addHandler(fHandler);
            SimpleFormatter sFormat = new SimpleFormatter();
            fHandler.setFormatter(sFormat);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Salut! Введите первое число: ");
            double first = scanner.nextDouble();
            calculations(first, 0.0);
            scanner.close();
        }

        public static void calculations(Double first, Double back) throws Exception {
            back = first;
            Double res = 0.0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Выберете оператор:\n1:'+'/\n2: '-'\n3: '*'\n4: '/'\n");
            int operator = scanner.nextInt();
            if (operator < 1 || operator > 4) {
                System.out.println("ошибка, такого оператара нет. bonne journée");
                System.exit(0);
            }
            System.out.println("Введите второе число: ");
            Double second = scanner.nextDouble();
            switch (operator) {
                case 1:
                    res = first + second;
                    System.out.print(first + " + " + second + " = ");
                    logger.info(
                            Double.toString(first) + " + " + Double.toString(second) + " = " + Double.toString(res));
                    break;
                case 2:
                    res = first - second;
                    System.out.print(first + " - " + second + " = ");
                    logger.info(
                            Double.toString(first) + " - " + Double.toString(second) + " = " + Double.toString(res));
                    break;
                case 3:
                    res = first * second;
                    System.out.print(first + " * " + second + " = ");
                    logger.info(
                            Double.toString(first) + " * " + Double.toString(second) + " = " + Double.toString(res));
                    break;
                case 4:
                    res = first / second;
                    System.out.print(first + " / " + second + " = ");
                    logger.info(
                            Double.toString(first) + " / " + Double.toString(second) + " = " + Double.toString(res));
                    break;
            }
            System.out.println(res);
            whatNext(res, back);
            scanner.close();
        }

        public static void whatNext(Double shien, Double back) throws Exception {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1: продолжить\n2: отменить последнюю операцию\n3: выход\n");
            int chat = scanner.nextInt();
            switch (chat) {
                case 1:
                    calculations(shien, 0.0);
                    break;
                case 2:
                    System.out.println("ваше число снова " + back);
                    whatNext(back, 0.0);
                    break;
                case 3:
                    System.out.println("Au revoir");
                    System.exit(0);
                    break;
            }
            scanner.close();
        }
    }
}
