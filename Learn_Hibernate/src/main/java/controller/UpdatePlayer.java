package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HibernateConfig.HibernateConfiguration;
import entity.Player;

public class UpdatePlayer {
   public static void main(String[] args) {
	SessionFactory sf = HibernateConfiguration.getSessionFactory();
	
	Session sesn = sf.openSession();
	
	Player player = new Player(8, "XYZ", 17, 250, 2300);
	
	sesn.update(player);
	sesn.beginTransaction().commit();
  }
}
