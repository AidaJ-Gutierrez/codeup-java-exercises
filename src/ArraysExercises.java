import java.util.Arrays;

public class ArraysExercises {


    public static void main(String[] args) {


//What happens when you run the following code?
        int[] numbers = {1, 2, 3, 4, 5};
       // System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        // Why is Arrays.toString necessary?
        // just a pointer to location in memory


        Person [] people = new Person[3];
        people[0]= new Person("Aaron");
        people[1]= new Person("Adan");
        people[2]= new Person("Victoria");

        for (Person person: people){
            System.out.println(person.getName());
        }





    }
    public static Person[] addPerson(Person[] people, Person personToAdd){
        Person[] copyArray = Arrays.copyOf(people, people.length+1);
        copyArray[copyArray.length-1] = personToAdd;
        return copyArray;

    }

}
