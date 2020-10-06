import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        toUpperCase(myList);

        //- - - - - - - - - -

        int[] numbers = null;
        int n = 13;

        System.out.println("Avarage of odds: ");
        System.out.println(fillAndFindAvarage(numbers, n));

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


}
