package TechMaven.TechMaven.boundries;

import java.util.Scanner;

public class SelectMove
{
    public static int GetMove() {
        // ----------- << method.body@AAAAAAFqEXQmdBefqFE= >>
        // ----------- >>
            Scanner s = new Scanner(System.in);
            System.out.println("Please Enter a number ");
            
            System.out.println("|0|1|2");
            System.out.println("|3|4|5");
            System.out.println("|6|7|8");

            int postions = s.nextInt();

            return postions;
        }
}