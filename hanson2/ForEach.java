package hanson2;

public class ForEach {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        for (int i = 0; i < 20; i++){
            numbers[i] = i + 1;
        }
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number + " ");


            }
        }
    }
}
