#include <iostream>
using namespace std;

int main()
{
    float number1 = 6.2;
    float number2 = 7.3;

    float *fptr;
    	
	cout << fptr << endl;
	cout << *fptr << endl;
	
	cout << &number1 << endl;
//	cout << &number2 << endl;
	
    fptr = &number1;
    cout << *fptr << endl;

   *fptr = number2; // assign number 2s VALUE for value of fptr
    cout << number2 << endl;
    cout << &number1 << endl;
    cout << fptr << endl; //memeory address prints that fptr holds (not the memory address of fptr)
    cout << *fptr << endl;



}