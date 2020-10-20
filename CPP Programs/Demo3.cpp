#include <iostream>

using namespace std;
// Project Teacher-student 
class Teacher{
    public:
        int teacher_id = 0;
        string teacher_nm="";
        void getTeacher(){  
            cout<< "Please enter the teacher id:";
            cin>>teacher_id;
            cout<< "Please enter the Teacher name:";
            cin>>teacher_nm;
        }
        void displayTeacher(){
            cout << "The Teacher id is: " << teacher_id << " Teacher name: " << teacher_nm;
        }

};

int main(){
    Teacher t1, t2;
    t1.getTeacher();
    t1.displayTeacher();
    t2.getTeacher();
    t2.displayTeacher();
}