class Student extends Person {
    protected String idNum;
    protected double gpa;

    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        this.idNum = idNum;
        this.gpa = gpa;
    }
}
