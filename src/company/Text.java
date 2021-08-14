package company;

class Text {

        void printCommand() {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Программа оперирует координатами точек (парами x, y), которые могут попадать в следующие группы:");
            System.out.println("Группа 1 - точка лежит на или выше линии y=x¹");
            System.out.println("Группа 2 - точка лежит на или выше линии y=x²");
            System.out.println("Группа 3 - точка лежит на или выше линии y=x³");
            System.out.println();
            System.out.println("help - вывод справки по командам");
            System.out.println("Введите команду");
            System.out.println("-----------------------------------------------------------------------");
        }

        void printHelp() {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Справка по командам");
            System.out.println();
            System.out.println("add - введите координаты парами чисел через пробел. ");
            System.out.println("      пример: add 1 1 -2 -3 (2 точки: (1,1) и (-2,-3))");
            System.out.println();
            System.out.println("print - печать всех трех групп (с входящими в них точками)");
            System.out.println("        если в группу не попадает ни одна точка, то выводится сообщение, что группа пуста");
            System.out.println();
            System.out.println("print <group_num> - печать групп(ы) с входящими в них(нее) точками");
            System.out.println("                    пример: print 3 2");
            System.out.println();
            System.out.println("remove <group_num> - удаление из памяти всех точек, входящих в группу(ы)");
            System.out.println("                     пример: remove 2 1");
            System.out.println();
            System.out.println("clear - очистка памяти, удаление всех точек");
            System.out.println();
            System.out.println("help - вывод справки по командам");
            System.out.println();
            System.out.println("exit - выход из программы");
            System.out.println("-----------------------------------------------------------------------");
        }
}

