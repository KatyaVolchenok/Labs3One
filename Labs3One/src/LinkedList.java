/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Shwartskopff
 */
public class LinkedList {
     private Element head;
     private Element tail;
     
 
     
     public void addFromStart(Object data){ 
            if(head != null){
            Element newElement = new Element(data);
            newElement.child = head;
            head = newElement;
        } else {
            head = tail = new Element(data); 
        }
    }
     
     public void addFromEnd(Object data){
         if(tail != null){
             tail.child = new Element(data);
             tail = tail.child;
     } else {
             head = tail = new Element(data);
         }
     }
     
     public Object getFromStart() {
         return head != null ? head.data: null;
     }
     
     public Object getFromEnd() {
         return tail != null ? tail.data: null;
     }
     
     public Object getRemoveFromStart() {
         if(head == null) 
             return null;
         
         Object result = head.data;
         if(head != tail) 
            head = head.child;
         else 
            head=tail=null;
             return result;
     }
   
     public Object getRemoveFromEnd(){
         if(tail == null)  
             return null;
         
         Object result = tail.data;
         if(head != tail) {
            Element a  = head;
            while(a != tail)
                a = a.child;
                tail = a;
                tail.child = null;
         }else 
           head = tail = null;
             return result;    
    }
             
    
     public boolean find(Object data) {
         Element a = head;
         while(a != null) {
             if(a.checkData(data))
                 return true;
                 a = a.child;
     }
              return false;
     }

    
     
     public int lenght() {
        int lenght=0;
        Element a = head;
        while(a != null) {
           lenght ++;
           a = a.child;
       } 
           return lenght;
        }
   
    public int getLenght() {
        return lenght();
    }

    public void remove(Object data) {
        if(head == null)
            return;
        if(head.checkData(data)) {
            getRemoveFromStart();
            return;
        }
        Element previous = head,
                a = head.child;
        while(a != null) {
            if(a.checkData(data)) {
                if(a == tail)
                    getRemoveFromEnd();
                else
                    previous.child = a.child;
                return;
            }
            previous = a;
            a = a.child;
        }
    }
   
   

    public void printAll() {
        Element a = head;
        while (a != null) {
            System.out.println(a.data + " ");
            a= a.child;
        }
       
    }

   
}

    
          
   
    
