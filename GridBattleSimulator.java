;
import java.util.Scanner;
import java.util.Random;
public class GridBattleSimulator
{
    private Scanner in = new Scanner(System.in);
    private Random rand = new Random();
    private String[][] userGrid;
    private int x;
    private int y;
    private int Locx;
    private int Locy;
    
    public void setGrid()
    {
        
        System.out.println("What will be the x value for your grid?");
        x= in.nextInt();
        System.out.println("What will be the y value for your grid?");
        y= in.nextInt();

        userGrid = new String[x][y];  
        
      for(int i = 0; i < x; i++)
    {
            for(int j = 0; j < y; j++)
            {
                userGrid[i][j] = "[]"; 
                System.out.print(userGrid[i][j]);
            }
            System.out.println();
    }
    
    }
    
    public void addX()
    {
        userGrid[0][0] = "[x]";
      for(int i = 0; i < x; i++)
    {
            for(int j = 0; j < y; j++)
            {
                System.out.print(userGrid[i][j]);
            }
            System.out.println();
    }
    }
    
    public void xGame()
    {
        Locx = 0;
        Locy = 0;
        String input = " ";
        while(input.equals(" ") ||input.equals("u") ||input.equals("d") ||input.equals("l") ||input.equals("r") )
        {
            System.out.println("Input a direction");
            input = in.next();
            if(input.equals("u"))
            {
                userGrid[Locx][Locy] = "[]"; 
                Locx --;
                userGrid[Locx][Locy] = "[x]"; 
                                  for(int i = 0; i < x; i++)
            {
                    for(int j = 0; j < y; j++)
                    {
                        System.out.print(userGrid[i][j]);
                    }
                    System.out.println();
            }
            }
            if(input.equals("d"))
            {
                userGrid[Locx][Locy] = "[]"; 
                Locx ++;
                userGrid[Locx][Locy] = "[x]"; 
                  for(int i = 0; i < x; i++)
            {
                    for(int j = 0; j < y; j++)
                    {
                        System.out.print(userGrid[i][j]);
                    }
                    System.out.println();
            }
            }
            if(input.equals("l"))
            {
                userGrid[Locx][Locy] = "[]"; 
                Locy -- ;
                userGrid[Locx][Locy] = "[x]"; 
                  for(int i = 0; i < x; i++)
            {
                    for(int j = 0; j < y; j++)
                    {
                        System.out.print(userGrid[i][j]);
                    }
                    System.out.println();
            }
            }
            if(input.equals("r"))
            {
                userGrid[Locx][Locy] = "[]"; 
                Locy ++;
                userGrid[Locx][Locy] = "[x]"; 
                   for(int i = 0; i < x; i++)
            {
                    for(int j = 0; j < y; j++)
                    {
                        System.out.print(userGrid[i][j]);
                    }
                    System.out.println();
            }
            }
            userGrid[Locx][Locy] = "[]"; 
        } 
    }
    
    public void specialGame()
    {
        System.out.print("Capture the x!");
         System.out.println("What will be the x value for your grid?");
        x= in.nextInt();
        System.out.println("What will be the y value for your grid?");
        y= in.nextInt();

        userGrid = new String[x][y];  
        
         for(int i = 0; i < x; i++)
    {
            for(int j = 0; j < y; j++)
            {
                userGrid[i][j] = "[]"; 
                
            }
   }
     
       // Person p1 = new Person();
        int rand1 = rand.nextInt(x);
        int rand2 = rand.nextInt(y);
        userGrid[rand1][rand2] = "[x]";
        
        userGrid[0][0] = "y";
        Locx = 0;
        Locy = 0;
        String input = " ";
        
          for(int i = 0; i < x; i++)
            {
                    for(int j = 0; j < y; j++)
                    {
                        System.out.print(userGrid[i][j]);
                    }
                    System.out.println();
            }
    
        while((input.equals(" ") ||input.equals("u") ||input.equals("d") ||input.equals("l") ||input.equals("r")))
        {
            System.out.println("Input a direction");
            input = in.next();
            if(input.equals("u"))
            {
                userGrid[Locx][Locy] = "[]"; 
                Locx --;
                userGrid[Locx][Locy] = "[y]"; 
                   for(int i = 0; i < x; i++)
            {
                    for(int j = 0; j < y; j++)
                    {
                        System.out.print(userGrid[i][j]);
                    }
                    System.out.println();
            }
            }
            if(input.equals("d"))
            {
                userGrid[Locx][Locy] = "[]"; 
                Locx ++;
                userGrid[Locx][Locy] = "[y]"; 
                  for(int i = 0; i < x; i++)
            {
                    for(int j = 0; j < y; j++)
                    {
                        System.out.print(userGrid[i][j]);
                    }
                    System.out.println();
            }
            }
            if(input.equals("l"))
            {
                userGrid[Locx][Locy] = "[]"; 
                Locy -- ;
                userGrid[Locx][Locy] = "[y]"; 
                  for(int i = 0; i < x; i++)
            {
                    for(int j = 0; j < y; j++)
                    {
                        System.out.print(userGrid[i][j]);
                    }
                    System.out.println();
            }
            }
            if(input.equals("r"))
            {
                userGrid[Locx][Locy] = "[]"; 
                Locy ++;
                userGrid[Locx][Locy] = "[y]"; 
                   for(int i = 0; i < x; i++)
            {
                    for(int j = 0; j < y; j++)
                    {
                        System.out.print(userGrid[i][j]);
                    }
                    System.out.println();
            }
            }
            
            if(Locx == rand1 && Locy == rand2)
            {
                System.out.println("You got it!");
                break;
            }
            
            
        } 
    }
    
            
    public void specialGame2()
    {
        System.out.print("Capture the x!");
         System.out.println("What will be the x value for your grid?");
        x= in.nextInt();
        System.out.println("What will be the y value for your grid?");
        y= in.nextInt();

        userGrid = new String[x][y];  
        
         for(int i = 0; i < x; i++)
    {
            for(int j = 0; j < y; j++)
            {
                userGrid[i][j] = "[]"; 
                
            }
   }
     
        Person p1 = new Person(":)");
        Person p2 = new Person(":(");
        int rand1 = rand.nextInt(x);
        int rand2 = rand.nextInt(y);
        userGrid[rand1][rand2] = p2.getFace();
        
        userGrid[0][0] = p1.getFace();;
        Locx = 0;
        Locy = 0;
        String input = " ";
        
          for(int i = 0; i < x; i++)
            {
                    for(int j = 0; j < y; j++)
                    {
                        System.out.print(userGrid[i][j]);
                    }
                    System.out.println();
            }
    
        while((input.equals(" ") ||input.equals("u") ||input.equals("d") ||input.equals("l") ||input.equals("r")))
        {
            System.out.println("Input a direction");
            input = in.next();
            if(input.equals("u"))
            {
                userGrid[Locx][Locy] = "[]"; 
                Locx --;
                userGrid[Locx][Locy] = "[x]"; 
                   for(int i = 0; i < x; i++)
            {
                    for(int j = 0; j < y; j++)
                    {
                        System.out.print(userGrid[i][j]);
                    }
                    System.out.println();
            }
            }
            if(input.equals("d"))
            {
                userGrid[Locx][Locy] = "[]"; 
                Locx ++;
                userGrid[Locx][Locy] = p1.getFace(); 
                  for(int i = 0; i < x; i++)
            {
                    for(int j = 0; j < y; j++)
                    {
                        System.out.print(userGrid[i][j]);
                    }
                    System.out.println();
            }
            }
            if(input.equals("l"))
            {
                userGrid[Locx][Locy] = "[]"; 
                Locy -- ;
                userGrid[Locx][Locy] = p1.getFace(); 
                  for(int i = 0; i < x; i++)
            {
                    for(int j = 0; j < y; j++)
                    {
                        System.out.print(userGrid[i][j]);
                    }
                    System.out.println();
            }
            }
            if(input.equals("r"))
            {
                userGrid[Locx][Locy] = "[]"; 
                Locy ++;
                userGrid[Locx][Locy] = p1.getFace(); 
                   for(int i = 0; i < x; i++)
            {
                    for(int j = 0; j < y; j++)
                    {
                        System.out.print(userGrid[i][j]);
                    }
                    System.out.println();
            }
            }
            
            if(Locx == rand1 && Locy == rand2)
            {
                System.out.println("You got it!");
                break;
            }
            
            
        } 
    }
    
}
    
