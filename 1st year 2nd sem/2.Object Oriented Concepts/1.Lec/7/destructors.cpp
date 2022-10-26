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
		~Rectangle();
		
};

Rectangle::Rectangle(){
 	length = 0;
 	width = 0;
 }
Rectangle::Rectangle(int w,int l){
	length = l;
	width = w;
}
Rectangle::~Rectangle(){
	cout << "Distructor runs with len -  " << length << " width - "<< width << endl;
}
int Rectangle::calcArea(){
	return length * width;
}


int main (){
	

	Rectangle rec1;
	Rectangle rec2(50,10); //in this we create objects and we initialize value while object creating
	
	
	cout << rec1.calcArea() << endl;
	cout << rec2.calcArea() << endl;
	
	
	return 0;
}
