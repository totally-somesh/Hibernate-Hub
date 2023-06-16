package tester;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.StudentDaoImpl;
import pojos.Course;
import pojos.Student;
public class StudentTester {

	public static void main(String[] args) {
		try(SessionFactory sf=getFactory(); 
				Scanner sc=new Scanner(System.in);){
			StudentDaoImpl dao=new StudentDaoImpl ();
			boolean exit=false;
			while(!exit) {
				System.out.println("0.exit|1.Add Student|2.Student Login|3.show Course|4.Update Course by Id");
				switch(sc.nextInt()) {
				
				case 1:
					System.out.println("Enter=  first_name,  last_name,  dob,  email,  password,  type");
					Student s2=new Student(sc.next(),sc.next(),LocalDate.parse(sc.next()),sc.next(),sc.next(),Course.valueOf(sc.next().toUpperCase()));

					System.out.println(dao.addStudent(s2));
					System.out.println("Student added Sucessfully..... ");
					break;
				case 2:
					System.out.println("Enter email and Password...");
	                 System.out.println(dao.loginStudent(sc.next(), sc.next()));
	                 
	               System.out.println("Student login sucessfull.....");
					break;
				case 3:
					//StudentDaoImpl dao1=new StudentDaoImpl();
					System.out.println("Enter the course name...");
				      dao.getnameCourse(Course.valueOf(sc.next().toUpperCase())).forEach(System.out::print);
					System.out.println("Course........");
					break;
				case 4:
					//StudentDaoImpl dao2=new StudentDaoImpl();
					System.out.println("Enter student id and course which is updated");
					dao.updateCourse(sc.nextInt(),Course.valueOf(sc.next().toUpperCase()));
					System.out.println("Course updated Sucessfully..");
					break;
				case 0:
				exit=true;
				break;
				}
				
			}
			
			
			
		}catch (Exception e) {
		e.printStackTrace();
		}

	}

}
//System.out.println("Enter=  first_name,  last_name,  dob,  email,  password,  type");
//Student s2=new Student(sc.next(),sc.next(),LocalDate.parse(sc.next()),sc.next(),sc.next(),Course.valueOf(sc.next().toUpperCase()));

//System.out.println(dao.addStudent(s2));
//System.out.println("Student added Sucessfully..... ");