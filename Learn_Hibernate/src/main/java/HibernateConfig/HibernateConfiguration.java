package HibernateConfig;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Player;

public class HibernateConfiguration {

    public static SessionFactory getSessionFactory() {
    	
        Configuration cfg = new Configuration();
        cfg.configure().addAnnotatedClass(Player.class);
        SessionFactory sf = cfg.buildSessionFactory();
        return sf;
    }
}
