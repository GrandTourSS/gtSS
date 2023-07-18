import org.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@RunWith(MockitoJUnitRunner.class)
public class MockLionTest {
    @Mock
    Lion lion;
    @Test
    public void test() {
        lion.getPlaceOfLiving();
        lion.getPlaceOfLiving();
        lion.getPlaceOfLiving();
        Mockito.verify(lion, Mockito.times(3)).getPlaceOfLiving();

        lion.getKittens();
        lion.getKittens();
        Mockito.verify(lion, Mockito.times(2)).getKittens();

        lion.getFriends();
        lion.getFriends();
        lion.getFriends();
        lion.getFriends();
        lion.getFriends();
        Mockito.verify(lion, Mockito.times(5)).getFriends();

        Mockito.when(lion.getPlaceOfLiving()).thenReturn("Astana");
        System.out.println(lion.getPlaceOfLiving());

        List<String> kittens = new ArrayList<>();
        Collections.addAll(kittens, "Болек", "Лёлек");
        Mockito.when(lion.getKittens()).thenReturn(kittens);
        System.out.println(lion.getKittens());

        List<String> friends = new ArrayList<>();
        Collections.addAll(friends, "Васька", "Мурка", "Бьянка");
        Mockito.when(lion.getFriends()).thenReturn(friends);
        System.out.println(lion.getFriends());
    }
}
