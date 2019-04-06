package lab7;

public class CourseTest {

	public static void main(String[] args) {
        Course course = new Course("CSE");
        // add three students
        course.addStudent("Marissa");
        course.addStudent("Catherine");
        course.addStudent("Olivia");
        // remove one student
        course.dropStudent("Catherine");
        // display students
        System.out.println("Students in the course are");
        for(int i = 0; i < course.getNumberOfStudents(); ++i) {
            System.out.println(course.getStudents()[i]);
        }
    }


}