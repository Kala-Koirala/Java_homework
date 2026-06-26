public class StudentDashboard {
    public void displayCourseStatus(String studentId, String courseId, EligibilityRule rule) {
        System.out.println("Checking enrollment status for " + studentId + " in " + courseId + "...");
        try {
            boolean eligible = rule.isEligible(studentId, courseId);
            if (eligible) {
                System.out.println(" You are enrolled! Access course materials now.");
            }
        } catch (EnrollmentDeniedException e) {
            System.out.println(" Enrollment denied: " + e.getMessage() + ". Please contact support.");
        } finally {
            System.out.println("Status check completed for " + studentId + ".");
        }
    }

    public static void main(String[] args) {
        StudentDashboard sd = new StudentDashboard();

        EligibilityRule er = (studentId, courseId) -> {
            if (studentId.equals("SKILL999")) {
                throw new EnrollmentDeniedException("Student account suspended due to outstanding fees, Roshan!");
            }

            if (courseId.equals("JAVA101") && !studentId.startsWith("SKILL")) {
                throw new EnrollmentDeniedException("Invalid student ID format. Please use 'SKILL' prefix, Anisha!");
            }

            if (studentId.startsWith("SKILL") && courseId.equals("JAVA101")) {
                return true;
            }

            return false;
        };

        sd.displayCourseStatus("SKILL123", "JAVA101", er);
        sd.displayCourseStatus("SKILL999", "PYTHON101", er);
        sd.displayCourseStatus("STD101", "JAVA101", er);

    }
}