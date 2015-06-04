/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.methotels.data;

import org.apache.tapestry5.ioc.annotations.Inject;

/**
 *
 * @author Dusan
 */
public class Soba {
    private String imeSobe; 
    private int sprat; 
    private boolean tv; 
    private boolean djakuzi; 
    private boolean internet; 
    
    
    @Inject

    public Soba() {
    }
 
    
    public Soba(String imeSobe, int sprat, boolean tv, boolean djakuzi, boolean internet) {
        this.imeSobe = imeSobe;
        this.sprat = sprat;
        this.tv = tv;
        this.djakuzi = djakuzi;
        this.internet = internet;
    }

    public String getImeSobe() {
        return imeSobe;
    }

    public void setImeSobe(String imeSobe) {
        this.imeSobe = imeSobe;
    }

    public int getSprat() {
        return sprat;
    }

    public void setSprat(int sprat) {
        this.sprat = sprat;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isDjakuzi() {
        return djakuzi;
    }

    public void setDjakuzi(boolean djakuzi) {
        this.djakuzi = djakuzi;
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }
    
    
    
}