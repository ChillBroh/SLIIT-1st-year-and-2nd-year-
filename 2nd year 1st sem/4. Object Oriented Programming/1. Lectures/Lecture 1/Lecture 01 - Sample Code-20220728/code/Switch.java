// Sample showing switch condition

public class Switch {

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

        opt = -5;

        System.out.print("Option : ");
        System.out.println(opt);

        switch (opt) {
            case 1 : System.out.println("Malabe Campus");
                     break;
            case 2 : System.out.println("Metro Campus");
                     break;
            case 3 : System.out.println("Matara Centre");
                     break;        
            case 4 : System.out.println("Kandy Centre");
                     break; 
            case 5 : System.out.println("Kurunagala Centre");
                     break;  
            case 6 :
                     System.out.println("Jaffna Centre");
                     break;
            default:
                     System.out.println("You have selected Exit");
       }          
    }
}
