//Mustafa Sidiqi S153168
//This app creates a database. You can enter user with name and phonenumber. You can view users in the database, and search for user by their phonenumber. 


//ConsoleApplication1.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>
using namespace std;
#include <stdio.h> // Header for standard input/output functions
#include <conio.h> // Header only for the getch function
#pragma warning (disable : 4996) // Use this line only in Visual Studio
#include <fstream>
#include <string>
#include <ctype.h>

struct User {
	string name;//Array to save users name. 
	unsigned long int phone;//used to save users phonenumber. 
};

class Database {
public:
	Database(); // constructor
	bool addRecord(string x, int y); // add a record
	User * getRecord(int index); // read a record
	int find(int key); // search for a record
	void sortList(); //sorts the list
	void sortListName(); //sorts the list after name
	void viewAllUsers();
	void binarySearch(int x);
	void numberSearch(int x);
	void nameSearch(string name);
	void convertToLowerCase(string& s);
	void changeUser();
	int inputFile();
	int numEntry = 0;
protected:
	User list[100]; // array of records
	int num; // number of records
	int capacity; // max number of records
	int newRec;
	
};

User contacts[100];

Database::Database() {
	bool addRecord();
}

bool Database::addRecord(string s, int y) {
	convertToLowerCase(s);
	//cout << s << endl;n //testing function.
	list[newRec].name = s;
	list[newRec].phone = y;
	newRec++;
	return true;
}

User * Database::getRecord(int index)
{
	return &list[index];
}

Database database;

int main() {
	int entry = 0;
	User *r = database.getRecord(entry);
	printf("Enter 1 to add user: \n");
	printf("Enter 2 to view user: \n");
	printf("Enter 3 to view all users user: \n");
	printf("Enter 4 to search for user: \n");
	printf("Enter 5 to import users from file: \n");
	printf("Enter 6 to edit user: \n");


Start:
	int add = 1;
	int next = 2;
	int previous = 3;
	int key;
	string name;
	int phone;
	cin >> key;
	//cin.get();

	if (key == 1) {
		cout << "Enter name (use _ to instead of space):" << endl;
		cin >> name;
		cout << "\nEnter phone number:" << endl;
		cin >> phone; 
		database.addRecord(name, phone);
		database.numEntry++;
		goto Start;
	}

	if (key == 2) {
		printf("Enter 8 to view next user: \n");
		printf("Enter 9 to view previous user: \n");
		User * r = database.getRecord(entry);
		cout << r->name;
		cout << "\t";
		cout << r->phone << endl;
		goto Start;
	}
	if (key == 8) {
		printf("Enter 8 to view next user: \n");
		printf("Enter 9 to view previous user: \n");
		entry++;
		User * r = database.getRecord(entry);
		cout << r->name;
		cout << "\t";
		cout << r->phone << endl;
		goto Start;
	}
	if (key == 9) {
		printf("Enter 8 to view next user: \n");
		printf("Enter 9 to view previous user: \n");
		entry--;
		User * r = database.getRecord(entry);
		cout << r->name;
		cout << "\t";
		cout << r->phone << endl;
		goto Start;
	}

	if (key == 3) {
		database.viewAllUsers();
		goto Start;

	}	
	if (key == 10) {		
		printf("Enter 1 to sort after users phonemumber: \n");
		printf("Enter 2 to sort after users name: \n");
		int key;
		cin >> key;

		if (key == 1) {
		database.sortList();
		//binarySearch(x);
		goto Start;
		}
		else if (key == 2) {
			database.sortListName();
			goto Start;
		}


	}

	if (key == 4) {
		printf("Enter 1 to search by number: \n");
		printf("Enter 2 to search by name: \n");
		int y;
		cin >> y;
		if (y == 1){
		printf("Enter 6 to search trorugh all numbers: \n");
		printf("Enter 7 to search binary: \n");
		int x; 
		cin >> x;			
		printf("Enter phone number to search: \n");
		int phoneNumber;
		cin >> phoneNumber;
		if (x == 6) {
			database.numberSearch(phoneNumber); //this return the number, found or -1 if not found. 
			goto Start;
			} else if (x == 7) {
				database.binarySearch(phoneNumber);
				goto Start;
			}
		}
		else if (y == 2) {
			printf("Enter name to search for: \n");
			string s; 
			cin >> s;
			database.convertToLowerCase(s);
			database.nameSearch(s);
			goto Start;

		}
	}

	if (key == 5) {
		database.inputFile();
		goto Start;
	}
	
	if (key == 6) {
		database.changeUser();
		goto Start;
	}

}


void Database::sortList() {
	bool swapped = true; // remember if we have swapped elements
	int i; // index
	int j = 0; // counting number of runs
	User temp; // temporary storage during swapping
	while (swapped) { // repeat as long as there is something to swap
		j++; // count number of runs
		swapped = false;
		for (i = 0; i < newRec - j; i++) { // loop through list
			User * r = database.getRecord(i);
			User * s = database.getRecord(i+1);
			if (r->phone > s->phone) { // if element is bigger than the next
				temp = list[i]; // swap list[i] and list[i+1]
				list[i] = list[i + 1];
				list[i + 1] = temp;
				swapped = true; // remember that we swapped
			}
		}
	}
	database.viewAllUsers();
}

void Database::sortListName() {
	bool swapped = true; // remember if we have swapped elements
	int i; // index
	int j = 0; // counting number of runs
	User temp; // temporary storage during swapping
	while (swapped) { // repeat as long as there is something to swap
		j++; // count number of runs
		swapped = false;
		for (i = 0; i < newRec - j; i++) { // loop through list
			User * r = database.getRecord(i);
			User * s = database.getRecord(i + 1);
			if (r->name > s->name) { // if element is bigger than the next
				temp = list[i]; // swap list[i] and list[i+1]
				list[i] = list[i + 1];
				list[i + 1] = temp;
				swapped = true; // remember that we swapped
			}
		}
	}
	database.viewAllUsers();
}

void Database::viewAllUsers() {
	printf("All users: \n");
	for (int i = 0; i < database.numEntry; i++) {
		User * r = database.getRecord(i);
		cout << r->name;
		cout << "\t";
		cout << r->phone << endl;
	}
	printf("Press 10 to sort all users: \n");
}

void Database::numberSearch(int x) {
	//printf("Enter phone number to search: \n");
	//int numberSearch;
	//cin >> numberSearch;
	for (int i = 0; i <= database.numEntry; i++) {
		User * r = database.getRecord(i);
		if (r->phone == x) {
			cout << "User found: " << endl;
			cout << "Name: " << r->name << endl;
			cout << "Phonenumber: " << r->phone << endl;
			return;
		}
	}
	cout << "User not found in the database." << endl;
}


void Database::binarySearch(int x) {
	int low; 
	int high; 
	int mid; 
	low = 0; 
	high = newRec - 1; 
	while (low < high) {
		mid = (low + high) / 2; 
		User * r = database.getRecord(mid);
		if (x <= r->phone){
			high = mid;
		}
		else {
			low = mid + 1;
		}
	}
	User * r = database.getRecord(low);
	if (r->phone == x) {
		//cout << "Phonenumber found: " << low << endl;
		cout << "User found: " << r->name << endl;
	}
	else {
		printf("Error. Phonenumber was not found in database: \n");
	}
}

int Database::inputFile() {
//	char name; 
//unsigned long int phone;		
	ifstream inputfile;
	int phone; 
	string name; 
	inputfile.open("importMe.txt");
	while (inputfile.good()) {
		inputfile >> name >> phone;
		if (inputfile.eof()) {
			break;
			//cout << y << endl;
		}
		database.numEntry++;
		database.addRecord(name, phone);
	}
	inputfile.close();
	cout << "Users imported" << endl;
	return 0;
}

void Database::nameSearch(string name) {
	for (int i = 0; i <= database.numEntry; i++) {
		User * r = database.getRecord(i);
		if (r->name == name) {
			cout << "User found: " << endl;
			cout << "Name: " << r->name << endl;
			cout << "Phonenumber: " << r->phone << endl;

			return;
		}
	}
	cout << "User not found in the database." << endl;
}

void Database::changeUser() {
	printf("All users: \n");
	for (int i = 0; i < numEntry; i++) {
		User * r = database.getRecord(i);
		cout << i;
		cout << "\t";
		cout << r->name;
		cout << "\t";
		cout << r->phone << endl;
	}
	printf("Write the index number for the user you want to change: \n");
	int x; 
	//int phone; 
	string name;
	cin >> x;
	cout << "Enter name (use _ to instead of space):" << endl;
	cin >> list[x].name;
	cout << "\nEnter phone number:" << endl;
	cin >> list[x].phone;
	//addRecord(name, phone);
}

void Database::convertToLowerCase(string& s) {

	for (int i = 0; i < s.length(); i++) {
		s[i] = tolower(s[i]);
	}
}