import org.example.Cat;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@RunWith(Parameterized.class)


public class TestCat {
    private String place;
    private String expected;

    public TestCat(String place, String expected) {
        this.place = place;
        this.expected = expected;
    }

    @Test
    public void creatureCat() {
    List<String> friends = new ArrayList();
    Collections.addAll(friends, "Melman", "Ioseph", "Shabat");
        Cat cat = new Cat("Alabama", friends);
        System.out.println(cat.getFriends());
    System.out.println(cat.getPlaceOfLiving());
    }

    @Parameterized.Parameters
    public static Object[][] getPlace() {
        return new Object[][]{
            {"New York", "New York"},{"Chicago", "Chicago"},{"Indianapolis", "Indianapolis"}
        };
    }

    @Test
    public void placeTest() {
        Cat cat = new Cat(place);
        String actual = cat.getPlaceOfLiving();
        Assert.assertEquals(expected, actual);
    }

}
