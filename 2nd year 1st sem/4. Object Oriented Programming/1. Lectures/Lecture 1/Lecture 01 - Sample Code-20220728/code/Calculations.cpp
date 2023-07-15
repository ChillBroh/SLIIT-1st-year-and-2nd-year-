// This program demos use of simple variables

#include <iostream>
using namespace std;

int main() {

   int no = 50;
   long population = 70000000;
   double salary = 4500.34;
   float radius = 30.0f;

   int remainder = no % 3;
   double contribution = population * 100;
   double area = 22.0/7*radius*radius;

   cout << "Remainder " << remainder << endl;
   cout << "If everyone in the world gave 100 ruppees, the total contribution " 
        << contribution << endl;
   cout << "Area of Circle " << area << endl;
   
   return 0;
}
