import org.example.Alex;
import org.junit.Test;

public class AlexTest {
@Test
public void alexTest() {
    Alex alex = new Alex();
    System.out.println(alex.getFriends());
    System.out.println(alex.getKittens());
    System.out.println(alex.getPlaceOfLiving());
    System.out.println(alex);
}
}
