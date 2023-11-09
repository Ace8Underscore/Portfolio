#include <iostream>
#include <string>

using namespace std;

int getaverage(int total) {
return total / 10;

}


int main() {

    int total =0;

    int i = 0;
    cout << "Enter in 10 Numbers below";

    while (i < 10) {
        int amount;
        cout << "Enter in Number" << i + 1 << " ";
        cin >> amount;

        total += amount;


        i++;
    }

    
    cout << "Average is " << getaverage(total);

return 0;

}
