

public class Main {
    public static void main(String[] args) {

        int[] numbers = {6,10,0,5,12,35,22,9,8,52,76};
        int sum = 0;
        Double average;
        for (int number: numbers){
            sum += number;
        }
        int arryLength = numbers.length;
        average = ((double)sum/(double)arryLength);
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+average);
    }
}