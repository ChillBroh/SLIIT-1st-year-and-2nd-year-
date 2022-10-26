#include <iostream>
using namespace std;
int main()
{
    float num1, num2;

    cout << "Enter value for num1 : ";
    cin >> num1;

    cout << "Enter value for num2 : ";
    cin >> num2;

    float *n1, *n2;

    n1 = &num1;
    n2 = &num2;

    *n1 += 7.8;  // add 7.8 to num1 using pointer
    *n2 -= 14.2; // sub 14.2 from num2 using pointer

    cout << *n1 << endl;
    cout << *n2 << endl;

    int sum = num1 + num2;
    cout << sum << endl;
}