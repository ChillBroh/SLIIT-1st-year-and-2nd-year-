#include<stdio.h>
int main (){
	int mark[3] = {};
	int total =  0;
	float average;
	
	for(int j = 0; j < 3; j++){
		printf("Enter Student %d marks\n", j+1);
		
		for(int i = 0; i < 3; i++){
		printf("Enter module %d mark : ", i+1);
		scanf("%d", &mark[i]);
		
		total += mark[i];
		}
	
		average = total/3.0;
		printf("%.2f\n", average);
	
		if (average > 60){
			puts("Congratulations! You have selected to the Softwear Engineering");
		}
		else 
			puts("Sorry,You have not selected to the Softwear Engineering.");
		
		puts("");
		total = 0;
	}
	return 0;
}