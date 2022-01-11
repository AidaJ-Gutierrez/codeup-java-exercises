package grades;

import java.util.HashMap;

public class GradesApplication {



    public static void main (String [] args){
        HashMap<String, Student> students = new HashMap<>();

        Student ana = new Student("Ana");
        ana.addGrade(90);
        ana.addGrade(85);
        ana.addGrade(80);
        ana.addGrade(100);


        Student victoria = new Student("Victoria");
        victoria.addGrade(75);
        victoria.addGrade(85);
        victoria.addGrade(99);
        victoria.addGrade(92);

        Student adan = new Student("Adan");
        adan.addGrade(100);
        adan.addGrade(87);
        adan.addGrade(96);
        adan.addGrade(60);

        Student aaron = new Student("Aaron");
        aaron.addGrade(70);
        aaron.addGrade(96);
        aaron.addGrade(83);
        aaron.addGrade(100);



        students.put("AnaWritesBeautifulCode", ana);
        students.put("VicTurnsCoffeeIntoCode", victoria);
        students.put("AdanJavaMan", adan);
        students.put("AaronCoolAsCode", aaron);

//Print the list of GitHub usernames out to the console

        System.out.println(students.keySet());
    }
}
