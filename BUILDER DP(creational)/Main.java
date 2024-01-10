
public class Main {
    public static void main(String[] args) {
        // Builder builder = new Builder(); since we have static method in student class that give builder object we will not uuse this

        /* this has been commented because there is better way to set values by chaining the set methods
         in builder class(by chaining it means setting return type of the setter methods to builder object) */
        // Builder builder = Student.getBuilder(); 
        // builder.setName("Sagar");
        // builder.setAge(25);
        // builder.setBatch("Oct22");
        // builder.setPsp(90.0);
        // builder.setGradYear(2025);

        // setting values using chaining technique


        // Student student = new Student(builder); using constructor of student to make student object
        Student student = Student.getBuilder().setName("Sunnny").setAge(0).setBatch("2025").setGradYear(2019).build(); /*using build method in builder object */
    }
    
}
