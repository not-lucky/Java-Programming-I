import java.util.*;

public class UserInterface {
	private GradeStatistics grades;
	private Scanner scanner;

	public UserInterface(GradeStatistics grades, Scanner scanner) {
		this.grades = grades;
		this.scanner = scanner;
	}

	public void start() {
		readPoints();
		printPointAverage();
		printPassingPointAverage();
		printPassPercentage();
		printGradeDistribution();
	}

	public void readPoints() {
		System.out.println("Enter point totals, -1 stops:");

		while (true) {
			int input = Integer.valueOf(scanner.nextLine());
			
			if (input == -1) {
				break;
			}

			if (input < 0 || input > 100) {
				continue;
			}

			grades.getPoints().add(input);

			if (input >= 50) {
				grades.getPassingPoints().add(input);
			}
		}
	}

	public void printPointAverage() {
		System.out.println("Point average (all): " + grades.avrgPoint());
	}

	public void printPassingPointAverage() {
		if (grades.passingAvrgPoint() == 0.00) {
			System.out.println("Point average (passing): -");
		} else {
			System.out.println("Point average (passing): " + grades.passingAvrgPoint());
		}
	}

	public void printPassPercentage() {
		if (grades.passPercentage() == -1) {
			System.out.println("Pass percentage: 0.0");
		} else {
			System.out.println("Pass percentage: " + grades.passPercentage());
			
		}
	}

	public void printGradeDistribution() {
		System.out.println("Grade distribution:");

		for (int i = 5; i >= 0; i--) {
			int numberOfGrades = grades.numberOfGrades(i);
			System.out.print(i + ": ");
			printStars(numberOfGrades);
			System.out.println("");
		}
		
	}

	public void printStars(int number) {
		for (int i = 0; i < number; i++) {
			System.out.print("*");
		}
	}
}