package Classes;

import java.util.Random;

class Matrix{

    private int[][] data;
    private int rows;
    private int cols;

    //so we can use it in the outer functions
    public int[][] getData(){ return data; }

    public Matrix(int rows, int columns){
        this.rows = rows;
        this.cols = columns;
        this.data = new int[rows][columns];
    }


    public void fillMatrixWithRandom(){
        Random rand = new Random();

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                data[i][j] = rand.nextInt(10);
            }
        }
    }

    public void printSideDiagonal(){
        if(this.rows != this.cols){
            System.out.println("Impossible to show the side diagonal! Matrix isn't square!");
        }else{

            int j = cols - 1;
            for (int i = 0; i < rows; i++){
                if(data[i][j] % 2 == 0){ System.out.print(data[i][j] + " "); }

                j--;
            }
        }

    }

}
