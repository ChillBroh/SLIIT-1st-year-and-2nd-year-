#include <iostream>
#include <iomanip>
using namespace std;

class Date
{
private:
	int day;
	int month;
	int year;

public:
	void setDate(int d);
	void setMonth(int m);
	void setYear(int y);
	int getDay();
	int getMonth();
	int getYear();
};

void Date::setDate(int d)
{
	if (d >= 1 && d <= 31)
	{
		day = d;
	}
	else
		day = 0;
}
void Date::setMonth(int m)
{
	if (m >= 1 && m <= 12)
	{
		month = m;
	}
	else
		month = 0;
}
void Date::setYear(int y)
{
	year = y;
}
int Date::getDay()
{
	return day;
}
int Date::getMonth()
{
	return month;
}
int Date::getYear()
{
	return year;
}
int main()
{
	Date d;
	int day, m, y; // d = date, m = month, y = year;
	cout << "enter date : ";
	cin >> day;
	cout << "enter month : ";
	cin >> m;
	cout << "enter year : ";
	cin >> y;

	d.setDate(day);
	d.setMonth(m);
	d.setYear(y);
	cout << "The date is : " << setw(2) << setfill('0') << d.getDay() << "/" << setw(2) << setfill('0') << d.getMonth() << "/" << d.getYear() << endl;
	cout << "Month is ";
	switch (m)
	{
	case 1:
		cout << "January";
		break;
	case 2:
		cout << "February";
		break;
	case 3:
		cout << "March";
		break;
	case 4:
		cout << "April";
		break;
	case 5:
		cout << "May";
		break;
	case 6:
		cout << "June";
		break;
	case 7:
		cout << "July";
		break;
	case 8:
		cout << "August";
		break;
	case 9:
		cout << "September";
		break;
	case 10:
		cout << "October";
		break;
	case 11:
		cout << "November";
		break;
	case 12:
		cout << "December";
		break;
	}
	return 0;
}