package company;
import java.util.ArrayList;

public class Group {

    ArrayList<Integer> list = new ArrayList<>();

    void getArray(String[] numbers) {

            for (int i = 0; i < numbers.length; ++i) {
                list.add(Integer.parseInt(numbers[i]));
            }
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Координаты точек успешно введены");
            System.out.println("-----------------------------------------------------------------------");
    }

    void removePoint(int num){
        double a1 = Math.pow(list.get(0), num) - list.get(1); //x¹-y <=0; 1 группа   x²-y <=0; 2 группа    x³-y <=0; 3 группа
        double a2 = Math.pow(list.get(2), num) - list.get(3);

        System.out.println("-----------------------------------------------------------------------");
        if (a1 <= 0 && a2 <= 0) {
            list.clear();
            System.out.println("Из группы " + num + " удалены 2 точки");
        }
        else if (a1 <= 0) {
            list.remove(0);
            list.remove(1);
            System.out.println("Из группы " + num + " удалена 1 точки");
        } else if (a2 <= 0) {
            list.remove(2);
            list.remove(3);
            System.out.println("Из группы " + num + " удалена 1 точки");
        } else {
            System.out.println("Нет точек входящих в группу " + num);
        }
        System.out.println("-----------------------------------------------------------------------");
    }
    void printGroup(int num) {

        double a1 = Math.pow(list.get(0), num) - list.get(1); //x¹-y <=0; 1 группа   x²-y <=0; 2 группа    x³-y <=0; 3 группа
        double a2 = Math.pow(list.get(2), num) - list.get(3);
        System.out.println("-----------------------------------------------------------------------");

        if (a1 <= 0 && a2 <= 0) {
            System.out.println("В группу " + num + " входят 2 точки c координатами (" + list.get(0) + "," + list.get(1) + ")(" + list.get(2) + "," + list.get(3) + ")");
        } else if (a1 <= 0) {
            System.out.println("В группу " + num + " входит 1 точка c координатами (" + list.get(0) + "," + list.get(1) + ")");
        } else if (a2 <= 0) {
            System.out.println("В группу " + num + " входит 1 точка c координатами (" + list.get(2) + "," + list.get(3) + ")");
        } else {
            System.out.println("Группа " + num + " пуста");
        }
        System.out.println("-----------------------------------------------------------------------");


    }
}


