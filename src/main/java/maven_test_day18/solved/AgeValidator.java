package maven_test_day18.solved;

public class AgeValidator {
	
	static boolean validateage(int age) {
		if(age <= 0) {
			throw new IllegalArgumentException("Invalid Age");
		}
		else {
			return true;
		}
	}

}
