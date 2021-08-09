package company;

public class Text {

        void printCommand() {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Программа оперирует координатами точек (парами x, y), которые могут попадать в следующие группы:");
            System.out.println("Группа 1 - точка лежит на или выше линии y=x¹");
            System.out.println("Группа 2 - точка лежит на или выше линии y=x²");
            System.out.println("Группа 3 - точка лежит на или выше линии y=x³");
            System.out.println();
            System.out.println("Выберете команду от 1 до 7");
            System.out.println("1 - Введите в память программы координаты точек парами чисел");
            System.out.println("2 - Печать всех трех групп (с входящими в них точками)");
            System.out.println("3 - Печать группы с входящими в нее точками");
            System.out.println("4 - Удалить из памяти все точки, входящие в группу");
            System.out.println("5 - Очистить память");
            System.out.println("6 - Вывод справки по командам");
            System.out.println("7 - Выход");
            System.out.println("-----------------------------------------------------------------------");
        }

        void printHelp() {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Справка");
            System.out.println("Программа оперирует координатами точек (парами x, y), которые могут попадать в следующие группы:");
            System.out.println("Группа 1 - точка лежит на или выше линии y=x¹");
            System.out.println("Группа 2 - точка лежит на или выше линии y=x²");
            System.out.println("Группа 3 - точка лежит на или выше линии y=x³");
            System.out.println();
            System.out.println("Если нажать - 1");
            System.out.println("Необходимо ввести координаты парами чисел через пробел. Пример 1 1 -2 -3 (2 точки: (1,1) и (-2,-3))");
            System.out.println();
            System.out.println("Если нажать - 2");
            System.out.println("Выводиться печать всех трех групп (с входящими в них точками)");
            System.out.println("Если в группу не попадает ни одна точка, то выводится сообщение, что группа пуста");
            System.out.println();
            System.out.println("Если нажать - 3");
            System.out.println("Выводится печать конкетной группы с входящими в нее точками. Вводим номер группы от 1 до 3");
            System.out.println();
            System.out.println("Если нажать - 4");
            System.out.println("Удаляются из памяти все точки, входящие в группу. Вводим номер группы от 1 до 3");
            System.out.println();
            System.out.println("Если нажать - 5");
            System.out.println("Очистка памяти. Удаляются из памяти все точки");
            System.out.println();
            System.out.println("Если нажать - 6");
            System.out.println("Вывод справки по командам");
            System.out.println();
            System.out.println("Если нажать - 7");
            System.out.println("Выход из программы");
            System.out.println("-----------------------------------------------------------------------");
        }
}

