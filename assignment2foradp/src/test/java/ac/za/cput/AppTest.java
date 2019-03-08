package ac.za.cput;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private App a = new App();

    @Test
    public void ListExample() {

        int size = a.list();

        Assert.assertEquals(size, 2);


    }

    @Test
    public void MapExample() {

        Set<Map.Entry<String, Integer>> map = a.map().entrySet();


        Assert.assertEquals(map.size(), 2);
    }

    @Test
    public void setExample() {

        Set<Integer> intersect = a.set();
        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[]{0, 1, 3, 4}));

        Assert.assertEquals(intersect, b);
    }

    @Test
    public void collection() {

        LinkedList<String> list = a.collection();
        int size = list.size();
        Assert.assertEquals(size, 4);

    }

}
