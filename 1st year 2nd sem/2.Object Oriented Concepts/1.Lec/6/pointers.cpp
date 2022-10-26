#include<iostream>
using namespace std;

int main(){
	int *m; // if we use int *m = NULL it is initialize as 0
	int count;
	
	cout << m << endl;
	m = &count;
	cout << m << endl;
	cout << *m << endl;
	count = 7;
	cout << *m << endl;
	*m = 10;
	cout << count << endl;
	

	cout << &count << endl;
	cout << &m << endl; 
	cout << *m << endl;
	cout << count << endl;
//	cout << *f << endl;
//	cout << f << endl;
	
	
}