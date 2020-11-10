package ro.fasttrackit.temacurs3and4;

public class Student implements Human {
    private float grade;
    private String name;
    private StudentType type;


    public StudentType getType() {
        return type;
    }

    public void setType(StudentType type) {
        this.type = type;
    }

    @Override
    public int getAge() {
        return 21;
    }

    @Override
    public ScholarType getScholarType() {
        return type;
    }


    public static void main(String[] args) {
        Student maria = new Student();
        maria.setType(StudentType.PHD);
        System.out.println("Maria is an " + maria.getType() + " student.");
    }
}