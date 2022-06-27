import java.util.*;

public class matrix {
    public static void main(String[]args){
        //String variable to get in and out of loop
        String response ="yes";

        //Creates a Scanner object to take user input
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter matrix dimensions?");
        int dimensions= scan.nextInt();

        //checks if dimensions are greater than 1 if not new value will be asked
        if (dimensions<1){
            System.out.println("Please re-enter matrix dimension value");
            dimensions= scan.nextInt();
        }

        do {
            //takes execution time during execution of the method
            Long start= System.currentTimeMillis();
            ArrayList<Integer>Time= new ArrayList();
            for(int i =0;i<10000;i++){
                Time.add(i);
            }

            //creates  random variables 0-50 to go in both matrix's
            Random random = new Random();

            int[][]matrix1= new int[dimensions][dimensions];
            int[][]matrix2= new int[dimensions][dimensions];

                //fills first matrix then prints it out
            System.out.println("Matrix 1 is as follows: " );
            for(int i=0;i< matrix1.length;i++) {
                System.out.print("[");
                for (int j = 0; j < matrix1.length; j++) {
                    matrix1[i][j] = random.nextInt(50);

                    System.out.print(matrix1[i][j]+"\t");
                }
                System.out.print("]");
                System.out.print("\n");
            }

            //fills Second matrix then prints it out
            System.out.println("Matrix 2 is as follows: ");
                for( int i= 0;i< matrix2.length;i++) {
                    System.out.print("[");
                    for (int j = 0; j < matrix2.length; j++) {
                        matrix2[i][j] = random.nextInt(50);
                        System.out.print(matrix2[i][j]+"\t");
                    }
                    System.out.print("]");
                    System.out.print("\n");
                }

                //method to multiply both matrices
                multiply(matrix1,matrix2,dimensions);

                System.out.println();
                //prints total execution time
            long end= System.currentTimeMillis();
            System.out.println("Total execution time= "+ (end-start)+ "ms");

                //Checks user input response if you want to continue or not
                System.out.println("Would you like to continue: Yes or no");
                response= scan.next();

            }while(response.charAt(0)=='y' || response.charAt(0)=='Y');
        }





        
        public static void multiply(int[][]matrix1,int[][]matrix2,int dimensions){
        int matrix3[][]=new int[dimensions][dimensions];

        System.out.println("Result Matrix is as follows: ");
            //Fills result matrix3 with product of matrix 1 and matrix 2 values then prints it

        for(int i=0;i<matrix1.length;i++){
            System.out.print("[");
            for(int j=0;j<matrix2.length;j++){
                matrix3[i][j]=matrix1[i][j]*matrix2[i][j];
                System.out.print(matrix3[i][j]+"\t");
            }
            System.out.print("]");
            System.out.print(" \n");
        }


        }
}
