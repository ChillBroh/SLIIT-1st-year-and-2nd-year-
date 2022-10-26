#include<iostream>
#include<cstring>
using namespace std;

class Book{
	private:
		int bookID;
		char bookName[20];
		char author[20];
	public:
		void setBookDetails(char name[20], char pauthor[20]);
		void displayBookDetails();
		void setBookID(int id);
};

void Book::setBookID(int id){
	
	bookID = id;
}
void Book::setBookDetails(char name[20], char pauthor[20]){
	
	strcpy(bookName, name);
	strcpy(author, pauthor);
}
void Book::displayBookDetails(){
	
	cout << "BookID = " << bookID << endl << "BookName = " << bookName << endl << "Author =" << author << endl;
}

int main (){
	Book b1, b2, b3;
	int id1, id2, id3;
	
	cout << "Input new book ID 1 : ";
	cin >> id1;
	cout << "Input new book ID 2 : ";
	cin >> id2;
	cout << "Input new book ID 3 : ";
	cin >> id3;
	
	b1.setBookID(id1);
	b2.setBookID(id2);
	b3.setBookID(id3);
	
	b1.setBookDetails("Jane Eyre","Charlotte Bronte");
	b2.setBookDetails("Divergent","Veronica Roth");
	b3.setBookDetails("Matilda","Roald Dahl");
	
	b1.displayBookDetails();
	b2.displayBookDetails();
	b3.displayBookDetails();

	return 0;
	
}