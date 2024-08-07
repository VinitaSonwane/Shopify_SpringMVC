package projections;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

import HibernateConfig.HibernateConfiguration;
import entity.Player;

public class NumberOfPlayers {
public static void main(String[] args) {
	SessionFactory sf = HibernateConfiguration.getSessionFactory();
	Session sesn = sf.openSession();
	
	Criteria criteria = sesn.createCriteria(Player.class);
	//criteria.setProjection(Projections.rowCount());
	//criteria.setProjection(Projections.max("totalRuns"));
	//criteria.setProjection(Projections.min("totalRuns"));
	//criteria.setProjection(Projections.avg("totalRuns"));
	criteria.setProjection(Projections.sum ("totalRuns"));
	List<Long> list = criteria.list();
	if(list.isEmpty()) {
		System.out.println(0);
	}
	else {
		Long count = list.get(0);
		System.out.println(list);
	}
	
}
}
