/*
* This code has been generated by the Rebel: a code generator for modern Java.
* 
* For more details, please visit www.archetypesoftware.com.
*
* Drop us a line or two at feedback@archetypesoftware.com. We would love to hear from you.
*/
package TechMaven.TechMaven.boundries;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAFqENjWoBR1h0w= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAFqENjWoBR1h0w= >>
// ----------- >>
public class StartGameButton {
  // ----------- << method.annotations@AAAAAAFqX8O4Cxyy/8g= >>
  // ----------- >>
  public static String start() {
  // ----------- << method.body@AAAAAAFqX8O4Cxyy/8g= >>
  // ----------- >>
	  Scanner s = new Scanner(System.in);
	  System.out.println("Do you want start game ? y / n ");
	  String result = s.nextLine();
	  
	  return result;
  }
// ----------- << class.extras@AAAAAAFqENjWoBR1h0w= >>
// ----------- >>
}