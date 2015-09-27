package com.rizki.mufrizal.belajarSpringMVCHibernate.service;

import com.rizki.mufrizal.belajarSpringMVCHibernate.domain.Makanan;
import com.rizki.mufrizal.belajarSpringMVCHibernate.repository.MakananRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author rizki
 * @since Sep 27, 2015
 */
@Service
@Transactional(readOnly = true)
public class MakananServiceImpl implements MakananService {

    @Autowired
    private MakananRepository makananRepository;

    @Transactional
    @Override
    public void save(Makanan makanan) {
        makananRepository.save(makanan);
    }

    @Transactional
    @Override
    public void update(Makanan makanan) {
        makananRepository.update(makanan);
    }

    @Transactional
    @Override
    public void delete(Makanan makanan) {
        makananRepository.delete(makanan);
    }

    @Override
    public Makanan getMakanan(String idMakanan) {
        return makananRepository.getMakanan(idMakanan);
    }

    @Override
    public List<Makanan> getMakanans() {
        return makananRepository.getMakanans();
    }

}
