
package menuIterator;
/**
 *
 * @author c16311
 */
public class Waitress implements Menu{
    //Menu pancakeMenu;   //PanCakeHouseMenu
    PanCakeHouseMenu pancakeMenu;
    Menu dinnerMenu;    //DinnerMenu
    
    //private MenuItem[] menutems;
    private int last=0;
    
    public void Waitress(PanCakeHouseMenu panCake,DinnerMenu dinner){
        pancakeMenu = panCake;
        dinnerMenu = dinner;
    }
    
    /*public Menu getMenuAt(int index){
        if(pancakeMenu.getMenuIems().size()>index){
            //return pancakeMenu.getMenuIems().get(index);
        }
        return 
    }*/
    
    public void printMenu(){
        Iterator PanCakeHouseMenuIterator;
        Iterator DinnerMenuIterator;
        
        printMenu();
    }
    public void printMenu(Iterator iterator){
        /*while(iterator.next()){
            MenuItem menuItem = (MenuItem)Iterator;
            System.out.println(menuItem.getName());
        }*/
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
