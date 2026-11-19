package com.pluralsight;

import com.pluralsight.finance.Valuable;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    public void add(Valuable asset) {
        assets.add(asset);

    }

    private BigDecimal getValue() {

        BigDecimal netValue = BigDecimal.ZERO;

        for (Valuable asset : assets) {
            netValue = netValue.add(asset.getValue());
        }

        return netValue;
    }

    public Valuable getMostValuable() {

        Valuable mostValuable = assets.get(0);

        for (Valuable asset : assets) {
            if (asset.getValue().compareTo(mostValuable.getValue()) > 0 ){
                mostValuable = asset;
            }

        }
        return mostValuable;
    }

    public Valuable getLeastValuable() {
        Valuable leastValuable = assets.get(0);

        for (Valuable asset : assets) {
            if(asset.getValue().compareTo(leastValuable.getValue()) < 0 ){
                leastValuable = asset;
            }

        }
        return leastValuable;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setAssets(List<Valuable> assets) {
        this.assets = assets;
    }
}
