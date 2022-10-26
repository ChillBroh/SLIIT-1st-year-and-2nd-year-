#include<iostream>
#include<iomanip>
using namespace std;

struct circle{
    float radius;
};
struct rectangle{
    float length;
    float width;
};
struct square{
    float length;
};

//function declaration

float Circle(float r);
float Rectangle(float len, float wid);
float Square(float len);
int fence(float &len, float &wid);
float fence_cost(float peri,float cost);

float Circle(float r){
	return 22.0/7*r*r;
}

float Rectangle(float len, float wid){
	return len*wid;
}
//perimter of square area in main land
float Square (float len){
	return len * len;
}
//perimeter of main land
float main_peri(float &len, float& wid){
	return (2*len) + (2*wid);
}
//total cost for fence 
float fence_cost(float peri,float cost){
	return peri * cost;
}

//main function declaration
int main(){
	struct circle c;
	struct rectangle r;
	struct rectangle w;
	struct square sq;
	float main_len,main_wid;
	float &len = main_len;
	float &wid = main_wid;
	float cost;
	
	cout << "Enter radius of circle area : ";
	cin >> c.radius;
	cout << "Enter length of  rectangle area : ";
	cin >> r.length;
	cout << "Enter width of Rectangle area : ";
	cin >> w.width;
	cout << "Enter the length of square area : ";
	cin >> sq.length;
	cout << "Enter the main land length : ";
	cin >> main_len;
	cout << "Enter the main land width : ";
	cin >> main_wid;
	cout << "Enter the cost per unit for fence : ";
	cin >> cost;
	
	float total_shape = (Circle(c.radius)+Rectangle(r.length,w.width)+Square(sq.length));
	float total_main = main_len * main_wid; //total_main = total area of main land
	float green_area = total_main - total_shape;
	float perimeter = main_peri(main_len,main_wid);
	
	cout << "The area of grass grown area is : " << setiosflags (ios::fixed) << setprecision(3) << green_area << endl;
	cout << "The perimeter of main land is : " << fixed << setprecision(2) << perimeter << endl;
	cout << "The total cost for fence is : " << fixed << setprecision(2) << fence_cost(perimeter,cost) << endl;
}

