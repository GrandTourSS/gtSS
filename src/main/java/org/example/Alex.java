package org.example;

import java.util.ArrayList;
import java.util.List;

public class Alex extends Lion {

    public Alex(){
     this.placeOfLiving="The New York Zoo";
     //friends.addAll("Marti","Gloria", "Melman");
        friends = new ArrayList<>();
        friends.add("Marti");
        friends.add("Gloria");
        friends.add("Melman");
     this.kittens = new ArrayList<>();
    }



    @Override
    public List<String> getFriends() {
        return super.getFriends();
    }

    @Override
    public String getPlaceOfLiving() {
        return super.getPlaceOfLiving();
    }

    @Override
    public String toString() {
        return "Alex have a " +
                "kittens=" + kittens.size() +
                ", his place of Living='" + placeOfLiving + '\'' +
                ", he have a friends=" + friends +
                '}';
    }
}
