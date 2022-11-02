import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class DataBaseTest {
    
    
    
    @Test
    public void SearchMovieTest() throws Exception {
        Movie[] test = DataBase.SearchMovie("Star Wars");
        int i = 0;
        assertEquals(test[i].getTitle(), "Star Wars");
        assertEquals(test[i].getYear(), 2010);

        
        
    }
    
}
