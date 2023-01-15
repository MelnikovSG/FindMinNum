public class CreateArray {

    public int[] CreateArr(){
        int[] arr = new int[20];

        for(int i = 0; i < arr.length; i++){
            arr[i] = ((int)(Math.random() * 51));
        }
        return arr;
    }
}
