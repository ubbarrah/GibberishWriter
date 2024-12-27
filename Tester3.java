// import junit.framework.TestCase;
// import org.junit.*;
// import static org.junit.Assert.*;
// /** A JUnit test case class.
//   * Every method starting with the word "test" will be called when running
//   * the test with JUnit.
//   */
// public class Tester3 extends TestCase {
  
//   /** A test method.
//     * (Replace "X" with a name describing the test.  You may write as
//     * many "testSomething" methods in this class as you wish, and each
//     * one will be called when running JUnit over this class.)
//     */
//   @Test
//   public void testPoints(){
//     Point p = new Point(3.4, 4.5);
//     p.setX(4.5);
//     p.setY(2.2);
//     assertEquals("4.5 2.2", ""+p.getX() + " " + p.getY());
//     System.out.println("yay");
//   }
//   @Test
//   public void testPoints2(){
//     Point p = new Point(1, 1);
//     p.setX(6);
//     p.setY(6.4);
//     assertEquals("6.0 6.4", ""+p.getX() + " " + p.getY());
     
//   }
//   @Test
//   public void testPoints3() {
//     Point p = new Point(0, 1);
//     Point p1 = new Point(0, 0);
//     p.rotateAbout(p1, Math.PI);
//     assertTrue("Did not successfully rotate point (0, 1) to (0, -1)", p.equals(new Point(0, -1)));
//   }
//   @Test
//   public void testPoints4() {
//     Point p = new Point(1, 0);

//     Point p1 = new Point(0, 0);
       

//     p.rotateAbout(p1, (Math.PI/2));
//     assertTrue("Did not successfully rotate point", p.equals(new Point(0, 1)));
    
//   }
//   @Test
//   public void testPoints5() {
//     Point p = new Point(1, 0);

//     Point p1 = new Point(0, 0);
//     p.rotateAbout(p1, (Math.PI/4));
//     assertTrue("Did not successfully rotate point", p.equals(new Point(0.7071067811865476, 0.7071067811865476)));

        
    
//   }
//   @Test
//   public void testPoints6() {
//     Point p = new Point(1, 0);
//     Point p1 = new Point(1, 1);
//     p.rotateAbout(p1, (Math.PI/2));
//     assertTrue("Did not successfully rotate point", p.equals(new Point(2, 1)));
    
    
//   }

        
  
// }
