/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.methotels.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author igor
 */
@Entity
@Table(name = "korisnik")
@NamedQueries({
    @NamedQuery(name = "Korisnik.findAll", query = "SELECT k FROM Korisnik k")})
public class Korisnik implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Korisnik_Id")
    private Integer korisnikId;
    @Basic(optional = false)
    @Lob
    @Column(name = "Korisnik_Ime")
    private String korisnikIme;
    @Basic(optional = false)
    @Lob
    @Column(name = "Korisnik_Prezime")
    private String korisnikPrezime;
    @Basic(optional = false)
    @Lob
    @Column(name = "Korisnik_Email")
    private String korisnikEmail;
    @Basic(optional = false)
    @Lob
    @Column(name = "Korisnik_Lozinka")
    private String korisnikLozinka;
    @Basic(optional = false)
    @Column(name = "Korisnik_Admin")
    private boolean korisnikAdmin;
    @OneToMany(mappedBy = "korisnikId")
    private List<Soba> sobaList;

    public Korisnik() {
    }

    public Korisnik(Integer korisnikId) {
        this.korisnikId = korisnikId;
    }

    public Korisnik(Integer korisnikId, String korisnikIme, String korisnikPrezime, String korisnikEmail, String korisnikLozinka, boolean korisnikAdmin) {
        this.korisnikId = korisnikId;
        this.korisnikIme = korisnikIme;
        this.korisnikPrezime = korisnikPrezime;
        this.korisnikEmail = korisnikEmail;
        this.korisnikLozinka = korisnikLozinka;
        this.korisnikAdmin = korisnikAdmin;
    }

    public Integer getKorisnikId() {
        return korisnikId;
    }

    public void setKorisnikId(Integer korisnikId) {
        this.korisnikId = korisnikId;
    }

    public String getKorisnikIme() {
        return korisnikIme;
    }

    public void setKorisnikIme(String korisnikIme) {
        this.korisnikIme = korisnikIme;
    }

    public String getKorisnikPrezime() {
        return korisnikPrezime;
    }

    public void setKorisnikPrezime(String korisnikPrezime) {
        this.korisnikPrezime = korisnikPrezime;
    }

    public String getKorisnikEmail() {
        return korisnikEmail;
    }

    public void setKorisnikEmail(String korisnikEmail) {
        this.korisnikEmail = korisnikEmail;
    }

    public String getKorisnikLozinka() {
        return korisnikLozinka;
    }

    public void setKorisnikLozinka(String korisnikLozinka) {
        this.korisnikLozinka = korisnikLozinka;
    }

    public boolean getKorisnikAdmin() {
        return korisnikAdmin;
    }

    public void setKorisnikAdmin(boolean korisnikAdmin) {
        this.korisnikAdmin = korisnikAdmin;
    }

    public List<Soba> getSobaList() {
        return sobaList;
    }

    public void setSobaList(List<Soba> sobaList) {
        this.sobaList = sobaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (korisnikId != null ? korisnikId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Korisnik)) {
            return false;
        }
        Korisnik other = (Korisnik) object;
        if ((this.korisnikId == null && other.korisnikId != null) || (this.korisnikId != null && !this.korisnikId.equals(other.korisnikId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.methotels.entities.Korisnik[ korisnikId=" + korisnikId + " ]";
    }
    
}
