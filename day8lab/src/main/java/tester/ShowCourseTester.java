package tester;
import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.StudentDaoImpl;
import pojos.Course;
public class ShowCourseTester {

	public static void main(String[] args) {
	try(SessionFactory sf=getFactory();
			Scanner sc=new Scanner(System.in);){
		StudentDaoImpl dao=new StudentDaoImpl();
		System.out.println("Enter the course name...");
	      dao.getnameCourse(Course.valueOf(sc.next().toUpperCase())).forEach(System.out::print);
		System.out.println("Course........");
	}

	}

}
