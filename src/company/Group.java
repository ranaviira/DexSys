package company;
import java.util.ArrayList;

class Groups {

    ArrayList<Integer> points = new ArrayList<>();   //массив для точек
    final private ArrayList<Integer> constantGroups = new ArrayList<>(); //массив для групп, константа
    {   constantGroups.add(1);
        constantGroups.add(2);
        constantGroups.add(3);
    }
    ArrayList<Integer> outputGroupNumbers = new ArrayList<>();  // массив для вводимых групп

    void getPoints(String[] numbers) {  //метод, заносим координаты в массив
        try {
            for (int i = 1; i < numbers.length; i++) {
                points.add(Integer.parseInt(numbers[i]));
            }
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Координаты точек успешно введены");
        } catch (NumberFormatException inputError) {  //ловим NumberFormatException если введены не цифры
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Координаты точек введены некорректно, введите заново");
            points.clear();
        }
    }

    void printAllGroups() {  //печать всех групп с входями точками
        for (int i = 0; i < constantGroups.size(); i++) {
            printGroup(constantGroups.get(i));
        }
    }

    void printOutputGroups(String[] outputGroups) { // печать введеных групп

        try {
            for (int i = 1; i < outputGroups.length; i++) {  //добавляем в массив
                outputGroupNumbers.add(Integer.parseInt(outputGroups[i]));
            }
        } catch (NumberFormatException inputError) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Группы введены некорректно, введите заново");
            outputGroupNumbers.clear();
        }

        for (int i = 0; i < outputGroupNumbers.size(); i++) {
            if (constantGroups.contains(outputGroupNumbers.get(i))) {  //сравниваем с константой
                printGroup(outputGroupNumbers.get(i));
            }
        }
    }

    void printGroup(int groupNum) { //печать x¹-y <=0; groupNum (номер группы совпадает со степенью) = 1 группа  x²-y <=0; 2 группа    x³-y <=0; 3 группа
        if (points.size() == 4) {
            double point1 = Math.pow(points.get(0), groupNum) - points.get(1);
            double point2 = Math.pow(points.get(2), groupNum) - points.get(3);

            System.out.println("-----------------------------------------------------------------------");

            if (point1 <= 0 && point2 <= 0) {
                System.out.println("В группу " + groupNum + " входят 2 точки c координатами (" + points.get(0) + "," + points.get(1) + ")(" + points.get(2) + "," + points.get(3) + ")");
            } else if (point1 <= 0) {
                System.out.println("В группу " + groupNum + " входит 1 точка c координатами (" + points.get(0) + "," + points.get(1) + ")");
            } else if (point2 <= 0) {
                System.out.println("В группу " + groupNum + " входит 1 точка c координатами (" + points.get(2) + "," + points.get(3) + ")");
            } else {
                System.out.println("Группа " + groupNum + " пуста");
            }

        } else if (points.size() > 0) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Данных больше или меньше чем нужно. Выполните очистку памяти и введите координаты");
        } else {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Введите в память программы координаты");
        }
    }

    void removeOutputGroups(String[] group) {  //удаление точек входящих в группы

        try {
            for (int i = 1; i < group.length; i++) {
                outputGroupNumbers.add(Integer.parseInt(group[i]));
            }
        } catch (NumberFormatException inputError) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Группы введены некорректно, введите заново");
            outputGroupNumbers.clear();
        }

        for (int i = 0; i < outputGroupNumbers.size(); i++) {
            if (constantGroups.contains(outputGroupNumbers.get(i))) {
                removePoints(outputGroupNumbers.get(i));
            }
        }

    }

    void removePoints(int groupNum) {

        if (points.size() == 4) {
            double point1 = Math.pow(points.get(0), groupNum) - points.get(1);
            double point2 = Math.pow(points.get(2), groupNum) - points.get(3);

            System.out.println("-----------------------------------------------------------------------");
            if (point1 <= 0 && point2 <= 0) {
                System.out.println("Точки с координатами (" + points.get(0) + "," + points.get(1) + ")(" + points.get(2) + "," + points.get(3) + ") удалены из памяти");
                points.clear();
            }
            else if (point2 <= 0) {
                System.out.println("Точка с координатами (" + points.get(2) + "," + points.get(3) + ") удалена из памяти");
                points.remove(3);
                points.remove(2);

            }
            else if (point1 <= 0) {
                System.out.println("Точка с координатами (" + points.get(1) + "," + points.get(0) + ") удалена из памяти");
                points.remove(1);
                points.remove(0);
            }
        }
        else if (points.size() == 2) {

            double point1 = Math.pow(points.get(0), groupNum) - points.get(1);
            if (point1 <= 0) {
                System.out.println("Точка c координатами (" + points.get(0) + "," + points.get(1) + ") удалена из памяти");
                points.remove(1);
                points.remove(0);
            }
        }
        else {
            System.out.println("Нет точек для удаления");
        }
    }
}


