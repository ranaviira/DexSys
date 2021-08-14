package company;
import java.util.Scanner;

class Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Text text = new Text();
        Groups groups = new Groups();

        while (true) {
            text.printCommand();
            String command = scanner.nextLine();

            if (command.startsWith("add ")) {
                String[] outputPoints = command.split(" "); //разделяем строку на массив
                groups.getPoints(outputPoints);
            }
            else if (command.equals("print")) {
                groups.printAllGroups();
            }
            else if (command.startsWith("print ")) {
                String[] outputGroups = command.split(" ");
                groups.printOutputGroups(outputGroups);
                groups.outputGroupNumbers.clear();
            }
            else if (command.startsWith("remove ")) {
                String[] outputGroups = command.split(" ");
                groups.removeOutputGroups(outputGroups);
                groups.outputGroupNumbers.clear();

            }
            else if (command.equals("clear")) {
                groups.points.clear();
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Память очищена");
            }
            else if (command.equals("help")) {
                text.printHelp();
            }
            else if (command.equals("exit")) {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Выход");
                return;
            }
            else {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Такой команды пока нет");

            }
        }
    }
}



