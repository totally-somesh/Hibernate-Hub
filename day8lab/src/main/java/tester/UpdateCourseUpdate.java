package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.StudentDaoImpl;
import pojos.Course;
public class UpdateCourseUpdate {
public static void main(String[] args) {
	try(SessionFactory sf=getFactory();
			Scanner sc =new Scanner(System.in);){
		StudentDaoImpl dao=new StudentDaoImpl();
		System.out.println("Enter student id and course which is updated");
		dao.updateCourse(sc.nextInt(),Course.valueOf(sc.next().toUpperCase()));
		System.out.println("Course updated Sucessfully..");
	}catch (Exception e) {
		e.printStackTrace();
	}
}
}
