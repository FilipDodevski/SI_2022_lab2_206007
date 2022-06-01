import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class SILab2Test {
    private List<String> createList(String... elems) {
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void EveryStatement() {
        System.out.println("EVERY STATEMENT");
        IllegalArgumentException ex;

        ex = assertThrows(IllegalArgumentException.class, ()-> SILab2.function(createList()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class, ()-> SILab2.function(createList("0","0","#")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        assertEquals(createList("#", "2", "#", "1", "2", "#", "1", "#", "2"), SILab2.function(createList("#", "0", "#", "0", "0", "#", "0", "#", "0")));
    }


    @Test
    void EveryBranch() {
        System.out.println("EVERY BRANCH");
        IllegalArgumentException ex;

        ex = assertThrows(IllegalArgumentException.class, ()-> SILab2.function(createList()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class, ()-> SILab2.function(createList("0","0","#")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        assertEquals(createList("#", "2", "#", "1", "2", "#", "1", "#", "2"), SILab2.function(createList("#", "0", "#", "0", "0", "#", "0", "#", "0")));
    }
}
