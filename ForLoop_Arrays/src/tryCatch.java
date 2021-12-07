public class tryCatch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        try {
            System.out.println(array[5]);
        }
        catch (Exception e){
            System.out.println("Error Occurred \n"+e);
        }

        //default values
        int[] intArray = new int[2];
        System.out.println("Default value of Int array : " + intArray[1]);
        String[] stringArray = new String[2];
        System.out.println("Default value of String array : " + stringArray[1]);
        double[] floatArray = new double[2];
        System.out.println("Default value of Double array : " + floatArray[1]);
        boolean[] booleanArray = new boolean[2];
        System.out.println("Default value of Boolean array : " + booleanArray[1]);
    }
}
