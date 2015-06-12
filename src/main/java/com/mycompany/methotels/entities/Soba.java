/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.methotels.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import org.apache.tapestry5.beaneditor.Validate;
import org.apache.tapestry5.ioc.annotations.Inject;

/**
 *
 * @author igor
 */
@Entity
@Table(name = "soba")
@NamedQueries({
    @NamedQuery(name = "Soba.findAll", query = "SELECT s FROM Soba s")})
public class Soba implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Soba_Id")
    private Integer sobaId;
    @Basic(optional = false)
    @Lob
    @Validate("required, minLength=5")
    @Column(name = "Soba_Ime")
    private String sobaIme;
    @Basic(optional = false)
    @Column(name = "Soba_Tv")
    private boolean sobaTv;
    @Basic(optional = false)
    @Column(name = "Soba_Internet")
    private boolean sobaInternet;
    @Basic(optional = false)
    @Column(name = "Soba_Djakuzi")
    private boolean sobaDjakuzi;
    @JoinColumn(name = "Korisnik_Id", referencedColumnName = "Korisnik_Id")
    @ManyToOne
    private Korisnik korisnikId;

    @Inject
    public Soba() {
    }

    public Soba(Integer sobaId) {
        this.sobaId = sobaId;
    }

    public Soba(Integer sobaId, String sobaIme, boolean sobaTv, boolean sobaInternet, boolean sobaDjakuzi) {
        this.sobaId = sobaId;
        this.sobaIme = sobaIme;
        this.sobaTv = sobaTv;
        this.sobaInternet = sobaInternet;
        this.sobaDjakuzi = sobaDjakuzi;
    }

    public Integer getSobaId() {
        return sobaId;
    }

    public void setSobaId(Integer sobaId) {
        this.sobaId = sobaId;
    }

    public String getSobaIme() {
        return sobaIme;
    }

    public void setSobaIme(String sobaIme) {
        this.sobaIme = sobaIme;
    }

    public boolean getSobaTv() {
        return sobaTv;
    }

    public void setSobaTv(boolean sobaTv) {
        this.sobaTv = sobaTv;
    }

    public boolean getSobaInternet() {
        return sobaInternet;
    }

    public void setSobaInternet(boolean sobaInternet) {
        this.sobaInternet = sobaInternet;
    }

    public boolean getSobaDjakuzi() {
        return sobaDjakuzi;
    }

    public void setSobaDjakuzi(boolean sobaDjakuzi) {
        this.sobaDjakuzi = sobaDjakuzi;
    }

    public Korisnik getKorisnikId() {
        return korisnikId;
    }

    public void setKorisnikId(Korisnik korisnikId) {
        this.korisnikId = korisnikId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sobaId != null ? sobaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Soba)) {
            return false;
        }
        Soba other = (Soba) object;
        if ((this.sobaId == null && other.sobaId != null) || (this.sobaId != null && !this.sobaId.equals(other.sobaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.methotels.entities.Soba[ sobaId=" + sobaId + " ]";
    }

}
