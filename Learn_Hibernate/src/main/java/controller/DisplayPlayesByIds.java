package controller;

import java.util.List;

import org.hibernate.MultiIdentifierLoadAccess;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HibernateConfig.HibernateConfiguration;
import entity.Player;

public class DisplayPlayesByIds {
 public static void main(String[] args) {
	SessionFactory sf = HibernateConfiguration.getSessionFactory();
	Session s = sf.openSession();
	List<Player> players = s.byMultipleIds(Player.class).multiLoad(1,6);
	
	for (Player player : players) {
		System.out.println(player);
		
	}
	
}
}
