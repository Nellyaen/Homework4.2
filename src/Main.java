public class Main {
    public static void main(String[] args) {
        //task 1
        int age = 40;
        if (age >= 2 && age <= 6) {
            System.out.println(" Если человеку " + age + " ходит в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если человеку " + age + " ходит в школу");
        } else if (age >=18 && age <=24) {
            System.out.println("Если человеку " + age + " его место в университете");
        } else if (age >24);{
            System.out.println ("Если человеку " +age+ " ему пора идти работать");
        }

        //task 2
        int limitage=25;
        if (limitage <5) {
            System.out.println("Если ребенку " + limitage + " не может кататься на атракционе");
        } else if (limitage >=5 && limitage <=14) {
            System.out.println ("Если ребенку " + limitage +  " может кататься с сопровожденеием");
        } else if (limitage >14) {
            System.out.println("Если ребенку " + limitage + " может кататься без сопровождения");
        }

        //task 3
        int one =3;
        int two =5;
        int free =0;
        if (one>two) {
            System.out.println("Тогда " + one + " меньше");
        } else if (one<two){
            System.out.println ("Тогда " + two + " больше");
        } else if (two>free) {
            System.out.println ("Тогда " +two+" самое большое число");
        }
        }



        }




