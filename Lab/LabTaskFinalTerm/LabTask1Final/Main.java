package LabTask1Final;

public class Main {
    public static void main(String[] args) {
        System.out.println("Institution: American International University Bangladesh");
        System.out.println("-------Student Info-------");
        School school = new School(3);

        school.addStudent(
            new Student("Sazid Hasan Sahil", new Contact("01711676668", "sazidsahil@mail.com"))
        );

        school.addStudent(
            new Student("Riyad Hossain", new Contact("01822111119", "riyad79@mail.com"))
        );

        school.addStudent(
            new Student("Farhan Intesar", new Contact("01933986654", "farhanintesar0099@mail.com"))
        );

        school.show();
    }
}
