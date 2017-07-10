/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuIterator;

import java.util.ArrayList;

/**
 *
 * @author c16311
 */
public class PanCakeHouseMenu implements Menu{
    private ArrayList<MenuItem> menuitems;
    
    public PanCakeHouseMenu(){
        menuitems = new ArrayList();
        this.addItem("パンケーキ","卵焼きソーセージ付き",800);
        this.addItem("特大パンケーキ","通常のパンケーキの1.5倍",1000);
        this.addItem("黒いパンケーキ","黒い何かのクリーム",850);
    }
    public void addItem(String menuName,String description,int price){
        MenuItem menuitem = new MenuItem(menuName,description,price);
        menuitems.add(menuitem);
    }
    public ArrayList<MenuItem> getMenuIems(){
        return menuitems;
    }
    
    public MenuItem getMenu(int index){
        return menuitems.get(index);
    }

    @Override
    public Iterator iterator() {
        return new PanCakeHouseMenuIterator(this);
    }
}
