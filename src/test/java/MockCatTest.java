import org.example.Cat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class MockCatTest {
@Mock
Cat cat;

    @Test
    public void test() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Васька", "Мурка", "Бьянка");
        cat.getPlaceOfLiving();
        cat.getPlaceOfLiving();
        cat.getPlaceOfLiving();

        Mockito.verify(cat, Mockito.times(3)).getPlaceOfLiving();

        cat.getFriends();
        cat.getFriends();
        cat.getFriends();
        cat.getFriends();
        cat.getFriends();

        Mockito.verify(cat, Mockito.times(5)).getFriends();

        Mockito.when(cat.getFriends()).thenReturn(list);
        System.out.println(cat.getFriends());
        Mockito.when(cat.getPlaceOfLiving()).thenReturn("Подорожьево");
        System.out.println(cat.getPlaceOfLiving());
    }
}
