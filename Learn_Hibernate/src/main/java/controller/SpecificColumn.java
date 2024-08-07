package controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import HibernateConfig.HibernateConfiguration;
import entity.Player;

public class SpecificColumn {
public static void main(String[] args) {
	SessionFactory sf = HibernateConfiguration.getSessionFactory();
	
	Session sesn = sf.openSession();
	Criteria criteria = sesn.createCriteria(Player.class);
	
	ProjectionList projectionList = Projections.projectionList();
	projectionList.add(Projections.property("id"));
	projectionList.add(Projections.property("name"));
	projectionList.add(Projections.property("totalRuns"));
	
	criteria.setProjection(projectionList);
	
	List<Object[]> list = criteria.list();
	
	for (Object[] obj : list) {
		System.out.print(obj[0] + "\t");
		System.out.print(obj[1] +"\t");
		System.out.println(obj[2] +"\t");
	}
}
}
