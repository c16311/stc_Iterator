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
public class PanCakeHouseMenuIterator implements Iterator{
    
    PanCakeHouseMenu menuitems;
    private int index;
    public PanCakeHouseMenuIterator(PanCakeHouseMenu menuitems){
        this.menuitems = menuitems;
        this.index=0;
    }
    @Override
    public boolean hasNext() {
        if(index < menuitems.getMenuIems().size()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object next() {
        MenuItem Pancake = menuitems.getMenu(index);
        index++;
        return Pancake;
    }
    
}
