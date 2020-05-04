package com.model.BS;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.model.Entity.Product;
import com.model.HibernateUtil.SessionHibernateUtil;

public class ProductBS {
	SessionFactory sf=SessionHibernateUtil.getSessionFactory();
	public int CreateProduct(Product p)
	{
		Session ss=sf.openSession();
		Transaction tt=ss.beginTransaction();
		ss.save(p);
		tt.commit();
		ss.close();
		return 1;
	}
	public void readProductById(int pid)
	{
		Session ss=sf.openSession();
		Product p=(Product)ss.get(Product.class, pid);
		System.out.println(p.getPid()+"   "+p.getPname()+"   "+p.getPrice());
		ss.close();
	}
	public List<Product> ReadAll()
	{
		Session ss=sf.openSession();
		Query query=ss.createQuery("from Product");
		List<Product> List=query.list();
		return List;
	}
	public int update(Product p)
	{
		Session ss=sf.openSession();
		Transaction tt=ss.beginTransaction();
		ss.update(p);
		tt.commit();
		ss.close();
		return 1;
	}
}
