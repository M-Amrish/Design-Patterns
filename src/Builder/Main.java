package Builder;

public class Main {
    public static void main(String[] args) {

//        Builder builder = new Builder();
//        Builder builder = Student.getBuilder();

//        builder.setName("Amrish");
//        builder.setBatch("Apr23 ");
//        builder.setGradYear(2022);
//        builder.setPsp(89.0);
//        builder.setAge(25);
//        builder.setUniversityName("LVMS");

        //        //Student student = new Student(builder);
//        Student student = builder.build();

        Student student = Student.getBuilder()
                .setAge(25)
                .setName("Amrish")
                .setGradYear(2021)
                .setPsp(95)
                .build();


    }
}
