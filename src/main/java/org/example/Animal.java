package org.example;

import java.util.List;

public abstract class Animal {
    String placeOfLiving;
    List<String> friends;
    public abstract List<String> getFriends();
    public abstract String getPlaceOfLiving();

}
