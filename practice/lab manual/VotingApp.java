public class VotingApp {
    
    /**
     * Method to check if a person is eligible to vote
     * @param age The age of the person
     * @throws IllegalArgumentException if age is less than 18
     */
    public static void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        }
        System.out.println("Age " + age + " is eligible to vote. ✓");
    }
    
    public static void main(String[] args) {
        // Test cases with different ages
        int[] testAges = {15, 18, 25, 17, 65, 16, 21};
        
        System.out.println("=== Voting Eligibility Checker ===\n");
        
        for (int age : testAges) {
            try {
                System.out.println("Testing age: " + age);
                checkEligibility(age);
                
            } catch (IllegalArgumentException e) {
                System.out.println("Exception caught: " + e.getMessage());
                
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
                
            } finally {
                System.out.println("Validation process completed");
                System.out.println("---------------------------------");
            }
        }
        
        System.out.println("\n=== Individual Test Cases ===\n");
        
        // Test case 1: Valid age
        try {
            System.out.println("Test case 1: Age 30");
            checkEligibility(30);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Validation process completed\n");
        }
        
        // Test case 2: Invalid age (too young)
        try {
            System.out.println("Test case 2: Age 10");
            checkEligibility(10);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Validation process completed\n");
        }
        
        // Test case 3: Boundary age (exactly 18)
        try {
            System.out.println("Test case 3: Age 18 (boundary)");
            checkEligibility(18);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Validation process completed\n");
        }
        
        // Test case 4: Invalid age (below 18)
        try {
            System.out.println("Test case 4: Age 12");
            checkEligibility(12);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Validation process completed\n");
        }
    }
}
