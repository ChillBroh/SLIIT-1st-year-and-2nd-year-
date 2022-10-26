#include "Circle.h"
#include <iostream>
using namespace std;

// Default Constructor Implementation
Circle::Circle() {
    radius = 0;
}
// Overloaded Constructor Implementation
Circle::Circle(int r) {
  radius = r;
}
// Destructor Implementation
Circle::~Circle() {
  cout << "Circle Destructor called" << endl;
}
void Circle::display() {
   cout << "Circle Area = " << calcArea() << endl;
}

float Circle::calcArea() {
    return 22.0/7*radius*radius;
}
