#include<iostream>
#include<iomanip>
using namespace std;

class Student{
	private:
		int studentNo;
		int mark1;
		int mark2;
		int mark3;	
	public:
		void setStudentNo(int no);
		void assignMarks(int n1, int n2, int n3);
		float calcAvg();
};
void Student::setStudentNo(int no){
	studentNo = no;
	
}
void Student::assignMarks( int n1,  int n2, int n3){
	mark1 = n1;
	mark2 = n2;
	mark3 = n3;
	
}
float Student::calcAvg(){
	return (mark1 + mark2 + mark3)/3.0;

	
}

int main(){
	Student std1, std2;
	std1.setStudentNo(1025);
	std1.assignMarks(10,5,8);
	
	std2.setStudentNo(1026);
	std2.assignMarks(10,5,6);
	
	cout << "marks of student 1 : " << fixed << setprecision(2) << std1.calcAvg() << endl;
	cout << "marks of student 2 : " << std2.calcAvg() << endl;
	return 0;
}