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
public class DinnerMenu implements Menu{
    private final int MAX=4;
    private int numberOfItems=0;
    
    private MenuItem[] menuitems;
    
    public DinnerMenu(){
        menuitems = new MenuItem[MAX];
        this.addItem("和風ハンバーグ","ソース変更可",1140);
        this.addItem("四川麻婆定食","辛いので注意",1050);
        this.addItem("ミネストローネ","トマトをこれでもかと使用",550);
        this.addItem("●●***","食べると健康に害を与える",2000);
    }
    public void addItem(String menuName,String description,int price){
        MenuItem menuitem = new MenuItem(menuName,description,price);
        if(numberOfItems>MAX)
            System.out.println("もう入りきれません");
        else
            menuitems[numberOfItems++]=(menuitem);
        
    }
    public MenuItem[] getMenuIems(){
        return menuitems;
    }
    public MenuItem getMenu(int index){
        return menuitems[index];
    }

    @Override
    public Iterator iterator() {
        return new DinnerMenuIterator(getMenuIems());
    }
}
