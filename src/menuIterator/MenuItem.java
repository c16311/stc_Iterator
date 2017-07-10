/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuIterator;


/**
 *
 * @author c16311
 */
public class MenuItem {
    private String menuName;
    private String description;
    private int price;
    
    public MenuItem(String menuName,String description,int price){
        this.menuName = menuName;
        this.description = description;
        this.price = price;
    }
    
    public String getName(){
        return menuName;
    }
    public String getDescription(){
        return description;
    }
    public int getPrice(){
        return price;
    }
}
