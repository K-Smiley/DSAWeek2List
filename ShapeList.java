package Q2a;

import java.util.ArrayList;

public class ShapeList implements IADTList {
    
    private String[] elements;
    private static final int CAPACITY = 10;
    private int length;
    
    public int length(){
        return length;
    }
    
     public void createList() {
        elements = new String[CAPACITY];
        length = 0;
    } 
     
    public String insert(String s){ // insert at end
        if (length < CAPACITY) {
            elements[length] = s;
            length++;
            return "OK";
            }
        else
            return "Operation failed";
    }
    
    public String insert(String s, int pos){ // insert at position
        
        if (length < CAPACITY) {
            for(int i=length-1; i>=pos; i--)
                elements[i+1] = elements[i];
            elements[pos] = s;
            length++;
            return "OK";
        }
        else
            return "Couldn't add, array full";
    }
    
    public boolean find( String s ){
        
        for(int i =0;i<length;i++){
            if (elements[i].equals(s))
                return true;
        }
        return false;    
    }
   
    public void remove( String s ){
        
    }
    
    public void printList( ){
        
        for(int i =0;i<length;i++){
            System.out.println(elements[i]);
           
        }
    }
    
    public static void main(String args[]){
        
        ShapeList SList = new ShapeList();
        SList.createList();
            
        System.out.println(SList.insert("One"));
        SList.insert("Three");
        SList.insert("Two", 1);
        
        SList.printList();
        System.out.println(SList.find("Three"));
    }
}

