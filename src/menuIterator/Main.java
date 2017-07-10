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
public class Main {
    public static void main(String[] args){
        Menu m1 = new PanCakeHouseMenu();
        Menu m2 = new DinnerMenu();
        
        Iterator it = m1.iterator();
        
        
        while(it.hasNext()){
            MenuItem item = (MenuItem)it.next();
            System.out.print("メニュー名:"+item.getName()+" ");
            System.out.println(item.getDescription());
            System.out.println("値段:"+item.getPrice());
        }
        it = m2.iterator();
        while(it.hasNext()){
            MenuItem item = (MenuItem)it.next();
            System.out.print("メニュー名:"+item.getName()+" ");
            System.out.println(item.getDescription());
            System.out.println("値段:"+item.getPrice());
        }
    } 
}
