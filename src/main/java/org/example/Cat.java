package org.example;

import java.util.List;

public class Cat extends Animal{

    public Cat(String placeOfLiving, List<String> friends) {
        this.placeOfLiving = placeOfLiving;
        this.friends = friends;
    }

    public Cat(String placeOfLiving) {
        this.placeOfLiving = placeOfLiving;
    }


    @Override
    public List<String> getFriends() {
        return friends;
    }

    public String getPlaceOfLiving() {
        return placeOfLiving;
    }
}
