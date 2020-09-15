package Classes;

public class Main {

    public static void main(String[] args) {

        Matrix m = new Matrix(3, 3);
        m.fillMatrixWithRandom();

        System.out.println("Your matrix:");
        printArray(m.getData());

        System.out.println("Side diagonal(even numbers only): ");
        m.printSideDiagonal();

    }


    private static void printArray(int[][] arr){

        int rows = arr.length;
        int columns = arr[0].length;

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private int[] fillArray(int begin, int end, int step){
        //size of the array
        int size = end / step + 1;

        int[] arr = new int[size];

        for (int i = 0; i < size; i++){
            arr[i] = begin;

            begin += step;
        }

        return arr;
    }

}



