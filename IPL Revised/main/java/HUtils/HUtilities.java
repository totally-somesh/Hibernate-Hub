package HUtils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HUtilities {
	
	private static SessionFactory factory;
	
	static {
		
		factory = new Configuration()
		.configure()
		.buildSessionFactory();
	}

	public static SessionFactory getFactory() {
		return factory;
	}
	
}
