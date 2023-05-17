public class Student {

    private String name;
    private int studentNumber;
    private boolean fullTime;

    //a constructor to create a student with a specific name
    public Student(String givenName){

        name = givenName;
    }

    public String getName(){
        return name;
    }

    public void setName(String givenName){

        name = givenName;

    }

    public int getStudentNumber(){

        return studentNumber;
    }

    public void setStudentNumber(int studentNumber){

        studentNumber = studentNumber;
    }

    public static void main(String[] args){


    }
}
