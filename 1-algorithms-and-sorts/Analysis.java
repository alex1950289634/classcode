public class Analysis {

    // print every element in an array
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) 
            for (int j = 0; j < 3; j++) {
                System.out.println(arr[i] + " ");
            }
        }
        System.out.println();
    }


    // sum up all elements in an array
    

    // see if an array contains any duplicates
    public boolean containsDuplicates(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {

    }
}