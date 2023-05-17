

//class that creates an array of Students and prints each students name
public class StudentList {

    public static void main(String[] args){

        //create an array of Student objects of size 5 using Student constructor

        Student[] student = new Student[5];

        //Add 5 student to array
        Student s1 = new Student("Princekumar");
        student[0] = s1;

        Student s2 = new Student("Vasu");
        student[1] = s2;

        Student s3 = new Student("Nirmit");
        student[2] = s3;

        Student s4 = new Student("Maharsh");
        student[3] = s4;

        Student s5 = new Student("Vraj");
        student[4] = s5;


        //iterate over the array and print out each student's name
        //for-each loop for students in students array
        for (Student s: student)
        {
            System.out.println("Name:" + s.getName());

        }
    }

}
