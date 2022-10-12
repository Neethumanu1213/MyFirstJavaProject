package assignmentWeek6;

public class CRSScoringMethods {

	// Method to calculate the CRS score for education
	int applicantEducation(String education) {
		int calculatedEducationPoints = 0;
		if (education.equals("PHD")) {
			calculatedEducationPoints = 25;
		} else if (education.equals("Masters")) {
			calculatedEducationPoints = 23;
		} else if (education.equals("DoubleDegree")) {
			calculatedEducationPoints = 22;
		} else if (education.equals("Bachelors")) {
			calculatedEducationPoints = 21;
		} else {
			calculatedEducationPoints = 0;
		}
		return calculatedEducationPoints;
	}

	// Method to calculate the CRS score for work experience
	int applicantWorkExperience(double experienceYears) {
		int calculatedExperiencePoints = 0;
		if ((experienceYears >= 4) && (experienceYears <= 5)) {
			calculatedExperiencePoints = 13;
		} else if (experienceYears >= 6) {
			calculatedExperiencePoints = 15;
		} else {
			calculatedExperiencePoints = 0;
		}
		return calculatedExperiencePoints;
	}

	// Method to calculate the CRS score for age
	int applicantAge(int age) {
		int calculatedAgePoints = 0;
		
			if ((age > 18) && (age <= 35)) {
				
				calculatedAgePoints = 12; 
				
			} else if (age > 35) {
				switch (age) {
				case 36:
					calculatedAgePoints = 11;
					break;
				case 37:
					calculatedAgePoints = 10;
					break;
				case 38:
					calculatedAgePoints = 9;
					break;
				case 39:
					calculatedAgePoints = 8;
					break;
				case 40:
					calculatedAgePoints = 7;
					break;
				case 41:
					calculatedAgePoints = 6;
					break;
				case 42:
					calculatedAgePoints = 5;
					break;
				case 43:
					calculatedAgePoints = 4;
					break;
				case 44:
					calculatedAgePoints = 3;
					break;
				case 45:
					calculatedAgePoints = 2;
					break;
				case 46:
					calculatedAgePoints = 1;
					break;
				case 47:
					calculatedAgePoints = 0;
					break;

				default:
					calculatedAgePoints = 0;
					break;
				}
			} 
				return calculatedAgePoints;
	}

	// Method to calculate the CRS score for IELTS speaking score
	int applicantIELTSListening(double listeningScore) {
		int calculatedIELTSListeningPoints = 0;
		if (listeningScore >= 8) {
			calculatedIELTSListeningPoints = 6;
		} else if (listeningScore == 7.5) {
			calculatedIELTSListeningPoints = 5;
		} else {
			calculatedIELTSListeningPoints = 0;
		}
		return calculatedIELTSListeningPoints;
	}

	// Method to calculate the CRS score for IELTS speaking score
	int applicantIELTSSpeaking(double speakingScore) {
		int calculatedIELTSSpeakingPoints = 0;
		if (speakingScore >= 7) {
			calculatedIELTSSpeakingPoints = 6;
		} else if (speakingScore == 6.5) {
			calculatedIELTSSpeakingPoints = 5;
		} else {
			calculatedIELTSSpeakingPoints = 0;
		}
		return calculatedIELTSSpeakingPoints;
	}

	// Method to calculate the CRS score for IELTS reading score
	int applicantIELTSReading(double readingScore) {
		int calculatedIELTSReadingPoints = 0;
		if (readingScore >= 7) {
			calculatedIELTSReadingPoints = 6;
		} else if (readingScore == 6.5) {
			calculatedIELTSReadingPoints = 5;
		} else {
			calculatedIELTSReadingPoints = 0;
		}
		return calculatedIELTSReadingPoints;
	}

	// Method to calculate the CRS score for IELTS writing score
	int applicantIELTSWriting(double writingScore) {
		int calculatedIELTSWritingPoints = 0;
		if (writingScore >= 7) {
			calculatedIELTSWritingPoints = 6;
		} else if (writingScore == 6.5) {
			calculatedIELTSWritingPoints = 5;
		} else {
			calculatedIELTSWritingPoints = 0;
		}
		return calculatedIELTSWritingPoints;
	}

	// Method to calculate the CRS score if any relatives in canada
	int relativeCheck(String relativesInCanada) {
		int calculatedPointsForRelative = 0;
		if (relativesInCanada.equals("Y")) {
			calculatedPointsForRelative = 5;
		} else {
			calculatedPointsForRelative = 0;
		}
		return calculatedPointsForRelative;
	}

	// Method to calculate the CRS score for studies in canada
	int studyCheck(String studiedInCanada) {
		int calculatedPointsForStudies = 0;
		if (studiedInCanada.equals("Y")) {
			calculatedPointsForStudies = 5;
		} else {
			calculatedPointsForStudies = 0;
		}
		return calculatedPointsForStudies;
	}

	// Method to calculate the CRS score for work experience in canada
	int workCheck(String workedInCanada) {
		int calculatedPointsForworking = 0;
		if (workedInCanada.equals("Y")) {
			calculatedPointsForworking = 10;
		} else {
			calculatedPointsForworking = 0;
		}
		return calculatedPointsForworking;
	}
}
