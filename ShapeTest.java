
package Q2a;

public class ShapeTest {

   
    public static void main(String[] args) {  
        
        AShape [] shapeArray = new AShape[10];
        
        Square sq = new Square(5);
        Rectangle rect = new Rectangle(6,7);
        
        shapeArray[0] = sq;
        shapeArray[1] = rect;
        
        for(int i = 0; i < 2; i++){
            
            shapeArray[i].display();
            //shapearr[i].area();
        }
    }
    
}


