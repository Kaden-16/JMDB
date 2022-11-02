import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class DataBaseTest {
    
    
    
    @Test
    public void SearchMovieTest() throws Exception {
        Movie[] test = DataBase.SearchMovie("Inception");
        int i = 0;
        assertEquals(test[i].getTitle(), "Inception");
        assertEquals(test[i].getYear(), 2010);

        
    }
    
}
