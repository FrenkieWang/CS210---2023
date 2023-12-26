package january2019;

public class Q2 {

    public static void main(String[] args) {
        int totalSimulations = 1000000; // Number of simulations
        int countBThirdPlace = 0; // Counter for Horse B finishing third

        for (int i = 0; i < totalSimulations; i++) { // A[0,53) B[53,79) C[79,93) D 93,100]
            double randomValue = Math.random() * 100; // Generate a random number between 0 and 100

            // Determine First Place Horse
            char firstPlace = (randomValue < 53) ? 'A' : (randomValue < 79) ? 'B' : (randomValue < 93) ? 'C' : 'D';

            // Determine Second Place Horse (exclude First Place)
            randomValue = Math.random() * (100 - getProbability(firstPlace));
            char secondPlace;
            if (firstPlace == 'A') { // B[0,26) C[26,40) D[40,47]
                secondPlace = (randomValue < 26) ? 'B' : (randomValue < 40) ? 'C' : 'D';
            } else if (firstPlace == 'B') { // A[0,53) C[53,67) D[67,74]          	
                secondPlace = (randomValue < 53) ? 'A' : (randomValue < 67) ? 'C' : 'D';
            } else if (firstPlace == 'C') { // A[0,53) B[53,79) D[79,86]            	
                secondPlace = (randomValue < 53) ? 'A' : (randomValue < 79) ? 'B' : 'D';             
            } else { // A[0,53) B[53,79) C[79,93]
                secondPlace = (randomValue < 53) ? 'A' : (randomValue < 79) ? 'B' : 'C';
            }
            
            // Determine Third Place Horse (exclude First Place and Second Place)
            randomValue = Math.random() * (100 - getProbability(firstPlace) - getProbability(secondPlace));
            char thirdPlace;
            if ((firstPlace == 'A' && secondPlace == 'B') || (firstPlace == 'B' && secondPlace == 'A')) {             	
                thirdPlace = (randomValue < 14) ? 'C' : 'D'; // C[0,14) D[14,21]
            } else if ((firstPlace == 'A' && secondPlace == 'C') || (firstPlace == 'C' && secondPlace == 'A')) {             	
                thirdPlace = (randomValue < 26) ? 'B' : 'D'; // B[0,26) D[26,33]
            } else if ((firstPlace == 'A' && secondPlace == 'D') || (firstPlace == 'D' && secondPlace == 'A')) {            	
                thirdPlace = (randomValue < 26) ? 'B' : 'C'; // B[0,26) C[26,40]
            } else if ((firstPlace == 'B' && secondPlace == 'C') || (firstPlace == 'C' && secondPlace == 'B')) {            	
                thirdPlace = (randomValue < 53) ? 'A' : 'D'; // A[0,53) D[53,60]
            } else if ((firstPlace == 'B' && secondPlace == 'D') || (firstPlace == 'D' && secondPlace == 'B')) {            	
                thirdPlace = (randomValue < 53) ? 'A' : 'C'; // A[0,53) C[53,67]
            }else {
                thirdPlace = (randomValue < 53) ? 'A' : 'B'; // A[0,53) B[53,79]
            }

            // If Horse B finishes third, increment the counter
            if (thirdPlace == 'B') {
                countBThirdPlace++;
            }
        }

        // Calculate and print the estimated probability
        double estimatedProbability = (double) 100 * countBThirdPlace / totalSimulations;
        System.out.printf("Estimated probability that Horse B finishes third: %.2f %%", estimatedProbability);
    }

    // Helper method to get probability based on horse
    private static double getProbability(char horse) {
        switch (horse) {
            case 'A': return 53;
            case 'B': return 26;
            case 'C': return 14;
            case 'D': return 7;
            default:  return 0;
        }
    }
}