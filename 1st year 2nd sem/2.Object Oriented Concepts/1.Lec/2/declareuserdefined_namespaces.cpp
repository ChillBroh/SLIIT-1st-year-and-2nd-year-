#include <iostream>
#include <iomanip>
using namespace std;
namespace hello
{
    void graph(float x, float y){
    	float sum;
		sum = x+y;
    	cout << "sum is " << sum << endl;
    	cout << setw(15)<< setfill('*') << "sum is " << sum << setw(15)<<"test"<< endl;
    	cout << setw(15)<< setprecision(5)<<"sum is " << sum << endl;
	}
	
}
using namespace hello;
int main()
{
	double pi = 3.144759864;
    hello::graph(25.11111, 20.11111);
    cout << fixed << setprecision(2) << pi << endl;
    cout << setiosflags(ios::fixed) << setprecision(4) << pi << endl;
    return 0;
}