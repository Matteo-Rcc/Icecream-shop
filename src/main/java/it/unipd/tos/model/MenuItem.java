////////////////////////////////////////////////////////////////////
// [MATTEO] [RACCANELLO] [1167901]
////////////////////////////////////////////////////////////////////

package it.unipd.tos.model;

public class MenuItem {
    private itemType item;
    private String name;
    private double price;

    /* COSTRUTTORE */
    public MenuItem(itemType t, String n, double p) {
        item = t; name = n; price = p;
    }

    /* RITORNA IL NOME */
    public String getName() {
        return name;
    }
    
    /* RITORNA IL TIPO (Gelati ,Bibite, Budimi) */ 
    public itemType getType() {
        return item;
    }

    /* RITORNA IL PREZZO */
    public double getPrice() {
        return price;
    }
}