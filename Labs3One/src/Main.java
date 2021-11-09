/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Shwartskopff
 */
public class Main {
   public static void main(String[] args) {
        LinkedList l = new LinkedList();
       l.addFromEnd("Keep Away, Godsmack");
       l.addFromEnd("Loser, 3 Doors Down");
       l.addFromEnd("Getting Away With Murder, Papa Roach");
       l.addFromEnd("R U Mine, Arctic Monkeys");
       l.addFromEnd("Holiday, Green Day");
       l.addFromEnd("The Kids Aren't Alright, The Offspring");
       l.addFromEnd("When You're Young, 3 Doors Down");
       System.out.println ("Oдносвязный список: ");
       l.printAll();
       System.out.println("____________________________________________________________________");
       
       
       System.out.println ("Длина односвязанного списка: " + l.lenght());
       System.out.println("____________________________________________________________________");
       
       System.out.println("Поиск элемента со значением \"Loser, 3 Doors Down\": " + l.find("Loser, 3 Doors Down"));
       System.out.println("____________________________________________________________________");
       
       l.remove("Loser, 3 Doors Down");
       System.out.println("Удаление из списка элемента со значением 'Loser, 3 Doors Down'");
       l.printAll();
       System.out.println("____________________________________________________________________");
       
       System.out.println ("Длина односвязанного списка: " + l.lenght());
       System.out.println("____________________________________________________________________");
       
      
       
}
}
