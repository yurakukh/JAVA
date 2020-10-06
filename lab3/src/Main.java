import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
//
//        toUpperCase(myList);
//
//        //- - - - - - - - - -
//
//        int[] numbers = null;
//        int n = 13;
//
//        System.out.println("Avarage of odds: ");
//        System.out.println(fillAndFindAvarage(numbers, n));


        toUpperCaseChars("hsdf4issaddfjklmwasdnoprst");

    }

    //First task
    static void toUpperCase(List<String> list){

        list.stream()
                .filter(s -> s.contains("c"))
                .forEach(s -> System.out.println(s.toUpperCase()));

    }


    //Second task
    static double fillAndFindAvarage(int[] arr, int size){

        arr = new int[size];

        Random rand = new Random();
        for (int i = 0; i < size; i++){
            arr[i] = rand.nextInt(9);
        }

        double avg = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .average()
                .getAsDouble();

        return avg;
    }

    //Third task
    //in ASCII chars from 'h' to 't' are in this range: [104 - 116]

    static String toUpperCaseChars(String str){


        char[] strChar = str.toCharArray();
        for(int i = 0; i < strChar.length; i++){
            if( (int)strChar[i] >= 104 && (int)strChar[i] <= 116){
                strChar[i] = Character.toUpperCase(strChar[i]);

            }

            System.out.print(strChar[i]);

        }


        str = strChar.toString();
        return str;
    }


}
