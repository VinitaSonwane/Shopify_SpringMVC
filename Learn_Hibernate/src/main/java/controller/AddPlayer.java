package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HibernateConfig.HibernateConfiguration;
import entity.Player;

public class AddPlayer {
    public static void main(String[] args) {
        
        Player player = new Player(5,  "Rohit", 11 ,  69, 600);

        
        SessionFactory sf = HibernateConfiguration.getSessionFactory();

       Session session = sf.openSession();

        session.beginTransaction().commit();

        session.save(player);

       
        System.out.println("Done Successfully");
    }
}
