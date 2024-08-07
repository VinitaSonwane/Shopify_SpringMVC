package hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import HibernateConfig.HibernateConfiguration;
import entity.Player;

public class AllDataByHQL {
public static void main(String[] args) {
	SessionFactory sf = HibernateConfiguration.getSessionFactory();
	Session sesn = sf.openSession();
	
	Query<Player> query = sesn.createQuery("from Player");
	
	List<Player> list = query.list();
	
	for (Player player : list) {
		System.out.println(player);
	}
}
}
