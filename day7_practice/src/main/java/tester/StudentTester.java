package tester;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.StudentDaoImpl;
import pojo.Course;
import pojo.Student;
public class StudentTester {

	public static void main(String[] args) {
		try(SessionFactory sf=getFactory(); 
				Scanner sc=new Scanner(System.in);){
			StudentDaoImpl dao=new StudentDaoImpl();
			System.out.println("Enter fname,  lname,  admmision_date,  type,  fees");
			Student s1=new Student(sc.next(),sc.next(),LocalDate.parse(sc.next()),Course.valueOf(sc.next().toUpperCase()),sc.nextDouble());
			System.out.println("Student="+dao.insertStudentDetails(s1));
			System.out.println("Student Inserted sucessfully...");
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
