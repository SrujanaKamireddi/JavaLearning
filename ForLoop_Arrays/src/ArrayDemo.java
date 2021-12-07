public class ArrayDemo {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        //printing array elements
        for(int item : array){
            System.out.println(item);
        }

        //initialize an array
        String[] stringArray = new String[4];

        //multidimensional array
        int[][] matrix ={
                {1,0,1},
                {1,3,4},
                {1,5,6}
        };
        for (int row = 0; row< matrix.length; row++){
            for(int col =0; col<matrix[row].length; col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }

    }
}
