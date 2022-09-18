package Harry;

class Zoo{

    String name;
    int numbers;

    public void detailes(){

//        name = "Tiger";
//        numbers = 10;

        System.out.println("The Name of animal is "+name);
        System.out.println("The total Number is"+numbers);
        System.out.printf("The Total number of %s is %d",name,numbers);

    }
}

class Employee{
    int id = 12;
    String name = "Vallabh";

    public void printdetailes(){

        System.out.println("my id is "+id);
        System.out.println("my name is "+name);


    }
}

public class cwh_38_customclass {

    public static void main(String[] args) {

        System.out.println("this is our custom class");

        Employee v = new Employee();
        Employee john = new Employee();

        john.id = 17;
        john.name = "ben";

        System.out.println(v.id);
        System.out.println(v.name);
        v.printdetailes();
        john.printdetailes();

        Zoo a = new Zoo();
        Zoo b = new Zoo();
        b.name = "horse";
        b.numbers = 50;

//        a.detailes();
        b.detailes();

    }

}
