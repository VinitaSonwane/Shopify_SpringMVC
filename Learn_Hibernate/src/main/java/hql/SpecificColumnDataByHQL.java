package hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import HibernateConfig.HibernateConfiguration;
import entity.Player;

public class SpecificColumnDataByHQL {
public static void main(String[] args) {
	SessionFactory sf = HibernateConfiguration.getSessionFactory();
	Session sesn = sf.openSession();
	
	Query<Object[]> query = sesn.createQuery("select id , totalRuns  from Player");
	
	List<Object[]> list = query.list();
	
	for (Object[] obj: list) {
		System.out.print(obj[0] + "\t");
		System.out.println(obj[1] );
	}
}
}
