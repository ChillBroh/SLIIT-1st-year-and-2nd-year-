#include<iostream>
#include<iomanip>
using namespace std;

class Time {
	private:
		int hour;
		int minute;
		int second;
		
	public:
		void setTime(int h, int m, int s);
		void printTimeUniversal();
		void printTimeStandard();
};

void Time::setTime(int h, int m, int s){
	hour = h;
	minute = m;
	second = s;
}

void Time::printTimeUniversal(){
	cout << setw(2) << setfill('0') << hour << ":" << setw(2) << setfill('0') << minute << ":" << setw(2) << setfill('0') << second << endl;
}
void Time::printTimeStandard(){
	if (hour >= 0 && hour <= 12 ){
		cout << setw(2) << setfill('0') << hour << ":" << setw(2) << setfill('0') << minute << ":" << setw(2) << setfill('0') << second << "AM" << endl;
	}
	else if (hour > 12){
		cout << setw(2) << setfill('0') << hour%12 << ":" << setw(2) << setfill('0') << minute << ":" << setw(2) << setfill('0') << second << "PM" << endl;
	}
}

int main(){
	Time t;
	int h, m, s; //h =hour, m =minute, s = second
	
	cout << "Enter hour : ";
	cin >> h;
	cout << "Enter minutes : ";
	cin >> m;
	cout << "Enter seconds : ";
	cin >> s;
	
	t.setTime(h,m,s);
	cout << "Time in Universal format ===> ";
	t.printTimeUniversal(); 
	cout << endl << "Time in Standard format ===> " ;
	t.printTimeStandard();
	
	
	return 0;
}
