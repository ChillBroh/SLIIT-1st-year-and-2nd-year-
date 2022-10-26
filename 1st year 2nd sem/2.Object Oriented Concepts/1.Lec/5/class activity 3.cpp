#include<iostream>
#include<iomanip>
using namespace std;

class Circle {
	private:
		float radius;
	public:
		void setRadius(float r);
		float calcArea();
};

void Circle::setRadius(float r){
	radius = r;
}

float Circle::calcArea(){
	return 22/7.0 * radius * radius;
}

int main(){
	Circle rad;
	float r;
	cout << "Enter the radius of the circle : ";
	cin >> r;
	rad.setRadius(r);
	
	cout << "The area of the circle is : " << fixed << setprecision(2) << rad.calcArea() << endl;
	
}