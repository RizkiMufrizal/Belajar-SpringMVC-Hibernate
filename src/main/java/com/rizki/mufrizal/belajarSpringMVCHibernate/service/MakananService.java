package com.rizki.mufrizal.belajarSpringMVCHibernate.service;

import com.rizki.mufrizal.belajarSpringMVCHibernate.domain.Makanan;
import java.util.List;

/**
 *
 * @author rizki
 * @since Sep 27, 2015
 */
public interface MakananService {

    public void save(Makanan makanan);

    public void update(Makanan makanan);

    public void delete(Makanan makanan);

    public Makanan getMakanan(String idMakanan);

    public List<Makanan> getMakanans();
}
