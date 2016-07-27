package net.boukhalfa.gottalovealgeria;

/**
 * Created by Hamza on 20/07/2016.
 */
public class Menu {
    public int icon;
    public String title;
    public String Desc;
    public Menu(){
        super();
    }

    public Menu(int icon, String title, String desc) {
        super();
        this.icon = icon;
        this.title = title;
        this.Desc= desc;
    }
}
