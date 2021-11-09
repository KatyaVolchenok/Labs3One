/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Shwartskopff
 */
public class Element {
    
         Object data;
         Element child;
    
    public Element (Object data) {
        this.data = data;
   }
    
    
boolean checkData(Object data) {
        return data == null && this.data == null
                    || data != null && data.equals(this.data);
    }
    }

