package assignment1;
public class QueFour {
    public static void main(String[] args) {
       int[][] arr= {{1, 2, 3}, {4, 5, 6}};
       int row_sum=0;
       int column_sum=0;
        //Sum of rows
       for(int i=0; i<arr.length; i++){
           row_sum=0;
           for(int j=0; j<arr.length+1; j++)
           {
               row_sum = row_sum+arr[i][j];
           }
           System.out.println("Row sum: "+row_sum);
       }
        //sum of columns
        for(int i=0; i<arr.length+1 ; i++){
            column_sum=0;
            for(int j=0; j<arr.length; j++)
            {
                column_sum = column_sum+arr[j][i];
            }
            System.out.println("Column sum: "+column_sum);
        }
    }
}
