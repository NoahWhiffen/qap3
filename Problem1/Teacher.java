class Teacher extends Person {
    protected String subject;
    protected double salary; // annually

    public Teacher(String name, int age, char gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    // String method
    @Override
    public String toString() {
        return super.toString() + " Teaches: " + subject + " Annual Salary: " + salary;
    }

    // Getter methods
    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
