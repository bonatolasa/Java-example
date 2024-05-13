#include<iostream>
using namespace std;

int main(){
    string students[10][5];
    string columns[5]={" Name:","Father Name:","Last Name:","Idno:","Gender:"};
    for(int i=0;i<10;i++)
    for(int j=0;j<5;j++){
        cout<<"Enter student "<<i+1<<" "<<columns[j];
      getline(cin,students[i][j]);
         }
         
    for(int i=0;i<10;i++){
        for(int j=0;j<5;j++){
            cout<<students[i][j]<<" ";
        }
        cout<<"\n";
    }
    return  0;
}