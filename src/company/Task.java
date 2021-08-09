package company;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Text text = new Text();
        Group numb = new Group();

        while (true) {

            text.printCommand();

            int command = scanner.nextInt();

            if (command == 1) {

                System.out.println("Введите в память программы координаты двух точек через пробел");
                System.out.println("Пример 1 -9 2 3");
                System.out.println("-----------------------------------------------------------------------");

                Scanner pointScanner = new Scanner(System.in);
                String addPoint = pointScanner.nextLine();
                String[] numbers = addPoint.split(" ");

                numb.getPoint(numbers);

            }
            else if (command == 2) {
                numb.printGroup(1);
                numb.printGroup(2);
                numb.printGroup(3);
            }
            else if (command == 3) {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Введите номер группы от 1 до 3");

                int inputGroup = scanner.nextInt();

                if (inputGroup > 0 && inputGroup <=3) {
                    numb.printGroup(inputGroup);
                }
                else {
                    System.out.println("-----------------------------------------------------------------------");
                    System.out.println("Введите номер группы от 1 до 3");
                }

            }
            else if (command == 4) {

                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Введите номер группы от 1 до 3");

                int inputGroup = scanner.nextInt();

                if (inputGroup > 0 && inputGroup <=3) {
                    numb.removePoint(inputGroup);
                }
                else {
                    System.out.println("-----------------------------------------------------------------------");
                    System.out.println("Введите номер группы от 1 до 3");
                }

            }
            else if (command == 5) {
                numb.list.clear();
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Память очищена");
                System.out.println("-----------------------------------------------------------------------");
            }
            else if (command == 6) {
                text.printHelp();
            }
            else if (command == 7) {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Выход");
                System.out.println("-----------------------------------------------------------------------");
                return;
            }
            else {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Такой команды пока нет. Выберете команду от 1 до 7");
                System.out.println("-----------------------------------------------------------------------");
            }
        }
    }
}



