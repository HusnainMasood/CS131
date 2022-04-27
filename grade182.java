/*CSUN Spring 21    COMP182 
	Java Program to compute term grade.
	Create a file grade.txt that contains:
	5 quiz grades followed by
	6 homework grades(including optional)
	followed by 2 Lab Exam grades
	followed by midterm and Final exam grades.
	To Compile: javac grade182
	To Execute: java  grade182  < grade.txt
*/
import java.io.*; 
import java.util.*; 

public class grade182{  
    //root is a pointer to root of the BST Tree	   
    PrintStream prt = System.out;
   // process method
   private double grade(){
	int i, sumq = 0, sumh = 0, suml = 0, x;
	double g = 0.0; //Term grade
     try{
        Scanner inf = new Scanner(System.in);
	    //read 5 quiz grades
		for (i=1; i<=5; i++){
		  x = inf.nextInt();
		  sumq+=x;
		}
		g += sumq * 10.0/400;
	    //read 6 homework grades
		for (i=1; i<=6; i++){
		  x = inf.nextInt();
		  sumh+=x;
		}
		g += sumh * 20.0/800;
	    //read 2 Lab Exam grades
		for (i=1; i<=2; i++){
		  x = inf.nextInt();
		  suml+=x;
		}
		g += suml * 30.0/200;
	    //read midterm grade
		x = inf.nextInt();
		g += x * 15.0/100;
	    //read final grade
		x = inf.nextInt();
		g += x * 25.0/100;
		//close input file
	    inf.close();
      } catch (Exception e){
		  prt.print("\nOoops Read Error " + e);}    
	  return g;
    } //end grade method
  
  //  main method
   public static void main(String args[]) throws Exception{
      grade182 t = new grade182();
	  
      //call grade method
	  // Make sure to change the name in next line
      System.out.printf("\n\tG. Dastghaiby Fard, Term Grade = %.0f", t.grade());
   } // end main
} // end class L2