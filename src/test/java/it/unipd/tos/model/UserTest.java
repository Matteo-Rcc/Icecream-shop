////////////////////////////////////////////////////////////////////
// [MATTEO] [RACCANELLO] [1167901]
////////////////////////////////////////////////////////////////////

package it.unipd.tos.model;

import static org.junit.Assert.*;
import java.time.LocalDate;
import org.junit.Test;

import it.unipd.tos.model.User;

public class UserTest {
    @Test
    public void user_costructor_test() {
        /* DIHIARAZIONI */
        int id = 1;
        String nome = "u1";
        LocalDate n = LocalDate.of(1999, 5, 3);
        User u1 = new User(id, nome, n);
        
        /* ASSERT */
        assertEquals(id, u1.getId());
        assertEquals(nome, u1.getName());
        assertEquals(n, u1.getDate());
    }
}