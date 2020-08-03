package BongoBD;

// Unit Test for Anagram 

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramUnitTest {

	@Test
    public void AnagramTest() {
        Anagram mAnagram = new Anagram();
        //Given test Case
        assertTrue(mAnagram.isAnagram("bleat", "table"));
        assertFalse(mAnagram.isAnagram("eat", "tar"));

        assertTrue(mAnagram.isAnagram("mazbah uddin", "niddu habzam"));
        assertTrue(mAnagram.isAnagram("KEY", "EYK"));
        assertFalse(mAnagram.isAnagram("ans", "sab"));
        assertTrue(mAnagram.isAnagram("java", "avja"));
        assertTrue(mAnagram.isAnagram("Code", "edoC"));
        assertFalse(mAnagram.isAnagram("bongo", "gonba"));
        assertFalse(mAnagram.isAnagram("Android", "droid"));
    }
}
