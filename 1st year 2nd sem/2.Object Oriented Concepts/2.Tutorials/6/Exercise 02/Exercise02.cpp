#include <iostream>
using namespace std;
#include "Box.h"

int main() {
   Box box1;
   int height, length, width;
   cout << "Enter the Height of the Box : ";
   cin >> height;
   cout << "Enter the Length of the Box : ";
   cin >> length;
   cout << "Enter the width of the Box : ";
   cin >> width;
   // ===========================================
   box1.setHeight(height);
   box1.setLength(length);
   box1.setWidth(width);
  
   // === DO NOT CHANGE THE OUTPUT =============
   cout << "Box Height " << box1.getHeight() << endl;
   cout << "Box Length " << box1.getLength() << endl;
   cout << "Box Width " << box1.getWidth() << endl;
   cout << "Volume of Box is " << box1.calcVolume() << endl;
   // ==========================================
      return 0;
}
