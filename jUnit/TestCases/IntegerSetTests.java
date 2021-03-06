import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IntegerSetTests {
    IntegerSet testSet;

    @Before
    public void setup(){
        testSet = new IntegerSet();
    }

    @Test
    public void testInsertNotThere(){
        //check number is not already in set
        assertEquals(testSet.size(),0);
        assertFalse(testSet.contains(3));
        //insert a number
        testSet.insert(3);
        //check the number is in the set
        assertEquals(testSet.size(), 1);
        assertTrue(testSet.contains(3));
    }

    @Test
    public void testInsertAlreadyThere(){
        //inserts number
        testSet.insert(3);
        //checks number is already in set
        assertEquals(testSet.size(), 1);
        assertTrue(testSet.contains(3));
        //insert number doesn't add number
        testSet.insert(3);
        assertEquals(testSet.size(), 1);
    }

    @Test
    public void testRemoveNumNotThere(){
        //check if number is not already in set
        assertEquals(testSet.size(), 0);
        assertFalse(testSet.contains(3));
        //removes a number
        testSet.remove(3);
        //checks if set is still same
        assertEquals(testSet.size(), 0);
        assertFalse(testSet.contains(3));
    }

    @Test
    public void testRemoveNumAlreadyThere(){
        //inserts number
        testSet.insert(3);
        //check if number in set
        assertEquals(testSet.size(), 1);
        assertTrue(testSet.contains(3));
        //remove number
        testSet.remove(3);
        //checks if number removed
        assertEquals(testSet.size(), 0);
        assertFalse(testSet.contains(3));
    }
}
