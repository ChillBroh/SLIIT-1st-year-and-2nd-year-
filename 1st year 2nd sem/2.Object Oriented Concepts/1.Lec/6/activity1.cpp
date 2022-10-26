#include<iostream>
#include<cstring>
#include<iomanip>
using namespace std;

class item {
	private:
		int itemNo;
		char name[20];
		float price;
	public:
		void setItemdetails(int no, char pName[20]);
		void setPrice(float pPrice);
		int getItemcode();
		float getPrice();
	
};

void item::setItemdetails(int no, char pname[20]){
	itemNo = no;
	strcpy(name, pname);
}
void item::setPrice(float pPrice){
	price = pPrice;
}
int item::getItemcode(){
	return itemNo;
}
float item::getPrice(){
	return price;
}


int main(){
	item it1;
	item it2;
	
	it1.setItemdetails(1000,"Book1");
	it1.setPrice(1500.00);
	
	it2.setItemdetails(2000, "pen");
	it2.setPrice(10.00);
	
	cout << it1.getItemcode() <<  ": " << fixed << setprecision(1) << it1.getPrice() << endl;
	cout << it2.getItemcode() <<  ": " << fixed << setprecision(1) << it2.getPrice() << endl;
	
	return 0;
}