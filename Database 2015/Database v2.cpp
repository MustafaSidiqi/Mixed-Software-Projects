// ConsoleApplication1.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>
using namespace std;
#include <stdio.h> // Header for standard input/output functions
#include <conio.h> // Header only for the getch function
#pragma warning (disable : 4996) // Use this line only in Visual Studio



struct User {
	char name[18];
	unsigned long int phone;
};

class Database {
public:
	Database(); // constructor
	bool addRecord(); // add a record
	User * getRecord(int index); // read a record
	int find(int key); // search for a record
protected:
	User list[100]; // array of records
	int num; // number of records
	int capacity; // max number of records
};

Database::Database() {
	bool addRecord();
}

bool Database::addRecord() {
	User r;
	printf("Enter Name: \n");
	fgets(r.name, 18, stdin); // Read a line ended with the Enter key
	printf("Name: %s\n", r.name); // Print the text string (%s)
	printf("Enter Phonenumber: \n");
	char phoneArr[18];
	fgets(phoneArr, 18, stdin);
	r.phone = atoi(phoneArr); // Read a line ended with the Enter key
	printf("Name: %s\n", r.name); // Print the text string (%s)
	return true;
}

User * Database::getRecord(int index)
{
	return nullptr;
}

Database database;

int main() {
Start:
	printf("Enter 1 to add user: \n");
	printf("Enter 2 to view users: \n");
	printf("Enter 3 to view next user: \n");
	printf("Enter 4 to view previous user: \n");

	int add = 1;
	int next = 2;
	int previous = 3;
	int key;
	cin >> key;
	cin.get();
	if (key == 1) {
		database.addRecord();
		
		goto Start;
	}
	
	if (key == 2) {
		cout << "User: " << User[0].name << endl;
	}


	return 0;
}
