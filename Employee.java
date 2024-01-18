public class Employee {
    private String nameSurname, department, jobTitle;
    private int ID;

    public Employee(){
        this.ID = 9999;
        this.nameSurname = "";
        this.department = "";
        this.jobTitle = "";

    }
    public Employee(String nameSurname, int ID, String department, String jobTitle){
        this.nameSurname = nameSurname;
        this.ID = ID;
        this.department = department;
        this.jobTitle = jobTitle;
    }
    // Accessor Methods
    public String getNameSurname(){
        return nameSurname;
    }
    public int getID(){
        return ID;
    }
    public String getDepartment(){
        return department;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    // Mutator Methods
    public void setNameSurname(String nameSurname){
        this.nameSurname = nameSurname;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    // Convert information to string
    public String toString(){
        return "Name Surname: " + nameSurname + "\n" +
            "Employee ID: " + ID + "\n" +
            "Department: " + department + "\n" +
            "Job Title: " + jobTitle + "\n";
    }


}
