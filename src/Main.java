public class Main {
    public static void main(String[] args) {
     homeWork1();
     homeWork2();
     homeWork3();
     homeWork4();
    }
    public static void homeWork1 (){
        System.out.println("Задача 1");
        int [] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        double [] number1= {1.57, 7.654, 9.986};
        String [] stroka = {"one", "two", "three", "four"};
        System.out.println();
    }
    public static void homeWork2(){
        System.out.println("Задача 2");
        int [] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        double [] number1= {1.57, 7.654, 9.986};
        String [] stroka = {"one", "two", "three", "four"};
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i] + ", ");
        }

        for (int i = 0; i < number1.length; i++) {
            System.out.println(number1[i] + ", ");
        }

        for (int i = 0; i < stroka.length; i++) {
            System.out.println(stroka[i] + ", ");

        }
        System.out.println();

    }
    public static void homeWork3(){
        System.out.println("Задача 3");
        int [] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        double [] number1= {1.57, 7.654, 9.986};
        String [] stroka = {"one", "two", "three", "four"};
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i] + ", ");
        }
        System.out.println();
        for (int i = number1.length - 1; i >= 0; i--) {
            System.out.print(number1[i] + ", ");
        }
        System.out.println();
        for (int i = stroka.length -1; i>= 0; i--){
            System.out.print(stroka[i]+ ", ");
        }
        System.out.println();
    }
    public static void homeWork4(){
        System.out.println("Задача 4");
        int [] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 1) {
                number[i] = number[i] + 1;
                System.out.println(number[i]);
            }
            System.out.println();

        }
        System.out.println();
    }

}