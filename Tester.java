public class Tester {


  public static void main (String[] args){
    NGon n = new NGon(new Point(300, 300), 6);
   String st = "";
      for (int i=0; i < n.getLines().length; i++){
          
           st = st+" Line "+(i+1)+"FirstPoint: "+n.getLines()[i].getFirstPoint().getX()+" "+n.getLines()[i].getFirstPoint().getY()
           +" Line "+(i+1)+"SecondPoint: "+n.getLines()[i].getSecondPoint().getX()+" "+n.getLines()[i].getSecondPoint().getY();
      }
      DrawingPad d = new DrawingPad(300, 300);
       BasicShape[] allshapes = {n};

      d.draw(allshapes);
      System.out.println(st);
   
    
    


    
    /*(From upper left corner clockwise, with default size 100)
      expected: 200 250
      200 350
      286.6 400
      373.2 350
      373.2 250
      286.6 200

    
    */

  }
      
  
    
}