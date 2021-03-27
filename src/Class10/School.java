package Class10;

public class School {

    public static void main(String[] args) {

        Students s1 = new Students();
        s1.enrollStudent("Happy", "NY", "PM");
        s1.displayStudentProfile();

        Students s2 = new Students();
        s2.enrollStudent("Joy", "NJ", "qa");
        s2.displayStudentProfile();

        Students s3 = new Students();
        s3.enrollStudent("Fun", "FL", "web");
        s3.displayStudentProfile();

        s1.feeDeposit(4000);

        Students.displaySchoolSummary();

        s1.toChangeCourse("qa");

    }
}

