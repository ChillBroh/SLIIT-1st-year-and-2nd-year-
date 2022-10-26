#include<stdio.h>
int square(int num); //num = number
int cube(int num);

int square(int num){
	return num * num;
}

int cube (int num){
	return num * num * num;
}

int main(){
	
	printf("X		Square		Cube\n");
	for (int i = 1; i <= 10; i++){
		printf("%d		  %d		  %d\n",i , square(i), cube(i));
		
	}

}