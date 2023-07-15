// Sample showing while loop

public class While {

    public static void main(String args[]) {
        int r = 1;
        
        while (r < 100) {
            System.out.println(r);
            r++;
        }
    
        System.out.println();

        r = 50;
        while (r > 0) {
            System.out.print(r + " ");
            r -= 5;
        }
    }
}
