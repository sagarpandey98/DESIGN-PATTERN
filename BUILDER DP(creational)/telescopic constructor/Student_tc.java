public class Student_tc {
    private String name;
    private int age;
    private double psp;
    private String uni;
    private int passYear;
    private String Loc;
    private int gradYear;

    // telescopic constructors
    Student_tc(String name){
        this.name = name;
    }

    Student_tc(String name, int age){
        // this.name = name instead of doing this i will call the above constructor to assign the name.
        this(name);
        this.age = age;

    }

    Student_tc(String name, int age, double psp){
        this(name, age);
        this.psp = psp;

    }
    // ...........futher constructor 
    /* Note: we can use map to to give parameter, constructor will iterate on map and get all parameters.
    But there will be issues:
    1. typecasting
    2. nocompile time checks on data and attributes name */
}
