public class Student {
    private String name;
    private int age;
    private String batch;
    private String universityName;
    private int gradYear;
    private double psp;

    // private Student(Builder builder){
    //     // Other way to create student object is by taking builder object in constructor and copying the values
    //     if(builder.getGradYear()>2022)
    //     {
    //         throw new IllegalArgumentException("Invalid Grad Year");
    //     }

    //     this.name = builder.getName();
    //     this.age = builder.getAge();
    //     this.psp = builder.getPsp();
    //     this.batch = builder.getBatch();
    //     this.gradYear = builder.getGradYear();
    //     this.universityName = builder.getUniversityName();

    // }
    
    public static Builder getBuilder(){
        return new Builder();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getBatch() {
        return batch;
    }
    public void setBatch(String batch) {
        this.batch = batch;
    }
    public String getUniversityName() {
        return universityName;
    }
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
    public int getGradYear() {
        return gradYear;
    }
    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }
    public double getPsp() {
        return psp;
    }
    public void setPsp(double psp) {
        this.psp = psp;
    }

    public static class Builder {
    
    private String name;
    private int age;
    private String batch;
    private String universityName;
    private int gradYear;
    private double psp;
    public String getName() {
        return name;
    }
    public Builder setName(String name) {
        this.name = name;
        return this;
    }
    public int getAge() {
        return age;
    }
    public Builder setAge(int age) {
        this.age = age;
        return this;
    }
    public String getBatch() {
        return batch;
    }
    public Builder setBatch(String batch) {
        this.batch = batch;
        return this;
    }
    public String getUniversityName() {
        return universityName;
    }
    public Builder setUniversityName(String universityName) {
        this.universityName = universityName;
        return this;
    }
    public int getGradYear() {
        return gradYear;
    }
    public Builder setGradYear(int gradYear) {
        this.gradYear = gradYear;
        return this;
    }
    public double getPsp() {
        return psp;
    }
    public Builder setPsp(double psp) {
        this.psp = psp;
        return this;
    }

    public Student build(){
        // validations
         // validation
         if(getGradYear()>2022)
         {
            throw new IllegalArgumentException("Invalid Grad Year");
         }

         return new Student();
    }


    
}
    
}
