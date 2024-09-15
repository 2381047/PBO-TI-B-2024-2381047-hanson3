package hanson2;

public class DoWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (1 % 2 == 0) {
                System.out.println(i + " ");
            }
            i++;
        }while (i <= 20);
    }
}
