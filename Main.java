/**
 *
 * @jacoe0850 
 */
public class Main {
// this line creates a procedure method with the method name exam grade and the paramater is the mark
  public static void examGrade(int grade){
    // if and else if statements that check where the users mark falls under
    if(grade >= 80){
      System.out.println("A");
    } else if(grade <= 79 && grade >= 70){
      System.out.println("B");
    } else if(grade <= 69 && grade >= 60){
      System.out.println("C");
    } else if(grade <= 59 && grade >= 50){
      System.out.println("D");
    } else if(grade < 50){
      System.out.println("F");
    }
  }
  public static void main(String[] args) {
  examGrade(80);   
  }
}
