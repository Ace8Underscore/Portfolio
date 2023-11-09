#include <iostream>
#include <string>

using namespace std;


int main() {

    string name;
    int age;
    int currentYear;
    int futureYear;
    
    cout << "What is your name?";
    cin >> name;

    cout << "What is your Current Age" << endl;
    cin >> age;

    cout << "What is the current year?" << endl;
    cin >> currentYear;

    cout << "What is the year you want to see your age at?" << endl;
    cin >> futureYear;

    
    int futureAge = (futureYear - currentYear) + age;

    cout << "You " << name << " Will be " << futureAge << " In " << futureYear << endl;




    return 0;
}