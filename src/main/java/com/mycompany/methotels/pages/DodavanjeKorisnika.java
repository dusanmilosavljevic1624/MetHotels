/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.methotels.pages;

import com.mycompany.methotels.dao.KorisnikDao;
import com.mycompany.methotels.entities.Korisnik;
import java.util.ArrayList;
import java.util.List;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.annotations.Inject;

/**
 *
 * @author igor
 */
public class DodavanjeKorisnika {
    
    @Property
    private Korisnik korisnik; 
    
    @Property
    private Korisnik onekorisnik;
    
    @Inject
    private KorisnikDao korisnikDao;
    
    @Property
    private List<Korisnik> korisnici;
    
    void onActivate(){
        if(korisnici == null){
            korisnici = new ArrayList<Korisnik>();
        }
        
        korisnici = korisnikDao.getListaSvihKorisnika();
        
    }
    
    @CommitAfter
    Object onSuccess(){
        korisnikDao.dodajKorisnika(korisnik);
        return this;
    }
    
    
    @CommitAfter
    Object onActionFromDelete(int id){
        korisnikDao.obrisiKorisnika(id);
        return this;
    }
    
}
