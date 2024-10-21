package com.COMP2024;

import java.util.ArrayList;

public class Zoo {

    private String location;
    private int numCompounds;
    private int zooID;
    private ArrayList<Compounds> compounds;

    public static int zooNums;

    public Zoo(String location, int numCompounds) {
        zooNums++;
        this.setZooID(zooNums);
        this.setnumCompounds(numCompounds);
        this.setLocation(location);
        compounds = new ArrayList<Compounds>();
        for(int i = 0; i < numCompounds; i++) {
            addCompound(new Compounds());
        }
    }

    private void addCompound(Compounds compound) {
        this.compounds.add(compound);
    }

    public Zoo(){
        zooNums++;
        this.zooID = zooNums;
        this.setLocation("unknown");
        this.numCompounds = 30;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getnumCompounds() {
        return numCompounds;
    }

    public void setnumCompounds(int numberOfCompounds) {
        this.numCompounds = numberOfCompounds;
    }

    public void buildNewCompound() {
        this.numCompounds++; // 将化合物数量加 1
    }

    public String printInfo() {
        return "ZooID: "+this.zooID+" The location is " + this.location + " and the number of compounds is " + this.numCompounds+".";
    }


    //The reason there shouldn't be a public setter method:
    //Helps maintain the integrity of the object by preventing external code from accidentally or maliciously modifying
    //the ID, or inadvertently assigning the same ID to different objects.
    public int getZooID() {
        return zooID;
    }

    private void setZooID(int zooNums){
        zooID = zooNums;
    }

}
