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
public class DinnerMenuIterator implements Iterator{
    
    MenuItem[] items;
    private int position;
    private int index;
    public DinnerMenuIterator(MenuItem[] items){
        this.items = items;
        position=0;
    }
    @Override
    public boolean hasNext() {
        if(position < items.length){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public Object next() {
        MenuItem DinnerMenu = items[position];
        position++;
        return DinnerMenu;
    }
    
}
