package com.foulkes.model;

/**
 * Created by danfoulkes on 08/07/2017.
 * Project: carFactory
 * Package: com.foulkes.model
 */
public class ThreeSpoke implements Wheel {

    Integer size = 0;


    @Override
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Wheel wheelBuilder(){
        ThreeSpoke threeSpoke = new ThreeSpoke();
        threeSpoke.setSize(30);
        return threeSpoke;
    }


}
