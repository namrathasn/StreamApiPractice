package streamAPI;

public class Student {
   String name;
   int rollnum;
   long phone;
   char gender;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollnum=" + rollnum +
                ", phone=" + phone +
                ", gender=" + gender +
                ", marks=" + marks +
                '}';
    }

    int marks;
    public Student(String name, int rollnum, long phone, char gender, int marks) {
        this.name = name;
        this.rollnum = rollnum;
        this.phone = phone;
        this.gender = gender;
        this.marks = marks;
    }
