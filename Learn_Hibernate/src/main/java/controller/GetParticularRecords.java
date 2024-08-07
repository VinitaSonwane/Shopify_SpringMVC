package controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import HibernateConfig.HibernateConfiguration;
import entity.Player;

public class GetParticularRecords {
public static void main(String[] args) {
	SessionFactory sf = HibernateConfiguration.getSessionFactory();
	Session sesn = sf.openSession();
	
	Criteria criteria = sesn.createCriteria(Player.class);
	criteria.setFirstResult(3);
	criteria.setMaxResults(4);
	
	List<Player> list = criteria.list();
	
	for (Player player : list) {
		System.out.println(player);
	}
}
}
