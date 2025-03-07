/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editanameor.
 */

package model;

/**
 *
 * @author HP
 */
public class Book {
    private int bid;
    private String bname;
    private String authname;
    private int bprice; 
    private String bpub;
    
    
     public int getbid() {
        return bid;
    }
    public void setbid(int bid) {
        this.bid = bid;
    }

    public String getbname() {
        return bname;
    }

    public void setbname(String bname) {
        this.bname = bname;
    }

    
    public int getbprice() {
        return bprice;
    }

    public void setbprice(int bprice) {
        this.bprice = bprice;
    }

    public String getbpub() {
        return bpub;
    }

    public void setbpub(String bpub) {
        this.bpub = bpub;
    }

    public String getAuthname() {
        return authname;
    }

    public void setAuthname(String authname) {
        this.authname = authname;
    }

    @Override
    public String toString() {
        return "Book{" + "bid=" + bid + ", bname=" + bname + ", authname=" + authname + ", bprice=" + bprice + ", bpub=" + bpub + '}';
    }

    

   
    
}
