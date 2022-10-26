#include<iostream>
using namespace std;

class Rectangle {
	private:
		int width;
		int length;
	public:
		Rectangle();
		Rectangle(int w, int l);
		int calcArea();
		~Rectangle();
};

Rectangle::Rectangle(){
	width = 0;
	length = 0;
}

Rectangle::Rectangle(int w, int l){
	width = w;
	length = l;
}
int Rectangle::calcArea(){
	return width *  length;
}
Rectangle::~Rectangle(){
	cout << "Destructor runs with width - " << width << " Length - " << length << endl;
}

int main (){
	Rectangle *rec1, *rec2;
	Rectangle rec3;
	Rectangle rec4(50,60);
	
	rec1 =  new Rectangle();
	rec2 =  new Rectangle(10,50);
	
	cout << rec1->calcArea() << endl; // We must dealocate memory using delete in dynamic objects
	cout << rec2->calcArea() << endl;
	cout << rec3.calcArea() << endl;
	cout << rec4.calcArea() << endl; //Destructor auto runs with static objects. no need of delete
	
	delete rec2;
	delete rec1;
}

