
import java.util.Scanner;
import java.io.File;

public class Test {
    public static void main(String[] args) {
        File employeeFile = new File("girdiQuiz1.txt");
        Scanner input = new Scanner(employeeFile);
        // Unhandled exception: java.io.FileNotFoundException
        // can't solve it
        while(input.hasNextLine()){
            String employeeLine = input.nextLine();
            String[] info = employeeLine.split(",");
            Employee emp;
            if (info[0].equals("Default") || info[0].equals("default")){
                emp = new Employee(); // no-arg constructor (ID:9999)
            }else{
                String nameSurname = info[0];
                int ID = Integer.parseInt(info[1]);  // int ID = info[1] gave error so automatically fixed it like that
                String department = info[2];
                String jobTitle = info[3];
                emp = new Employee(nameSurname,ID,department,jobTitle);
            }
            System.out.println(emp.toString());
            // unnecessary 'toString()' call
            // can't understand why gives an error like this
        }
    }
}
