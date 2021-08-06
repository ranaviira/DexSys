package company;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Text text = new Text();
        Group num = new Group();

        while (true) {

            text.printCommand();
            int com = scanner.nextInt();

            if (com == 1) {

                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Введите команду add и координаты через пробел");
                System.out.println("Пример add 1 -9 2 3");
                System.out.println("-----------------------------------------------------------------------");

                Scanner pointScanner = new Scanner(System.in);
                String line = pointScanner.nextLine();
                String[] numbers = line.split(" ");

                num.getArray(numbers);

            }
            else if (com == 2) {
                num.printGroup(1);
                num.printGroup(2);
                num.printGroup(3);
            }

            else if (com == 3) {
                System.out.println("Введите группу от 1 до 3");
                int com1 = scanner.nextInt();

                num.printGroup(com1);

            }
            else if (com == 4) {
                System.out.println("Введите группу от 1 до 3");
                int com2 = scanner.nextInt();
                num.removePoint(com2);

                System.out.println("-----------------------------------------------------------------------");
                System.out.println("удалить из памяти все точки, входящие в группу(ы) <group_num>");
                System.out.println("-----------------------------------------------------------------------");
            }

            else if (com == 5) {
                num.list.clear();
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Память очищена");
                System.out.println("-----------------------------------------------------------------------");
            }
            else if (com == 6) {
                text.printHelp();
            }
            else if (com == 7) {
                System.out.println("Выход");
                return;
            }
            else {System.out.println("Такой команды пока нет");}

        }
    }
}



