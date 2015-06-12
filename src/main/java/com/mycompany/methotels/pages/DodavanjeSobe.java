/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.methotels.pages;

import com.mycompany.methotels.dao.KorisnikDao;
import com.mycompany.methotels.dao.SobaDao;
import com.mycompany.methotels.entities.Korisnik;
import com.mycompany.methotels.entities.Soba;
import java.util.ArrayList;
import java.util.List;
import org.apache.tapestry5.ValueEncoder;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.Messages;
import org.apache.tapestry5.ioc.annotations.Inject;

/**
 *
 * @author Dusan
 */
public class DodavanjeSobe {

    @Property
    private Soba soba;

    @Property
    private Soba onesoba;
    
    @Inject
    private Messages messages;
    
    @Inject
    private SobaDao SobaDao;
    
    @Inject KorisnikDao korisnikDao;
    
    @Property 
    private Korisnik korisnikId; 

    @Property
    @Persist
    private List<Korisnik> korisnici;
    public ValueEncoder getEncoder(){
        return new ValueEncoder<Korisnik>(){
            @Override
            public String toClient(Korisnik v){
                return String.valueOf(v.getKorisnikId());
            }
            
            @Override
            public Korisnik toValue(String string){
                Korisnik kor = korisnikDao.getKorisnikById(Integer.parseInt(string));
                return kor;
            }
        };
    }
    
    @Property
    private List<Soba> sobe;
    
    void onActivate() {
        
        soba = new Soba();
        if(sobe == null){
            sobe = new ArrayList<Soba>();
        }
        
        sobe = SobaDao.getListaSvihSoba();
        korisnici = korisnikDao.getListaSvihKorisnika();

    }

    @CommitAfter
    Object onSuccess() {
        
        soba.setKorisnikId(korisnikId);
        SobaDao.dodajSobu(soba);
        return this;
        
    }
    
    
    public String getKorisnik(){
        if(onesoba.getKorisnikId() !=null){
            return onesoba.getKorisnikId().getKorisnikIme();
        }else{
            return "";
        }
    }
    
    @CommitAfter
    Object onActionFromDelete(int id){
        SobaDao.obrisiSobu(id);
        return this;
    }

}
