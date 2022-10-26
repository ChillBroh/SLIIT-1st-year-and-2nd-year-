#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    float height, width;
    float peri; // peri = perimeter
    cout << "enter value for height: ";
    cin >> height;
    cout << "enter valur for width: ";
    cin >> width;

    peri = (2 * height) + (2 * width);

    cout << "perimeter is: " << fixed << setprecision(2) << peri << endl;
    cout << "perimeter is: " << setiosflags(ios::fixed) << setprecision(2) << peri << endl;
}