package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HibernateConfig.HibernateConfiguration;
import entity.Player;

public class LoadPlayer {
    public static void main(String[] args) {
      
        
       SessionFactory sf = HibernateConfiguration.getSessionFactory();
        Session s = sf.openSession();
        
        
        Player p = s.load (Player.class, 3);

        System.out.println(p);
    }
}
