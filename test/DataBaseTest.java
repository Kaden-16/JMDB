import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class DataBaseTest {
    
    
    
    @Test
    public void SearchMovieTest() throws Exception {
        String[] test = null;
        assertEquals(DataBase.SearchMovie("Inception"), test);
        
    }
    
}
