public class Demo1 {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        // Create sample person
        Person James = new Person("James Smith", 35, 'M');
        System.out.println(James.toString());

        // Create sample student
        Student Linda = new Student("Linda Best", 24, 'F', "HSF13421", 3.5);
        System.out.println(Linda.toString());

        // Create sample teacher
        Teacher Monty = new Teacher("Monty Pyton", 55, 'M', "Discrete Math", 100000);
        System.out.println(Monty.toString());

        // Create sample college student
        CollegeStudent Samuel = new CollegeStudent("Samuel Winchester", 40, 'M', "HSF13426", 4.5, "Computer Science", 2);
        System.out.println(Samuel.toString());

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
    }
}
