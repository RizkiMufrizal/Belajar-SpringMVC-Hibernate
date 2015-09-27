package com.rizki.mufrizal.belajarSpringMVCHibernate.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author rizki
 * @since Sep 27, 2015
 */
@Entity
@Table(name = "tb_makanan")
public class Makanan implements Serializable {

    @Id
    @Column(name = "idMakanan", length = 150)
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String idMakanan;

    @Column(name = "namaMakanan", length = 40)
    private String namaMakanan;

    @Column(name = "hargaMakanan")
    private BigDecimal hargaMakanan;

    @JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
    @Column(name = "tanggalKadaluarsa")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tanggalKadaluarsa;

    /**
     * @return the idMakanan
     */
    public String getIdMakanan() {
        return idMakanan;
    }

    /**
     * @param idMakanan the idMakanan to set
     */
    public void setIdMakanan(String idMakanan) {
        this.idMakanan = idMakanan;
    }

    /**
     * @return the namaMakanan
     */
    public String getNamaMakanan() {
        return namaMakanan;
    }

    /**
     * @param namaMakanan the namaMakanan to set
     */
    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    /**
     * @return the hargaMakanan
     */
    public BigDecimal getHargaMakanan() {
        return hargaMakanan;
    }

    /**
     * @param hargaMakanan the hargaMakanan to set
     */
    public void setHargaMakanan(BigDecimal hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }

    /**
     * @return the tanggalKadaluarsa
     */
    public Date getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }

    /**
     * @param tanggalKadaluarsa the tanggalKadaluarsa to set
     */
    public void setTanggalKadaluarsa(Date tanggalKadaluarsa) {
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
}
