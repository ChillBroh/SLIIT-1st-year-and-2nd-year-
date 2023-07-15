// Sample showing while loop

public class DoWhile {

    public static void main(String args[]) {
        int r = 1;      
        do {
            System.out.println(r);
            r++;
        } while (r < 100);
        System.out.println();
        r = 50;
        do {
            System.out.print(r + " ");
            r -= 5;
        } while (r > 0);
    }
}
