#include<iostream>
using namespace std;

class Rectangle{
	private:
		int length;
		int width;
	public:
		Rectangle();
		Rectangle(int w,int l);
		void setwidth(int w);
		int getWidth();
		void setLength(int l);
		int getLength();
		int calcArea();
		
};

Rectangle::Rectangle(){
 	length = 0;
 	width = 0;
 }
Rectangle::Rectangle(int w,int l){
	length = l;
	width = w;
}
//void Rectangle::setLength(int l){
//	length = l;
//}
//void Rectangle::setwidth(int w){
//	width = w;
//}
//int Rectangle::getLength(){
//	return length;
//}
//int Rectangle::getWidth(){
//	return width;
//}
int Rectangle::calcArea(){
	return length * width;
}


int main (){
	
//	Rectangle rec1;
//	rec1.setwidth(10);  we don't use constructers we must first create an object and then do the initializing part
//	rec1.getWidth();
//	rec1.setLength(50);
//	rec1.getLength();
	
	Rectangle rec1;
	Rectangle rec2(50,10); //in this we create objects and we initialize value while object creating
	

	cout << rec1.calcArea() << endl;
	cout << rec2.calcArea() << endl;
	
	return 0;
}
