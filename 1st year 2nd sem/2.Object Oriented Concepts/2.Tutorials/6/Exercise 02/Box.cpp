#include "Box.h"
#include <iostream>
using namespace std;

void Box::setLength(int l){
    length = l;
}
void Box::setWidth(int w){
    width = w;
}
void Box::setHeight(int h){
    height = h;
}
int Box::getLength(){
    return length;
}
int Box::getWidth(){
     return width;
}
int Box::getHeight(){
     return height;
}
int Box::calcVolume() {
  return length * width * height;
}