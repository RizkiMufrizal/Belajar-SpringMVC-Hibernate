package com.rizki.mufrizal.belajarSpringMVCHibernate.repository;

import com.rizki.mufrizal.belajarSpringMVCHibernate.domain.Makanan;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rizki
 * @since Sep 27, 2015
 */
@Repository
public class MakananRepositoryImpl implements MakananRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Makanan makanan) {
        sessionFactory.getCurrentSession().save(makanan);
    }

    @Override
    public void update(Makanan makanan) {
        sessionFactory.getCurrentSession().update(makanan);
    }

    @Override
    public void delete(Makanan makanan) {
        sessionFactory.getCurrentSession().delete(makanan);
    }

    @Override
    public Makanan getMakanan(String idMakanan) {
        return sessionFactory.getCurrentSession().get(Makanan.class, idMakanan);
    }

    @Override
    public List<Makanan> getMakanans() {
        return sessionFactory.getCurrentSession().createCriteria(Makanan.class).list();
    }

}
