package controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;

import HibernateConfig.HibernateConfiguration;
import entity.Player;

public class DisplayAllDataOrderByNameASC {
  public static void main(String[] args) {
	SessionFactory sf = HibernateConfiguration.getSessionFactory();
	Session sesn = sf.openSession();
	
	Criteria criteria = sesn.createCriteria(Player.class);
	criteria.addOrder(Order.desc("id"));
	
	
	List<Player> players = criteria.list();
	
	for (Player player : players) {
		System.out.println(player);
	}
}
}
