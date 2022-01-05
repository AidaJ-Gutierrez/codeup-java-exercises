
//Object basics
//
//Create Person class inside of src that has a private name field that is a string, and the following methods:

public class Person {
    private String name;

    public Person(String name){
        this.name= name;
    }

    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;

    }
    public  void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("Hello %s!", name);
    }
    public static void main(String[] args) {
        Person namePerson = new Person("Aaron");
        System.out.println(namePerson.getName());

//Understanding references
//
//The following code blocks make use of the Person class from the previous exercise. For each code block,
// think about what the code will output, then copy the code into IntelliJ and run it to see if it
// matches your expectations.

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }
}

