import java.util.ArrayList;
import java.util.List;

abstract class CourseType {
    String title;
    CourseType(String title) {
        this.title = title;
    }
    abstract String getEvaluationMethod();
}

class ExamCourse extends CourseType {
    ExamCourse(String title) {
        super(title);
    }
    String getEvaluationMethod() {
        return "Exam-Based";
    }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse(String title) {
        super(title);
    }
    String getEvaluationMethod() {
        return "Assignment-Based";
    }
}

class ResearchCourse extends CourseType {
    ResearchCourse(String title) {
        super(title);
    }
    String getEvaluationMethod() {
        return "Research-Based";
    }
}

class Course<T extends CourseType> {
    T courseType;
    Course(T courseType) {
        this.courseType = courseType;
    }
    void printDetails() {
        System.out.println("Course: " + courseType.title + ", Evaluation: " + courseType.getEvaluationMethod());
    }
}

class CourseManager {
    void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course.title + " - " + course.getEvaluationMethod());
        }
    }
}

public class gn3 {
    public static void main(String[] args) {
        Course<ExamCourse> math = new Course<>(new ExamCourse("Mathematics"));
        Course<AssignmentCourse> cs = new Course<>(new AssignmentCourse("Data Structures"));
        Course<ResearchCourse> thesis = new Course<>(new ResearchCourse("AI Research"));

        List<CourseType> courseList = new ArrayList<>();
        courseList.add(math.courseType);
        courseList.add(cs.courseType);
        courseList.add(thesis.courseType);

        CourseManager manager = new CourseManager();
        manager.displayCourses(courseList);
    }
}
