package dao;

import org.hibernate.Session;
import org.hibernate.*;
import pojo.Student;
import static utils.HibernateUtils.getFactory;
public class StudentDaoImpl implements StudentDao {
  public String msg="Adding Employee Details failed";
	@Override
	public String insertStudentDetails(Student s1) {
		
		Session session=getFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		try {
			session.save(s1);
			tx.commit();
		msg="getting information from id"+s1.getSid();
			
		}catch (RuntimeException e) {
			if(tx!=null)
				tx.rollback();
			throw e;
			
		}
		finally {
			if(session!=null)
				session.close();
		}
		
		
		
		
		return msg;
	}

}
