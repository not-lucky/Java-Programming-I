import java.util.*;

public class GradeStatistics {
	private ArrayList<Integer> points;
	private ArrayList<Integer> passingPoints;

	public GradeStatistics() {
		this.points = new ArrayList<>();
		this.passingPoints = new ArrayList<>();
	}

	public ArrayList<Integer> getPoints() {
		return this.points;
	}

	public ArrayList<Integer> getPassingPoints() {
		return this.passingPoints;
	}

	public double avrgPoint() {
		int sum = 0;

		for (Integer point: points) {
			sum += point;
		}

		return 1.0 * sum / points.size();
	}

	public double passingAvrgPoint() {
		int passingSum = 0;


        if (passingPoints.isEmpty()) {
            return 0.00;
		} else {
			for (Integer pass: passingPoints) {
				passingSum += pass;	
			}
		}

		return 1.0 * passingSum / passingPoints.size();
	}

	public double passPercentage() {

        int participants = points.size();
        int passing = passingPoints.size();

        if (participants == 0) {
            return -1;
        } else {
            return 100.00 * passing / participants;
        }
    }

    public int pointsToGrades(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public int numberOfGrades(int grade) {
    	int numberOfGrades = 0;

    	for (Integer point: points) {
    		if (pointsToGrades(point) == grade) {
    			numberOfGrades++;
    		}
    	}

    	return numberOfGrades;
    }


}