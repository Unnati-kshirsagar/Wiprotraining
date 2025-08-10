package com.wipro.pan.repo;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.wipro.hibernatedemo.entity.PanCard;
import com.wipro.hibernatedemo.util.HibernateUtilPan;

public class PanRepo {

    public static void createPan(PanCard panCard) {
        Session session = HibernateUtilPan.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.persist(panCard);
        tx.commit();
        session.close();
    }

    public static PanCard findById(int id) {
        Session session = HibernateUtilPan.getSessionFactory().openSession();
        PanCard p = session.get(PanCard.class, id);
        session.close();
        return p;
    }

    public static void updatePan(PanCard panCard) {
        Session session = HibernateUtilPan.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.merge(panCard);
        tx.commit();
        session.close();
    }

    public static void deleteById(int id) {
        Session session = HibernateUtilPan.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        PanCard pan = session.get(PanCard.class, id);
        if (pan != null)
            session.remove(pan);
        tx.commit();
        session.close();
    }

    public static List<PanCard> findAll() {
        Session session = HibernateUtilPan.getSessionFactory().openSession();
        List<PanCard> list = session.createQuery("from PanCard", PanCard.class).list();
        session.close();
        return list;
    }

    public static List<String> findAllHolderNames() {
        Session session = HibernateUtilPan.getSessionFactory().openSession();
        List<String> names = session.createQuery("select p.holderName from PanCard p", String.class).list();
        session.close();
        return names;
    }

    public static List<PanCard> findByPanNumber(String panNumber) {
        Session session = HibernateUtilPan.getSessionFactory().openSession();
        Query<PanCard> query = session.createQuery("from PanCard where panNumber = :pan", PanCard.class);
        query.setParameter("pan", panNumber);
        List<PanCard> results = query.list();
        session.close();
        return results;
    }
}
