package lab8;

public class Lab8_3 {
	public static void main(String[] args) {
		Course course1 = new Course("AP Calculus");
		Course course2 = new Course("AP Physics");

		//Course1 students added
		course1.addStudent("Olivia Niakc");
		course1.addStudent("Lexi Sciortino");
		course1.addStudent("Marissa Pisacni");

		//Course2 students added 
		course2.addStudent("Olivia Nikac");
		course2.addStudent("Marissa Pisacni");
		course2.addStudent("Catherine Apostle");
		course2.addStudent("Amanda Foiles");

		System.out.println("Number of students in AP Calculus: " + course1.getNumberOfStudents());
			String[] students = course1.getStudents();
			for (int i = 0; i < course1.getNumberOfStudents(); i++) {
				System.out.print(students[i] + " ");
			}
				
		System.out.println();
		
		System.out.println("Number of students in AP Physic: " + course2.getNumberOfStudents());
			String[] students1 = course2.getStudents();
			for (int i = 0; i < course2.getNumberOfStudents(); i++) {
				System.out.print(students1[i] + " ");
			}
		
		System.out.println();
	}
}