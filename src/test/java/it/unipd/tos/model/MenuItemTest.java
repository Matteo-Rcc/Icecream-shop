////////////////////////////////////////////////////////////////////
// [MATTEO] [RACCANELLO] [1167901
////////////////////////////////////////////////////////////////////

package it.unipd.tos.model;

import static org.junit.Assert.*;
import it.unipd.tos.model.MenuItem;

import org.junit.Test;

public class MenuItemTest {

    @Test
    public void MenuItem_costructor_test() {
        /* DICHIARAZIONI */
        itemType tipo = itemType.Gelati;
        String nome = "g1";
        double costo = 1.5;
        MenuItem prod = new MenuItem(tipo, nome, costo);
        
        /* ASSERT */
        assertEquals(tipo, prod.getType());
        assertEquals(nome, prod.getName());
        assertEquals(costo, prod.getPrice(), 0.0001);
    }

}