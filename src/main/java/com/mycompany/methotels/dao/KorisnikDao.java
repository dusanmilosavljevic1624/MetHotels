/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.methotels.dao;

import com.mycompany.methotels.entities.Korisnik;
import java.util.List;

/**
 *
 * @author igor
 */
public interface KorisnikDao {
    
    public List<Korisnik> getListaSvihKorisnika();
    
    public Korisnik getKorisnikById(Integer id);
    
    public void dodajKorisnika(Korisnik korisnik);
    
    public void obrisiKorisnika(Integer id);
    
}
