package it.unipd.tos.business;

import static org.junit.Assert.*;
import java.util.List;
import it.unipd.tos.business.TakeAwayBillImpl;
import it.unipd.tos.business.exception.RestaurantBillException;
import it.unipd.tos.model.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.time.*;

import org.junit.Test;

public class TakeAwayBillTest {

    @Test
    public void controllo_sonto_50_per_piu_5_gelati() {
        TakeAwayBillImpl scontrino = new TakeAwayBillImpl();
        User u = new User(1, "U1", LocalDate.of(1987, 3, 2));
        List<MenuItem> ord = new ArrayList<MenuItem>();
        ord.add(new MenuItem(itemType.Gelati, "G1", 4));
        ord.add(new MenuItem(itemType.Gelati, "G1", 4));
        ord.add(new MenuItem(itemType.Gelati, "G1", 4));
        ord.add(new MenuItem(itemType.Gelati, "G1", 4));
        ord.add(new MenuItem(itemType.Gelati, "G1", 4));
        ord.add(new MenuItem(itemType.Gelati, "G1", 4));
        ord.add(new MenuItem(itemType.Budini, "Bu1", 7));
        ord.add(new MenuItem(itemType.Bevande, "B1", 3));
        try {assertEquals(scontrino.getOrderPrice(ord, u, LocalTime.of(18, 1)), 32, 0.0001);
        } catch (RestaurantBillException e) {
            fail();
        }
    }

    @Test
    public void sconto_10_per_importo_maggiore_50() {
        
        TakeAwayBillImpl scontrino = new TakeAwayBillImpl();
        User u = new User(1, "U2", LocalDate.of(1967, 3, 2));
        List<MenuItem> ordine = new ArrayList<MenuItem>();
        ordine.add(new MenuItem(itemType.Budini, "Bu1", 22));
        ordine.add(new MenuItem(itemType.Gelati, "G1", 17));
        ordine.add(new MenuItem(itemType.Gelati, "G1", 18));
        
        
        try {
            assertEquals(scontrino.getOrderPrice(ordine, u, LocalTime.of(18, 1)), 51.3, 0.0001);
        } catch (RestaurantBillException e) {
            fail();
        }
    }

    @Test
    public void sconto_10_sconto_5() {
        TakeAwayBillImpl bill = new TakeAwayBillImpl();
        User u = new User(1, "Tommaso", LocalDate.of(1999, 5, 3));
        List<MenuItem> ord = new ArrayList<MenuItem>();
        ord.add(new MenuItem(itemType.Gelati, "G2", 10));
        ord.add(new MenuItem(itemType.Gelati, "G2", 10));
        ord.add(new MenuItem(itemType.Gelati, "G2", 10));
        ord.add(new MenuItem(itemType.Gelati, "G2", 10));
        ord.add(new MenuItem(itemType.Gelati, "G2", 10));
        ord.add(new MenuItem(itemType.Gelati, "G2", 10));
        try {
            assertEquals(bill.getOrderPrice(ord, u, LocalTime.of(18, 26)), 49.5, 0.0001);
        } catch (RestaurantBillException e) {
            fail();
        }
    }

    @Test
    public void commissione() {
        TakeAwayBillImpl bill = new TakeAwayBillImpl();
        User u = new User(1, "Tommaso", LocalDate.of(1999, 5, 3));
        List<MenuItem> ord = new ArrayList<MenuItem>();
        ord.add(new MenuItem(itemType.Gelati, "G3", 1));
        ord.add(new MenuItem(itemType.Gelati, "G3", 2));
        ord.add(new MenuItem(itemType.Gelati, "G3", 2));
        ord.add(new MenuItem(itemType.Gelati, "G3", 1));
        ord.add(new MenuItem(itemType.Gelati, "G3", 1));
        try {
            assertEquals(bill.getOrderPrice(ord, u, LocalTime.of(18, 26)), 7.5, 0.0001);
        } catch (RestaurantBillException e) {
            fail();
        }
    }

    @Test
    public void sconto_10_senza_50() {
        TakeAwayBillImpl bill = new TakeAwayBillImpl();
        User u = new User(1, "U3", LocalDate.of(1990, 4, 3));
        List<MenuItem> ord = new ArrayList<MenuItem>();
        ord.add(new MenuItem(itemType.Gelati, "G3", 10));
        ord.add(new MenuItem(itemType.Gelati, "G3", 10));
        ord.add(new MenuItem(itemType.Gelati, "G3", 10));
        ord.add(new MenuItem(itemType.Gelati, "G3", 10));
        ord.add(new MenuItem(itemType.Gelati, "G3", 6));
        ord.add(new MenuItem(itemType.Gelati, "G3", 5));
        try {
            assertEquals(bill.getOrderPrice(ord, u, LocalTime.of(18, 26)), 48.5, 0.0001);
        } catch (RestaurantBillException e) {
            fail();
        }
    }

    @Test
    public void articoli_30() {
        TakeAwayBillImpl bill = new TakeAwayBillImpl();
        User u = new User(1, "U2", LocalDate.of(1995, 3, 2));
        List<MenuItem> ord = new ArrayList<MenuItem>();
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        ord.add(new MenuItem(itemType.Gelati, "G3", 3));
        boolean check = false;
        try {
            bill.getOrderPrice(ord, u, LocalTime.of(18, 23));
        } catch (RestaurantBillException e) {
            check = true;
        }
        assertTrue(check);
    }

    @Test
    public void scontoMinorenni() {
        TakeAwayBillImpl bill = new TakeAwayBillImpl();
        User u = new User(1, "U5", LocalDate.of(2008, 9, 2));
        List<MenuItem> ord = new ArrayList<MenuItem>();
        ord.add(new MenuItem(itemType.Gelati, "G3", 10));
        ord.add(new MenuItem(itemType.Gelati, "G3", 10));
        ord.add(new MenuItem(itemType.Gelati, "G3", 10));
        ord.add(new MenuItem(itemType.Gelati, "G3", 10));
        ord.add(new MenuItem(itemType.Gelati, "G3", 6));
        ord.add(new MenuItem(itemType.Gelati, "G3", 5));
        try {
            // sconto minorenni accettato
            assertEquals(bill.getOrderPrice(ord, u, LocalTime.of(18, 26, 24)), 0.00, 0.0001);
            // sconto minorenni rifiutato
            assertEquals(bill.getOrderPrice(ord, u, LocalTime.of(18, 26, 25)), 48.5, 0.0001);

        } catch (RestaurantBillException e) {
            fail();
        }
    }

    @Test
    public void max_numero_sconto_minorenni() {
        TakeAwayBillImpl bill = new TakeAwayBillImpl();
        List<User> utenti = new ArrayList<User>();
        for (int i = 0; i < 13; i++) {
            utenti.add(new User(i, "Tommaso", LocalDate.of(2004, 5, 3)));
        }
        utenti.add(new User(13, "Tommaso", LocalDate.of(1999, 5, 3)));

        List<MenuItem> ord = new ArrayList<MenuItem>();
        ord.add(new MenuItem(itemType.Gelati, "G3", 10));
        ord.add(new MenuItem(itemType.Gelati, "G3", 10));
        ord.add(new MenuItem(itemType.Gelati, "G3", 10));
        ord.add(new MenuItem(itemType.Gelati, "G3", 10));
        ord.add(new MenuItem(itemType.Gelati, "G3", 6));
        ord.add(new MenuItem(itemType.Gelati, "G3", 5));
        try {
            // sconto minorenni accettato
            assertEquals(bill.getOrderPrice(ord, utenti.get(0), LocalTime.of(18, 26, 24)), 0.00, 0.0001);
            assertEquals(bill.getOrderPrice(ord, utenti.get(13), LocalTime.of(18, 26, 24)), 48.5, 0.0001);
            assertEquals(bill.getOrderPrice(ord, utenti.get(13), LocalTime.of(16, 26, 24)), 48.5, 0.0001);
            assertEquals(bill.getOrderPrice(ord, utenti.get(13), LocalTime.of(20, 26, 24)), 48.5, 0.0001);
            assertEquals(bill.getOrderPrice(ord, utenti.get(0), LocalTime.of(17, 26, 24)), 48.5, 0.0001);
            assertEquals(bill.getOrderPrice(ord, utenti.get(0), LocalTime.of(21, 26, 24)), 48.5, 0.0001);
            for (int i = 0; i < 10; i++) {
                if (i == 0) {
                    assertEquals(bill.getOrderPrice(ord, utenti.get(i), LocalTime.of(18, 26, 24)), 48.5, 0.0001);
                } else {
                    assertEquals(bill.getOrderPrice(ord, utenti.get(i), LocalTime.of(18, 26, 24)), 0.00, 0.0001);
                }
            }

            assertEquals(bill.getOrderPrice(ord, utenti.get(10), LocalTime.of(18, 26, 25)), 48.5, 0.0001);
            assertEquals(bill.getOrderPrice(ord, utenti.get(11), LocalTime.of(18, 26, 29)), 48.5, 0.0001);
            // Sono stati superati i minorenni con sconto
            assertEquals(bill.getOrderPrice(ord, utenti.get(12), LocalTime.of(18, 26, 24)), 48.5, 0.0001);

        } catch (RestaurantBillException e) {
            fail();
        }
    }

}