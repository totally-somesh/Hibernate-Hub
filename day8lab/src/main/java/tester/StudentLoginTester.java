package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.StudentDaoImpl;
import pojos.Student;

public class StudentLoginTester {

	public static void main(String[] args) {
		try(SessionFactory sf=getFactory(); 
				Scanner sc=new Scanner(System.in);){
			StudentDaoImpl dao=new StudentDaoImpl ();
			System.out.println("Enter email and Password...");
                 System.out.println(dao.loginStudent(sc.next(), sc.next()));
                 
               //  System.out.println("Student login sucessfull.....");
	}catch (Exception e) {
		e.printStackTrace();
	}

}}
