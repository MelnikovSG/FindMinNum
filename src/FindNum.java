import java.util.Arrays;

public class FindNum {

    private CreateArray _createArray = new CreateArray();
    private SortArray _sortArray = new SortArray();

    private int[] _firstArr = _createArray.CreateArr();
    private int[] _secondArr = Arrays.copyOf(_firstArr, _firstArr.length);

    private int minNum;
    private int posNum;
    public void findNumeric(){
        System.out.println(Arrays.toString(_firstArr));

        _sortArray.sortArr(_secondArr);

        System.out.println(Arrays.toString(_secondArr));

        for(int i = 0; i < _firstArr.length; i++){
            if(_secondArr[0] == _firstArr[i]){
                minNum = _secondArr[0];
                posNum = i;
            }
        }
    }

    public int getMinNum() {
        return minNum;
    }

    public int getPosNum() {
        return posNum;
    }
}
