package org.example;

import java.util.List;

public class Lion extends Animal{

    List<String> kittens;

public Lion() {}
    public Lion(String placeOfLiving, List<String> friends, List<String> kittens) {
        this.placeOfLiving = placeOfLiving;
        this.friends = friends;
        this.kittens = kittens;
    }

    @Override
    public List<String> getFriends() {
        return friends;
    }

    @Override
    public String getPlaceOfLiving() {
        return placeOfLiving;
    }

    public List<String> getKittens() {
        return kittens;
    }
}
