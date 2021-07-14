import java.util.*;


public class RoPaSc
{
    
    

public static void main(String args[]) 
    
{
      
String ROCK = "ROCK";
    
String PAPER = "PAPER";
    
String SCISSORS = "SCISSORS";


System.out.println("**********************************************************"); 
System.out.println();  
System.out.println();
System.out.println("*****************Welcome To 'Rock Paper Scissor' Game*****************"); 
System.out.println();  
System.out.println();
Scanner in = new Scanner(System.in);

System.out.println("Enter Name of Player1");  
String Name=in.nextLine();  
System.out.println();  
System.out.println("Enter Name of Player2") ;
String Name2=in.nextLine();  
System.out.println();  
System.out.println("---------------------------------------------------------------"); 
System.out.println();   
System.out.println("Enter any one of the following inputs:  ");
      
System.out.println("ROCK");
      
System.out.println("PAPER");
      
System.out.println("SCISSORS");
    
System.out.println();  
System.out.println("---------------------------------------------------------------"); 
System.out.println(); 
System.out.println(Name+" Move") ; 
String input1 = in.next();
      
String player1move = input1.toUpperCase();
        
System.out.println(Name+" move is: "+ player1move);
     
System.out.println();     
System.out.println(Name2+" Move") ;
String input = in.next();
        
String player2move = input.toUpperCase();
        
System.out.println(Name2+" move is: "+ player2move);
        
    
           
 System.out.println("----------------------------------------------------------");  
 System.out.println();
   
 System.out.println("***Results***");
        
      
String player1Move = player1move;
      
String player2Move = player2move; 
 
      

if (player1Move.equals(player2Move))
   {         
	System.out.println("Game is Tie !!   "+(char)3);
   
}                                                                                                                                                                 		// if player1Move is ROCK         
     
else if (player1Move.equals(ROCK))
{       
 	System.out.println(player2Move.equals(PAPER) ? Name2+" Wins  "+(char)3: Name+" wins  "+(char)3); 
}                                                                                                                                                         
      		// if player1Move is PAPER
      
else if (player1Move.equals(PAPER))
 {       
	System.out.println(player2Move.equals(SCISSORS) ? Name2+" Wins  "+(char)3: Name+" wins  "+(char)3);
}                                                                                                                                                        
     		 // if player1Move is SCISSORS    
      
else
  {      
	System.out.println(player2Move.equals(ROCK) ? Name2+" Wins  "+(char)3: Name+" wins  "+(char)3); 
}  
   
System.out.println();
 
System.out.println();
 
System.out.println("********************************************************************************"); 
 }
    
    
}
