public class University {
    private String name;
    private int yearOfEstablishment;
    private int numberOfStudents;
    private int numberOfFacultyMembers;
    private int numberOfFaculties;
    private int[] numberOfDepartments;
    private String[] facilities;

    // Default
    public University() {
        this.name = "";
        this.yearOfEstablishment = 0;
        this.numberOfStudents = 0;
        this.numberOfFacultyMembers = 0;
        this.numberOfFaculties = 0;
        this.numberOfDepartments = new int[0];
        this.facilities = new String[3]; // initialized with 3 empty strings
        for (int i = 0; i < 3; i++) {
            this.facilities[i] = "";
        }
    }

    // Constructor with parameters
    public University(String name, int yearOfEstablishment, int numberOfStudents,
                      int numberOfFacultyMembers, int numberOfFaculties,
                      int[] numberOfDepartments, String[] facilities) {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.numberOfStudents = numberOfStudents;
        this.numberOfFacultyMembers = numberOfFacultyMembers;
        this.numberOfFaculties = numberOfFaculties;
        this.numberOfDepartments = numberOfDepartments;
        this.facilities = facilities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfEstablishment() {
        return yearOfEstablishment;
    }

    public void setYearOfEstablishment(int yearOfEstablishment) {
        this.yearOfEstablishment = yearOfEstablishment;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getNumberOfFacultyMembers() {
        return numberOfFacultyMembers;
    }

    public void setNumberOfFacultyMembers(int numberOfFacultyMembers) {
        this.numberOfFacultyMembers = numberOfFacultyMembers;
    }

    public int getNumberOfFaculties() {
        return numberOfFaculties;
    }

    public void setNumberOfFaculties(int numberOfFaculties) {
        this.numberOfFaculties = numberOfFaculties;
    }

    public int[] getNumberOfDepartments() {
        return numberOfDepartments;
    }

    public void setNumberOfDepartments(int[] numberOfDepartments) {
        this.numberOfDepartments = numberOfDepartments;
    }

    public String[] getFacilities() {
        return facilities;
    }

    public void setFacilities(String[] facilities) {
        this.facilities = facilities;
    }


}