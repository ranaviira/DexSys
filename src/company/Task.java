package company;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Text text = new Text();
        Group numb = new Group();

        while (true) {

            text.printCommand();
            int commmand = scanner.nextInt();

            if (commmand == 1) {

                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Введите в память программы координаты точек через пробел");
                System.out.println("Пример 1 -9 2 3");
                System.out.println("-----------------------------------------------------------------------");

                Scanner pointScanner = new Scanner(System.in);
                String addPoint = pointScanner.nextLine();
                String[] numbers = addPoint.split(" ");

                numb.getArray(numbers);

            }
            else if (commmand == 2) {
                numb.printGroup(1);
                numb.printGroup(2);
                numb.printGroup(3);
            }

            else if (commmand == 3) {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Введите номер группы от 1 до 3");
                System.out.println("-----------------------------------------------------------------------");
                int inputGroup = scanner.nextInt();

                numb.printGroup(inputGroup);

            }
            else if (commmand == 4) {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Введите номер группы от 1 до 3");
                System.out.println("-----------------------------------------------------------------------");
                int inputGroup = scanner.nextInt();

                numb.removePoint(inputGroup);

                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Точки, входящие в группу" + inputGroup + ", удалены");
                System.out.println("-----------------------------------------------------------------------");
            }

            else if (commmand == 5) {
                numb.list.clear();
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Память очищена");
                System.out.println("-----------------------------------------------------------------------");
            }
            else if (commmand == 6) {
                text.printHelp();
            }
            else if (commmand == 7) {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Выход");
                System.out.println("-----------------------------------------------------------------------");
                return;
            }
            else {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Такой команды пока нет. Выберете команду от 1 до 7");}
                System.out.println("-----------------------------------------------------------------------");

        }
    }
}



