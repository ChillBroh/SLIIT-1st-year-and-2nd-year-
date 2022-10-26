#include<stdio.h>
float area(float length, float width);

float area(float length, float width){
	float _area = length * width;
	return _area;
}

int main(){
	float yard_len, yard_wid, house_len, house_wid; //len = length, wid = width
	float yard, house, Lawn_area;
	
	printf("Enter the length of Yard : ");
	scanf("%f", &yard_len);
	printf("Enter the width of Yard : ");
	scanf("%f", &yard_wid);
	printf("Enter the length of house : ");
	scanf("%f", &house_len);
	printf("Enter the width of house : ");
	scanf("%f", &house_wid);
	puts("");
	
	yard = area(yard_len, yard_wid);
	house = area(house_len, house_wid);
	
	printf("Area of the yard is %.2f square meters\n", yard);
	printf("Area of the house is %.2f square meters\n", house);
	
	Lawn_area = yard - house;
	
	printf("\nLawn are is %.2f square meters", Lawn_area);
	
	return 0;
}