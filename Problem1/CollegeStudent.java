class CollegeStudent extends Student {
    protected String major;
    protected int year; // Which year of their program they are in. Freshman = 1, Sophomore = 2, etc.

    public CollegeStudent(String name, int age, char gender, String idNum, double gpa, String major, int year) {
        super(name, age, gender, idNum, gpa);
        this.major = major;
        this.year = year;
    }

    // String method
    public String toString() {
        return super.toString() + " Major: " + major + " Year of Study: " + year;
    }

    // Getter methods
    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    // Setter methods
    public void setMajor(String major) {
        this.major = major;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
