#include <iostream>

using namespace std;

class Student
{
    public:     //access modifiers 1. public; 2. protected; 3. private
        int roll_no;    // members in class
        int marks;
        
        void welcome(){
            cout << "In Welcome";
        } 

        void welcome1(){
            cout << "In welcome1";
        }

    private:
        int marks1;
};

int main(){
    Student s1;
    cout << "Please enter the number:";
    cin >> s1.roll_no;
    cout << "The entered number is: " << s1.roll_no;
/*    cout << "Please enter the marks:";
    cin >> s1.marks; */
    s1.welcome();
    s1.welcome1();
    return 0;
}