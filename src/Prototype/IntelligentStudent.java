package Prototype;

public class IntelligentStudent extends Student {
    private int iq;

    IntelligentStudent(){

    }

    IntelligentStudent(IntelligentStudent intelligentStudent){
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }


    @Override
    public Student clone() {
//        IntelligentStudent intelligentStudent = new IntelligentStudent();
//        intelligentStudent.setName(this.getName());
//        intelligentStudent.setAge(this.getAge());
//        intelligentStudent.setCity(this.getCity());
//        intelligentStudent.setPsp(this.getPsp());
//        intelligentStudent.setBatch(this.getBatch());
//        intelligentStudent.setAveragePsp(this.getAveragePsp());
//        intelligentStudent.iq = this.iq;

        return new IntelligentStudent(this);
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
