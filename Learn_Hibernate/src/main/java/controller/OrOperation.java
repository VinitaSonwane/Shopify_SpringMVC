package controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;

import HibernateConfig.HibernateConfiguration;
import entity.Player;

public class OrOperation {
public static void main(String[] args) {
	SessionFactory sf = HibernateConfiguration.getSessionFactory();
	Session sesn = sf.openSession();
	
    Criteria criteria = sesn.createCriteria(Player.class);
    SimpleExpression eqId = Restrictions.eq("id", 6);
    SimpleExpression eqRun = Restrictions.eq("totalRuns", 80);
    
	criteria.add(Restrictions.or(eqId,eqRun));
	
	List<Player> list = criteria.list();
	
	for (Player player : list) {
		System.out.println(player);
	}
}
}
