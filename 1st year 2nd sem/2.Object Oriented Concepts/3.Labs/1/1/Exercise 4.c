#include<stdio.h>
float findCA_1(int marks1);
float findCA_2(int marks2);

float findCA_1(int marks1){
	return marks1 * 20/100.0;
}

float findCA_2(int marks2){
	return marks2 * 30/100.0;
}

int main (){
	int final[5][5];
	int i,j;
	
	
	for(i = 0; i < 5; i++){
		printf("Enter student %d marks\n", i+1);
		for(j = 1; j <=2; j++){
			printf("Enter marks %d ", j);
			scanf("%d", &final[i][j]);
		}
	}
	
	for(i = 0; i < 5; i++){
		final[i][3] = findCA_1(final[i][1]);
		final[i][4] = findCA_2(final[i][2]);
	}
	
	printf("Student		marks1		Marks2		CA_1	CA_2\n");
	
	for(i = 0; i < 5; i++){
		printf("\n%d", i+1);
		for(j = 0; j <5; j++){
			if (j == 4 || j == 5){
				printf("%.2f\t\t", final[i][j]);
			}
			else 
			printf("%d\t\t", final[i][j]);
			
		}
	}
	
}