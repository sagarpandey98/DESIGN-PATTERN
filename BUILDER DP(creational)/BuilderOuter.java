//  this builder class is outside the student class, it can be accomodated inside student class as its inner class
// public class Builder {
    
//     private String name;
//     private int age;
//     private String batch;
//     private String universityName;
//     private int gradYear;
//     private double psp;
//     public String getName() {
//         return name;
//     }
//     public Builder setName(String name) {
//         this.name = name;
//         return this;
//     }
//     public int getAge() {
//         return age;
//     }
//     public Builder setAge(int age) {
//         this.age = age;
//         return this;
//     }
//     public String getBatch() {
//         return batch;
//     }
//     public Builder setBatch(String batch) {
//         this.batch = batch;
//         return this;
//     }
//     public String getUniversityName() {
//         return universityName;
//     }
//     public Builder setUniversityName(String universityName) {
//         this.universityName = universityName;
//         return this;
//     }
//     public int getGradYear() {
//         return gradYear;
//     }
//     public Builder setGradYear(int gradYear) {
//         this.gradYear = gradYear;
//         return this;
//     }
//     public double getPsp() {
//         return psp;
//     }
//     public Builder setPsp(double psp) {
//         this.psp = psp;
//         return this;
//     }

//     public Student build(){
//         // validations
//          // validation
//          if(getGradYear()>2022)
//          {
//             throw new IllegalArgumentException("Invalid Grad Year");
//          }

//          return new Student();
//     }


    
// }
