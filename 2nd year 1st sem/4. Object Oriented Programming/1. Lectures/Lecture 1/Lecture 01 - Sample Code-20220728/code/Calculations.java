// This program demos use of Calculations


public class Calculations {
   public static void main(String args[]) {

      int no = 50;
      long population = 70000000;
      double salary = 4500.34;
      float radius = 30.0f;

      int remainder = no % 3;
      double contribution = population * 100;
      double area = 22.0/7*radius*radius;

      System.out.println("Remainder " + remainder);
      System.out.println("If everyone in the world gave 100 ruppees, the total contribution " + contribution);
      System.out.println("Area of Circle " + area);
   }
}
