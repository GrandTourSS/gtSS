import org.example.Alex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Collections;

@RunWith(MockitoJUnitRunner.class)
public class MockAlexTest {
    @Mock
    Alex alex;

    @Test
    public void mockTest() {
        alex.getKittens();
        alex.getKittens();
        alex.getKittens();

        Mockito.verify(alex, Mockito.times(3)).getKittens();

        alex.getFriends();
        Mockito.verify(alex, Mockito.times(1)).getFriends();

        alex.getPlaceOfLiving();
        alex.getPlaceOfLiving();
        alex.getPlaceOfLiving();
        alex.getPlaceOfLiving();
        Mockito.verify(alex, Mockito.times(4)).getPlaceOfLiving();

        ArrayList<String> friends = new ArrayList<>();
        Collections.addAll(friends, "Серик", "Марат", "Садуакас");

        Mockito.when(alex.getFriends()).thenReturn(friends);

        ArrayList<String> kittens = new ArrayList<>();
        Collections.addAll(kittens, "симба", "жома");
        Mockito.when(alex.getKittens()).thenReturn(kittens);

        Mockito.when(alex.getPlaceOfLiving()).thenReturn("Shymbulak");

        System.out.println(alex.getPlaceOfLiving());
        System.out.println(alex.getFriends());
        System.out.println(alex.getKittens());
    }
}
