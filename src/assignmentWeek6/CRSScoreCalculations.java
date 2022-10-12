//Create a program to calculate the CRS Score of an individual based on the different
//criteria like age, Degree, IELTS score etc.

package assignmentWeek6;

import java.util.Scanner;

public class CRSScoreCalculations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// creating instance of class CRSScoringMethods using reference variable
		CRSScoringMethods crsScoreM = new CRSScoringMethods();

		// Taking input from user using scanner

		System.out.println(
				"Enter the Education " + "\n" + "PHD" + "\n" + "MASTERS" + "\n" + "DOUBLEDEGREE" + "\n" + "BACHELORS");
		String education = sc.next();

		// invoking the applicantEducation method using reference variable
		int educationPoints = crsScoreM.applicantEducation(education);

		System.out.println("Enter the work experience");
		double experienceYears = sc.nextDouble();

		// invoking the applicantWorkExperience method using reference variable
		int experiencePoints = crsScoreM.applicantWorkExperience(experienceYears);

		System.out.println("Enter your age");
		int age = sc.nextInt();

		// invoking the applicantAge(age) method using reference variable
		int agePoints = crsScoreM.applicantAge(age);

		System.out.println("Enter the IELTS score for listening");
		double listeningScore = sc.nextDouble();

		// invoking the applicantIELTSListening method using reference variable
		int listeningPoints = crsScoreM.applicantIELTSListening(listeningScore);

		System.out.println("Enter the IELTS score for speaking");
		double speakingScore = sc.nextDouble();

		// invoking the applicantIELTSSpeaking method using reference variable
		int speakingPoints = crsScoreM.applicantIELTSSpeaking(speakingScore);

		System.out.println("Enter the IELTS score for reading");
		double readingScore = sc.nextDouble();

		// invoking the applicantIELTSReading method using reference variable
		int readingPoints = crsScoreM.applicantIELTSReading(readingScore);

		System.out.println("Enter the IELTS score for writing");
		double writingScore = sc.nextDouble();

		// invoking the applicantIELTSWriting method using reference variable
		int writingPoints = crsScoreM.applicantIELTSWriting(writingScore);

		System.out.println("If you have a relative in Canada(Parents, Grand Parents, Brother, Sister, Aunt, Uncle,"
				+ "Nephew or Niece) who is a Canadian Citizen or PR holder (Y/N)");
		String relativesInCanada = sc.next();

		// invoking the relativeCheck method using reference variable
		int relativeCheck = crsScoreM.relativeCheck(relativesInCanada);

		System.out.println("Have you studied in Canada for atleast 2 years (Y/N)");
		String studiedInCanada = sc.next();

		// invoking the studyCheck method using reference variable
		int studyCheck = crsScoreM.studyCheck(studiedInCanada);

		System.out.println("Have you worked in Canada for atleast 1 years at NOC 0, A, B (Y/N)");
		String workedInCanada = sc.next();

		// invoking the workCheck method using reference variable
		int workCheck = crsScoreM.workCheck(workedInCanada);

		// To check the final crs points
		int finalCalculatedPoints = educationPoints + experiencePoints + agePoints + listeningPoints + speakingPoints
				+ readingPoints + writingPoints + relativeCheck + workCheck + studyCheck;

		System.out.println("Total points you have scored :" + finalCalculatedPoints);

		if (finalCalculatedPoints >= 67) {
			System.out.println("You are qualified  to submit an Expression of Interest (EOI) to Immigration Canada");
		} else {
			System.out.println("You are not qualified to submit an Expression of Interest (EOI) to Immigration Canada");
		}
	}

}
