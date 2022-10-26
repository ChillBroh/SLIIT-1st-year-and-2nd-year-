#include<iostream>
using namespace std;

int main(){
	int *p;
	
	p = new int;
	*p = 5;
	
	if (!p){
		cout << "cannot allocate memory " << endl;  
		return -1; 
	}
	
	cout << p << endl;
	cout << *p;
}