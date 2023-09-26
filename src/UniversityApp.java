public class UniversityApp {

    public static void main(String[] args) {

        // Using Default Constructor
        University uni1 = new University();
        System.out.println("Using Default Constructor:");
        System.out.println("Name: " + uni1.getName());
        System.out.println("Year of Establishment: " + uni1.getYearOfEstablishment());
        System.out.println("Number of Students: " + uni1.getNumberOfStudents());
        System.out.println("Number of Faculty Members: " + uni1.getNumberOfFacultyMembers());
        System.out.println("Number of Faculties: " + uni1.getNumberOfFaculties());

// Print number of departments for each faculty.
        int[] departments = uni1.getNumberOfDepartments();
        System.out.print("Number of Departments for each Faculty: ");
        if (departments != null && departments.length > 0) {
            for (int i = 0; i < departments.length; i++) {
                System.out.print(departments[i] + (i < departments.length - 1 ? ", " : ""));
            }
            System.out.println();
        } else {
            System.out.println("N/A");
        }

// Print facilities.
        String[] uniFacilities = uni1.getFacilities();
        System.out.print("Facilities: ");
        if (uniFacilities != null && uniFacilities.length > 0) {
            for (int i = 0; i < uniFacilities.length; i++) {
                System.out.print(uniFacilities[i] + (i < uniFacilities.length - 1 ? ", " : ""));
            }
            System.out.println();
        } else {
            System.out.println("N/A");
        }


        // Using the second constructor
        int[] departments1 = {2, 3, 4}; // example values
        String[] facilities = {"Library", "Sports Complex", "Cafeteria"};
        University uni2 = new University("OpenAI University", 2000, 5000, 250, 3, departments, facilities);
        System.out.println("Using Default Constructor:");
        System.out.println("Name: " + uni1.getName());
        System.out.println("Year of Establishment: " + uni1.getYearOfEstablishment());
        System.out.println("Number of Students: " + uni1.getNumberOfStudents());
        System.out.println("Number of Faculty Members: " + uni1.getNumberOfFacultyMembers());
        System.out.println("Number of Faculties: " + uni1.getNumberOfFaculties());
        System.out.print("Number of Departments for each Faculty: ");
        if (departments != null && departments.length > 0) {
            for (int i = 0; i < departments.length; i++) {
                System.out.print(departments[i] + (i < departments.length - 1 ? ", " : ""));
            }
            System.out.println();
        } else {
            System.out.println("N/A");
        }
        System.out.print("Facilities: ");
        if (uniFacilities != null && uniFacilities.length > 0) {
            for (int i = 0; i < uniFacilities.length; i++) {
                System.out.print(uniFacilities[i] + (i < uniFacilities.length - 1 ? ", " : ""));
            }
            System.out.println();
        } else {
            System.out.println("N/A");
        }
    }
}
