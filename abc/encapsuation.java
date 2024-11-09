import java.util.ArrayList;

public class Student {

private String name;

private int id;

private ArrayList<Course> courses;

public Student(String name, int id) {

this.name = name;

this.id = id;

courses = new ArrayList<>();

}

public void addCourse(Course course) {

courses.add(course);

}

public void removeCourse(Course course) {

courses.remove(course);

}

public ArrayList<Course> getCourses() {

return courses;

}

public double getGPA() {

if (courses.isEmpty()) {

return 0.0;

}

double total = 0;

for (Course course : courses) {

total += course.getGrade();

}

return total / courses.size();

}

}

class Course {

private String name;

private int credits;

private double grade;

public Course(String name, int credits) {

this.name = name;

this.credits = credits;

}

public void setGrade(double grade) {

this.grade = grade;

}

public double getGrade() {

return grade;

}

public int getCredits() {

return credits;

}

}

public class encapsuation {

public static void main(String[] args) {

// Create a Student object

Student student = new Student("Alice", 12345);

// Create Course objects

Course math = new Course("Mathematics", 3);

Course science = new Course("Science", 4);

// Set grades for each course

math.setGrade(3.5); // For example, a grade of 3.5 for Mathematics

science.setGrade(4.0); // A grade of 4.0 for Science

// Add courses to the student's course list

student.addCourse(math);

student.addCourse(science);

// Calculate and print the GPA

System.out.println("Student GPA: " + student.getGPA());

}

}