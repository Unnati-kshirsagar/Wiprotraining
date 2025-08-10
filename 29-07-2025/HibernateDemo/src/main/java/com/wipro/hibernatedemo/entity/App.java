package com.wipro.hibernatedemo.entity;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.wipro.hibernatedemo.util.HibernateUtil;

public class App {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Pan pan = new Pan(101, "Unnati Patil", "ABCDE1234F");
        session.persist(pan);

        transaction.commit();
        System.out.println("PAN Record Saved: " + pan);
    }
}
