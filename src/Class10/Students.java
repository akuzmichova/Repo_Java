package Class10;

import java.util.Arrays;

public class Students {

    static String schoolName = "ABC School";
    static String[] offeredCourses = {"QA", "Web", "PM"};
    static double[] feesCourses = {1000, 2000, 3000};
    static int totalStudents = 0;

    String studentName = "N/A";
    String studentEnrolledCourse;
    int studentId;
    String studentAddress;
    double studentFeeBalance;

    public void enrollStudent(String name, String addr, String course) {
        boolean isCourseAvailable = false;
        for (int i = 0; i < offeredCourses.length; i++) {
            if (offeredCourses[i].equalsIgnoreCase(course)) {
                totalStudents++;
                studentId = totalStudents;
                isCourseAvailable = true;
                studentName = name;
                studentEnrolledCourse = offeredCourses[i];
                studentFeeBalance = feesCourses[i];
                studentAddress = addr;
                break;
            }
        }
        if (isCourseAvailable) {
            System.out.println("Enrollment done successfully. Student id -> " + studentId);
        } else {
            System.out.println("Requested course " + course + " is not available in the school");
        }
    }

    public void displayStudentProfile() {
        System.out.println("Student profile " +
                "\nStudent id: " + studentId +
                "\nStudent name: " + studentName +
                "\nStudent course: " + studentEnrolledCourse + "\n\n");
    }

    double leftBalance = 0.00;
    double courseFee = 3000;

    public double feeDeposit(double depositAmt) {
        if (depositAmt > 0 && depositAmt <= courseFee) {
            leftBalance = courseFee - depositAmt;
            System.out.println("Student total course fee: " + courseFee +
                    "\nStudent deposit amount: " + depositAmt +
                    "\nStudent left balance: " + leftBalance);

        } else if (depositAmt > courseFee) {
            System.out.println("Your deposit amount is greater than Course total fee");
        } else {
            System.out.println("Invalid deposit amount entered: " + depositAmt);
        }
        return leftBalance;
    }

    public static void displaySchoolSummary() {
        System.out.println("\nSchool summary " +
                "\nSchool Name: " + schoolName +
                "\nCourses Offered: " + Arrays.toString(offeredCourses) +
                "\nTotal number of student: " + totalStudents);
    }


    public String toChangeCourse(String newCourse) {

        boolean isCourseAvailable = false;
        double newCourseFee = 0;
        for (int i = 0; i < offeredCourses.length; i++) {

            if (newCourse.equalsIgnoreCase(studentEnrolledCourse)){
                System.out.println("Same course entered, please choose another course");
                isCourseAvailable = true;
                break;
            } else if (offeredCourses[i].equalsIgnoreCase(newCourse)) {
                isCourseAvailable = true;
                studentEnrolledCourse = newCourse;
                newCourseFee = studentFeeBalance - feesCourses[i];
                if (newCourseFee < studentFeeBalance && newCourseFee > 0) {
                    System.out.println("Student enroled into " + newCourse + " and getting back " + newCourseFee);
                } else {
                    System.out.println("Please pay the rest balance: " + newCourseFee);
                }
                break;

            }
        }
        if(isCourseAvailable == false){
            System.out.println("Requested course is not available in the school");
        }
        return newCourse;
    }
}


