package grades;

import java.util.ArrayList;

public class Student {


    private String studentName;
    private ArrayList<Integer> grades;


    public Student(String studentName) {
        this.studentName = studentName;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return this.studentName;
    };
    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);

    };

    // returns the average of the students grades
    public int getGradeAverage(){
        int averageGrade= 0;
        for (int grade : this.grades){
            averageGrade =+ grade;
        }
        return averageGrade / this.grades.size();
    };




    public static void main (String [] args){

    }

}
