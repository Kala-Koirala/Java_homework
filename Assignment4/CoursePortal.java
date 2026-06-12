public class CoursePortal {
    public static void main(String[] args) {
        LiveCourse lc = new LiveCourse("Physics-Electricity and Magnetism", "2 hours", "Bihag Sapkota", "8:00 PM - 10:00 PM");
        RecordedCourse rc = new RecordedCourse("Chemistry", "2.5 hours", "Abisha Baral", 15);

        lc.getCourseInfo();
        rc.getCourseInfo();
    }
}

abstract class Course{
    private String title;
    private String duration;
    private String instructor;

    public Course(String title, String duration, String instructor){
        this.title = title;
        this.duration = duration;
        this.instructor = instructor;
    }

    public void getCourseInfo(){
        System.out.println("Course Title: " + title);
        System.out.println("Duration: " + duration);
        System.out.println("Instructor: " + instructor);
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getDuration(){
        return duration;
    }
    public void setDuration(String duration){
        this.duration = duration;
    }

    public String getInstructor(){
        return instructor;
    }
    public void setInstructor(String instructor){
        this.instructor = instructor;
    }
}


class LiveCourse extends Course{
    private String scheduleTime;

    public LiveCourse(String title, String duration, String instructor, String scheduleTime){
        super(title, duration, instructor);
        this.scheduleTime = scheduleTime;
    }

    public String getScheduleTime(){
        return scheduleTime;
    }
    public void setScheduleTime(String scheduleTime){
        this.scheduleTime = scheduleTime;
    }

    @Override
    public void getCourseInfo(){
        System.out.println("Live Course...");
        System.out.println("Course Title: " + getTitle());
        System.out.println("Duration: " + getDuration());
        System.out.println("Instructor: " + getInstructor());
        System.out.println("Scheduled Time: " + scheduleTime);
        System.out.println(" ");
    }
}

class RecordedCourse extends Course{
    private int videoCount;

    public RecordedCourse(String title, String duration, String instructor, int videoCount){
        super(title, duration, instructor);
        this.videoCount = videoCount;
    }

    public int getVideoCount(){
        return videoCount;
    }
    public void setVideoCount(int videoCount){
        this.videoCount = videoCount;
    }

    @Override
    public void getCourseInfo(){
        System.out.println("Recoded Course...");
        System.out.println("Course Title: " + getTitle());
        System.out.println("Duration: " + getDuration());
        System.out.println("Instructor: " + getInstructor());
        System.out.println("Scheduled Time: " + videoCount);
        System.out.println(" ");
    }
}