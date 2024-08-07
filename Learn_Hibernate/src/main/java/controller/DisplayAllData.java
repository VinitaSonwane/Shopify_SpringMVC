package controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import HibernateConfig.HibernateConfiguration;
import entity.Player;

public class DisplayAllData {
  public static void main(String[] args) {
	SessionFactory sf = HibernateConfiguration.getSessionFactory();
	Session sesn = sf.openSession();
	
	Criteria criteria = sesn.createCriteria(Player.class);
	List<Player> players = criteria.list();
	
	for (Player player : players) {
		System.out.println(player);
	}
}
}
