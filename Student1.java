

class Student1 {
    String id;
    String name;
    int birthdate;
    public Student1(String i, String n, int b){
        id = i;
        name = n;
        birthdate = b;
    }
    public Student1(Student1 s){
        ///copy constructor
        id = s.id;
        name =s.name;
        birthdate = s.birthdate;
    }
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Birthdate: " + birthdate);
    }
    public static void main(String args[]) {
        Student1 s1 = new Student1("2020","boni",2022-2-12);
        Student1 s2 = new Student1(s1);
        s1.display();
        s2.display();
    }} 

