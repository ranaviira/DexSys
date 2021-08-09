package company;
import java.util.ArrayList;

public class Group {

    ArrayList<Integer> list = new ArrayList<>();

    void getPoint(String[] numbers) {

            for (int i = 0; i < numbers.length; i++) {
                list.add(Integer.parseInt(numbers[i]));
            }
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Координаты точек успешно введены");
    }

    void removePoint(int groupNum){
        if(list.size() == 4) {
            double point1 = Math.pow(list.get(0), groupNum) - list.get(1); //x¹-y <=0; groupNum (номер группы совпадает со степенью) = 1 группа  x²-y <=0; 2 группа    x³-y <=0; 3 группа
            double point2 = Math.pow(list.get(2), groupNum) - list.get(3);

            System.out.println("-----------------------------------------------------------------------");
            if (point1 <= 0 && point2 <= 0) {
                list.clear();
                System.out.println("Удалены координаты 2-х точкек входящие в группу " + groupNum);
            } else if (point1 <= 0) {
                list.remove(1);
                list.remove(0);
                System.out.println("Удалены координаты 1-ой точки входящей в группу " + groupNum);
            } else if (point2 <= 0) {
                list.remove(3);
                list.remove(2);

                System.out.println("Удалены координаты 1-ой точки входящей в группу " + groupNum);
            } else {
                System.out.println("Нет точек входящих в группу " + groupNum);
            }
        }
        else {
            System.out.println("Выполните очистку памяти");
        }


    }
    void printGroup(int groupNum) {

        if(list.size() == 4) {
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
        else if(list.size() > 0){
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Данных больше или меньше чем нужно. Выполните очистку памяти и введите координаты");
        }
        else{
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Введите в память программы координаты");
        }
    }
}


