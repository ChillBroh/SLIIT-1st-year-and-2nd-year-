#include "Student.h"
#include <iostream>
#include<cstring>
using namespace std;


void Student::assignDetails(int pId, char pname[]) {
   strcpy(name,pname);
   studentId = pId;
}

// Display StudentId and Name
void Student::display() {
  cout << studentId << endl;
  cout << name << endl;
}