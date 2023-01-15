public class Main {
    public static void main(String[] args) {

    FindNum findNum = new FindNum();

    findNum.findNumeric();
    System.out.println("Минимальное число в массиве: " + findNum.getMinNum());
    System.out.println("Индекс минимального числа в массиве: " + findNum.getPosNum());
    }
}