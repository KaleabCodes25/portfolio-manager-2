package com.pluralsight;

import com.pluralsight.finance.Valuable;

import java.math.BigDecimal;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner, List<Valuable> assets) {
        this.name = name;
        this.owner = owner;
        this.assets = assets;
    }

    public void add(Valuable asset){

    }
    private BigDecimal getValue(){
      return null;
    }
    public Valuable getMostValuable(){
        return null;
    }
    public Valuable getLeastValuable(){
        return null;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public List<Valuable> getAssets() {
        return assets;
    }
}
