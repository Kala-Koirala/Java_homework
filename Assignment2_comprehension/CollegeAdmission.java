import java.util.Scanner;

public class CollegeAdmission {
    public static void main(String[] args) {
        System.out.println("Available Stream");
        System.out.println("1. Science     2. Commerce     3. Arts");
        System.out.print("Choose any one stream (1-3): ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        Students std = new Students(choice);

        std.displayCourses();
        }
    }


class Students{
    String stream;
    int choice;

    public Students(int choice){
        this.choice = choice;
    }

    public void displayCourses(){

        switch(choice){
            case 1:
                System.out.println("Eligible courses for Science");
                System.out.println("1. BSC     2. Bsc. CSIT     3. Bio-medical Engineering    4.Civil Engineering");
                break;
            case 2:
                System.out.println("Eligible course for Commerce");
                System.out.println("1. BBA      2. BBS     3. BBA Finance      4. CA");
                break;
            case 3:
                System.out.println("Eligible course for Arts");
                System.out.println("1. Humanities     2. Journalism     3. Law      4. Design");
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
