package controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import HibernateConfig.HibernateConfiguration;
import entity.Player;

public class RestrictionExample {
public static void main(String[] args) {
	SessionFactory sf = HibernateConfiguration.getSessionFactory();
	
	Session sesn = sf.openSession();
	
	Criteria criteria = sesn.createCriteria(Player.class);
	
	criteria.add(Restrictions.gt("totalRuns" , 1234));
	
	
	List<Player> players = criteria.list();
	
	for (Player player : players) {
		System.out.println(player);
	}
}
}
