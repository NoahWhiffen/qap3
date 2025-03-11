class Student extends Person {
    protected String idNum;
    protected double gpa;

    public Student(String name, int age, char gender, String idNum, double gpa) {
        super(name, age, gender);
        this.idNum = idNum;
        this.gpa = gpa;
    }

    // String method
    @Override
    public String toString() {
        return super.toString() + " | ID Num: " + idNum + " | GPA: " + gpa;
    }

    // Getter methods
    public String getIdNum() {
        return idNum;
    }

    public double getGpa() {
        return gpa;
    }

    // Setter methods
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
