public class SortArray {
    public int[] sortArr(int[] arr){

        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for(int i = 1; i < arr.length; i++){
                if(arr[i] < arr[i-1]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    isSorted = false;
                }
            }
        }
        return arr;
    }
}
