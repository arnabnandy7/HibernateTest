package com.model.HibernateUtil;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class SessionHibernateUtil {
	public static SessionFactory getSessionFactory()
	{
		Configuration cfg=new Configuration();
		SessionFactory sf=cfg.configure().buildSessionFactory();
		return sf;
	}
}
