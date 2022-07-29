/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.pkg10;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author kubrt
 */
public class Assignment {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Movie[] films = new Movie[5];
        Movie[] sortedF = new Movie[5];
        String name = null;
          films[0] = new Movie("Nothing", 2002 , "Radio Moskva");
          films[1] = new Movie("Слава Украине", 2003 , "Dožď");
          films[2] = new Movie("L need ammunition not a ride", 200 , "Lucasfilm");
          films[3] =  new Movie("Spalena Zem", 2005 , "Warner Bros. Pictures");
          films[4] =  new Movie("Nabarvené ptače", 2019, "Idk");
         insertionTItle(films,1);
         printRaw(films,"Sorted by title descending");
         insertionTItle(films,2);
         printRaw(films,"Sorted by title ascending");
         insertionStudio(films,1);
         printRaw(films,"Sorted by studio ascending");
         insertionStudio(films,2);
         printRaw(films,"Sorted by studio descending");
         insertionYear(films,1);
         printRaw(films,"Sorted by year descending");
         insertionYear(films,2);
         printRaw(films,"Sorted by year ascending");
         //printRaw(films);
         
         
    }
    public static void printRaw(Movie [] prices,String name) 
    {
        System.out.println("\n");
        System.out.printf("%35s \n", name);
        for(int i = 0; i < prices.length; i++)

        System.out.println(" " + prices[i]);
    } 
  //public static void   
   
  public static Movie[] insertionYear(Movie[] source, int num)
    {
       
        if (num == 1){
        
int i;
int k;
int posMax;
Movie temp;

for(i = source.length -1; i >= 0; i--)
{


posMax = 0;
for( k = 0; k <= i; k++ )
{
if( source[k].getYear() > source[ posMax ].getYear() )
posMax = k;
}

temp = source[ i ];
source[ i ] = source[posMax ];
source[ posMax ] = temp;
        
    }} else if (num == 2)
        {
            

int i;
int k;
int posMax;
Movie temp;

for(i = source.length -1; i >= 0; i--)
{

// find largest element in the i elements
posMax = 0;
for( k = 0; k <= i; k++ )
{
if( source[k].getYear() < source[ posMax ].getYear() )
posMax = k;
}

temp = source[ i ];
source[ i ] = source[posMax ];
source[ posMax ] = temp;

} 
        
    }
        return source;
    }
    
  public static Movie[] insertionStudio(Movie[] source, int num)
    {
        Movie[] dest = new Movie[ source.length ];
        if (num == 1){
        
 int i;
        int k;
        int posMax;
        Movie temp;

        for ( i = source.length - 1 ; i >= 0 ; i-- )
        {
            // find largest element in the i elements
            posMax = 0;
            for ( k = 0 ; k <= i ; k++ )
            {
                
                if (source[k].getStudio().compareTo(source[posMax].getStudio()) > 0){
                    posMax = k;
                }
            }
            
            temp = source[ i ];
            source[ i ] = source[posMax ];
            source[ posMax ] = temp;
            

        }
    }
     else if (num == 2)
        {
            int i;
        int k;
        int posMax;
        Movie temp;
            for ( i = source.length - 1 ; i >= 0 ; i-- )
        {
            // find largest element in the i elements
            posMax = 0;
            for ( k = 0 ; k <= i ; k++ )
            {
                
                if (source[k].getStudio().compareTo(source[posMax].getStudio()) < 0){
                    posMax = k;
                }
            }
            
            temp = source[ i ];
            source[ i ] = source[posMax ];
            source[ posMax ] = temp;
            
            
        }
    } 

 
        return source;
    }
   public static Movie [] insertionTItle(Movie [] source, int num)
    {
        Movie[] dest = new Movie[ source.length ];
        if (num == 1){
        
 int i;
        int k;
        int posMax;
        Movie temp;

        for ( i = source.length - 1 ; i >= 0 ; i-- )
        {
            // find largest element in the i elements
            posMax = 0;
            for ( k = 0 ; k <= i ; k++ )
            {
                
                if (source[k].getTitle().compareTo(source[posMax].getTitle()) > 0){
                    posMax = k;
                }
            }
            
            temp = source[ i ];
            source[ i ] = source[posMax ];
            source[ posMax ] = temp;
            
            
        }
    }
     else if (num == 2)
        {
            int i;
        int k;
        int posMax;
        Movie temp;
            for ( i = source.length - 1 ; i >= 0 ; i-- )
        {
            // find largest element in the i elements
            posMax = 0;
            for ( k = 0 ; k <= i ; k++ )
            {
                
                if (source[k].getStudio().compareTo(source[posMax].getStudio()) < 0){
                    posMax = k;
                }
            }
            // swap the item with the largest cost 
            // with the element in position i
            // now the item is in its proper location
            temp = source[ i ];
            source[ i ] = source[posMax ];
            source[ posMax ] = temp;
            
        }
    } 
        return source;
    }
}
        
       
   
   
   
   
   

