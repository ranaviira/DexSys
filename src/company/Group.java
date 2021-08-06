package company;
import java.util.ArrayList;

public class Group {

    ArrayList<Integer> list = new ArrayList<>();

    void getArray(String[] numbers) {

            for (int i = 0; i < numbers.length; i++) {
                list.add(Integer.parseInt(numbers[i]));
            }
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Координаты точек успешно введены");
            System.out.println("-----------------------------------------------------------------------");
    }

    void removePoint(int groupNum){
        double point1 = Math.pow(list.get(0), groupNum) - list.get(1); //x¹-y <=0; groupNum = 1 группа   x²-y <=0; 2 группа    x³-y <=0; 3 группа
        double point2 = Math.pow(list.get(2), groupNum) - list.get(3);

        System.out.println("-----------------------------------------------------------------------");
        if (point1 <= 0 && point2 <= 0) {
            list.clear();
            System.out.println("Из группы " + groupNum + " удалены 2 точки");
        }
        else if (point1 <= 0) {
            list.remove(0);
            list.remove(1);
            System.out.println("Из группы " + groupNum + " удалена 1 точка");
        } else if (point2 <= 0) {
            list.remove(2);
            list.remove(3);
            System.out.println("Из группы " + groupNum + " удалена 1 точка");
        } else {
            System.out.println("Нет точек входящих в группу " + groupNum);
        }

    }
    void printGroup(int groupNum) {

        double point1 = Math.pow(list.get(0), groupNum) - list.get(1); //x¹-y <=0; groupNum = 1 группа   x²-y <=0; 2 группа    x³-y <=0; 3 группа
        double point2 = Math.pow(list.get(2), groupNum) - list.get(3);

        System.out.println("-----------------------------------------------------------------------");

        if (point1 <= 0 && point2 <= 0) {
            System.out.println("В группу " + groupNum + " входят 2 точки c координатами (" + list.get(0) + "," + list.get(1) + ")(" + list.get(2) + "," + list.get(3) + ")");
        } else if (point1 <= 0) {
            System.out.println("В группу " + groupNum + " входит 1 точка c координатами (" + list.get(0) + "," + list.get(1) + ")");
        } else if (point2 <= 0) {
            System.out.println("В группу " + groupNum + " входит 1 точка c координатами (" + list.get(2) + "," + list.get(3) + ")");
        } else {
            System.out.println("Группа " + groupNum + " пуста");
        }

    }
}


