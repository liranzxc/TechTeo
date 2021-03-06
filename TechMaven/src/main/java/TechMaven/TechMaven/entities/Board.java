/*
* This code has been generated by the Rebel: a code generator for modern Java.
* 
* For more details, please visit www.archetypesoftware.com.
*
* Drop us a line or two at feedback@archetypesoftware.com. We would love to hear from you.
*/
package TechMaven.TechMaven.entities;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAFqEN9ZYRVzA5E= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAFqEN9ZYRVzA5E= >>
// ----------- >>
public class Board {
  // ----------- << attribute.annotations@AAAAAAFqEbOtPr4u4qs= >>
  // ----------- >>
  private Rubic [][] rubices = new Rubic[3][3];
  

  public Board(){

    init();
  }

  public void init()
  {
    for(int i = 0 ; i<3;i++)
    {
      for(int j =0; j<3;j++)
      {
        rubices[i][j] = new Rubic(this);
        rubices[i][j].setMark(' ');
      }
    }
  }
  public void printBoard() {
	  // ----------- << method.body@AAAAAAFqX8HF6hx4wg4= >>
	  // ----------- >>
		  for(int i = 0 ; i<3;i++)
		    {
		      for(int j =0; j<3;j++)
		      {
		       
		        System.out.print(rubices[i][j]);
		        
		      }
		      	System.out.println();
		      	System.out.println("-------------------");
		    }
		  
	  }

  public Rubic[][] GetRubices()
  {
    return this.rubices;
  }
  
}