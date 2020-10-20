#include <iostream>

using namespace std;

class Teacher{
    private:
        int teacher_id = 1;
    protected:
        int subject_id = 2;
};

class Student: public Teacher{ 
    public:
        void getsubject(){
           // cout << teacher_id;
            cout << subject_id;
        }
};

int main(){
    Student s1;
    s1.getsubject();
}
