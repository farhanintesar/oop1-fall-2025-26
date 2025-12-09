package LabTask1Final;

public class School {

     Student[] students; 
     int count = 0;

    public School(int size) {
        students = new Student[size];
    }

     void addStudent(Student s) {
        students[count++] = s;

    }

     void show() {
        for (int i = 0; i < count; i++) {
            System.out.println("Student name: "+students[i].name + "\n Contact Info:-\n "
                +"Phone: "+ students[i].contact.getPhone() + ", Email: "
                + students[i].contact.getEmail());
        }
    }

}
