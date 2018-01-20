public class Main {
    // Main method
    public static void main(String[] args) {
        // Create a Person, Student, Employee, Faculty, and Staff objects
        person person = new person("John", "12 Bell street",
                "3473339999", "john12@aol.com");

        student s = new student("Mary", "100 Town Ave", "5149993333",
                "mary100@aol.com", student.FRESHMAN);

        employee employee = new employee("Mike", "34 West street", "6189999999",
                "mike80@aol.com", 910, 60000);

        faculty faculty = new faculty("Sue", "28 Well street", "4133333333",
                "sue28@aol.com", 101, 50000, "4pm to 6pm", "Professor");

        staff staff = new staff("Tom", "90 Country road", "2030000000",
                "tomcat@aol.com", 12, 65000, "Executive Assistant");

        // Invoke toString of Person, Student, Employee, Faculty and Staff
        System.out.println(person.toString());
        System.out.println(s.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
