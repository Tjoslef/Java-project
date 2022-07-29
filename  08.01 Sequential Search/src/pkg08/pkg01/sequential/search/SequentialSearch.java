/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg08.pkg01.sequential.search;

/**
 *
 * @author kubrt
 */
public class SequentialSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Music[] data = new Music[10];
       data[0] = new Music("The Trio", 1967, "Ennio Morricone");
       data[1] = new Music("AKUMA", 2017, "Alex,TOKYO ROSE");
       data[2] = new Music("In the end", 2000, "Linkin Park");
       data[3] = new Music("Pull Me Under ", 1992, "Dream Theater");
       data[4] = new Music("Ornithopter", 2021, "Hans Zimmer");
       data[5] = new Music("Heart and Bones", 1983, "Paul Simone");
       data[6] = new Music("The Pot", 2006, "Tool");
       data[7] = new Music("Lateralus ", 2001, "Tool");
       data[8] = new Music("Never Enough ", 2007, "Five Finder Death Punch");
       data[9] = new Music("What comes around ", 2001, "lll nino");
       printData(data);
       findPerson(data,"AKUMA");
       findYear(data,2001);
       findAtist(data,"Paul Simone");
    }
    public static void printData(Music[] r)
    {
        System.out.println("Name                      Year        band");
        System.out.println("-------------------------------------------------------");
        for(int i = 0; i < r.length; i++)
            System.out.println(r[i]);
    }
    public static void findPerson(Music[] r, String toFind)
    {
        int found = -1;

        for(int i = 0; i < r.length; i++)
        {
            if(r[i].getTitle().compareTo(toFind) == 0)
            {
                found = i;
                break;   //terminates the for loop 
            }
        }
        
        if(found != -1)
        {  // we have found the person
            System.out.println(""
                    + "l find " + toFind + "the song");
            System.out.println(r[found]);
        }
        else
            System.out.println(toFind + " is not in data");
    }
   public static void findYear(Music[] r, int toFind)
    {
        int found = -1;

        for(int i = 0; i < r.length; i++)
        {
            if(r[i].getYear() == toFind)
            {
                System.out.println(""
                    + "l find " + toFind + "the song");
                System.out.println(r[i]);
                
                 //terminates the for loop 
            }
            else if(r[i].getYear() != toFind && i == r.length)
            {
             System.out.println(toFind + " is not in data");
             break;
            }
        
        /*if(found != -1)
        {  // we have found the person
            for(int a = 0; a < found; a++){
            System.out.println(""
                    + "l find " + toFind + "the song");
            System.out.println(r[found]);
            }
        }
*/
        /*else
            System.out.println(toFind + " is not in data");
        }
*/
    }
}
   public static void findAtist(Music[] r, String toFind)
    {
        int found = -1;

        for(int i = 0; i < r.length; i++)
        {
            if(r[i].getArtist().compareTo(toFind) == 0)
            {
                found = i;
                break;   //terminates the for loop 
            }
        }
        
        if(found != -1)
        {  // we have found the person
            System.out.println(""
                    + "l find him" + toFind + "     in data");
            System.out.println(r[found]);
        }
        else
            System.out.println(toFind + " is not in data");
    }
}
