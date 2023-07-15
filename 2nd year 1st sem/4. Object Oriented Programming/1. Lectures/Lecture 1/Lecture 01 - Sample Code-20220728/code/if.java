// Sample showing if condition

public class If {

    public static void main(String args[]) {
    
        int opt;

        System.out.println("==== MENU ====");
        System.out.println("1. Malabe");
        System.out.println("2. Colombo");
        System.out.println("3. Matara");
        System.out.println("4. Kandy");
        System.out.println("5. Kurunagala");
        System.out.println("6. Jaffna");
        System.out.println("0. Exit");

        opt = 5;
        System.out.print("Option : ");
        System.out.println(opt);

        if (opt == 1)
            System.out.println("Malabe Campus");
        else if (opt == 2)
            System.out.println("Metro Campus");
        else if (opt == 3)
            System.out.println("Matara Centre");
        else if (opt == 4)
            System.out.println("Kandy Centre");
        else if (opt == 5)
            System.out.println("Kurunagala Centre");
        else if (opt == 6)
            System.out.println("Jaffna Centre");
        else
            System.out.println("You have selected Exit");
       
          
    }
}
