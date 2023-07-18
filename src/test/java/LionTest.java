import org.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RunWith(Parameterized.class)
public class LionTest {

    List<String> friends;
    List<String> kittens;
    private String placeOfLiving;
    private String expected;

    public LionTest(String placeOfLiving, String expected) {
        this.placeOfLiving = placeOfLiving;
        this.expected = expected;
    }

    @Before
    public void setParams() {
        friends = new ArrayList<>();
        Collections.addAll(friends, "Васька", "Мурка", "Бьянка");
        kittens = new ArrayList<>();
        Collections.addAll(kittens, "Болек", "Лёлек");
    }
    @Parameterized.Parameters
    public static Object[][] getPlace() {
        return new Object[][]{
                {"New York", "New York"},{"Chicago", "Chicago"},{"Indianapolis", "Indianapolis"}
        };
    }

    @Test
    public void placeTest() {
        Lion lion = new Lion(placeOfLiving, friends, kittens);
        String actual = lion.getPlaceOfLiving();
        Assert.assertEquals(expected,actual);


    }

}
