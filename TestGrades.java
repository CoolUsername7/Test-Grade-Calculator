import java.util.Scanner;

public class TestGrades {
    public static void main (String[] args){
     Scanner input = new Scanner (System.in);
	char lettergrade;

	//Obtain Test Grades
	System.out.println("Enter three test grades: ");

	double test1 = input.nextDouble();
	double test2 = input.nextDouble();
	double test3 = input.nextDouble();

	//Calculate Average
	double average = (test1 + test2 + test3)/3.0;

	//Assign a letter grade
	if(average > 89.0)
	lettergrade = 'A';
	else if(average > 79.0)
	lettergrade = 'B';
	else if(average > 69.0)
	lettergrade = 'C';
	else if(average > 59.0)
	lettergrade = 'D';
	else lettergrade = 'F';

	//Display Results
	System.out.println("Your average is a(n) " + lettergrade);

    }
}