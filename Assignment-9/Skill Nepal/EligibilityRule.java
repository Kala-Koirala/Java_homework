@FunctionalInterface
public interface EligibilityRule{
    boolean isEligible(String studentId, String courseId) throws EnrollmentDeniedException;
}

class EnrollmentDeniedException extends Exception{
    public EnrollmentDeniedException(String e){
        super(e);
    }
}
