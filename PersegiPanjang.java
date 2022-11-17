/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lingkaran;

/**
 *
 * @author ACER
 */
public class PersegiPanjang {
    private int panjang;
    private int lebar;
    private double luas;
    
    public void setPanjang(int p){
        if (p > 0){
            this.panjang = p;
        }
        else{
            this.panjang = 0;
        }
    }
    
    public void setLebar(int l){
        if (1 > 0){
            this.lebar = 1;
        }
        else{
            this.lebar = 0;
        }
    }
    
    public double getLuas(){
        this.luas = this.panjang * this.lebar;
        return this.luas;
    }
    
}
