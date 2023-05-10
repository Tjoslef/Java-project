/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg07.pkg09.assignment;

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
         insertionTitle(films,1);
         printRaw(films,"Sorted by title descending");
         insertionTitle(films,2);
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
   
  public static Movie[] insertionTitle(Movie[] source, int num)
    {
        Movie[] dest = new Movie[ source.length ];
        if (num == 1){
        

        for( int i = 0 ; i < source.length ; i++ )
        {
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getTitle().compareTo( dest[k-1].getTitle() ) > 0 )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }

            dest[ insertIndex ] = next;
            
            //Debugging Statements 
            //uncomment to print the listings after each pass through the sort
            //System.out.println("\nPass # " + i);
            //for(HouseListing h : dest)  
            //    if( h != null) System.out.printf("%-15s \n", h.getCity() );
        } // end of for
        for(int i = 0; i < source.length; i++){
        source[i] = dest[i];
    } 
        
    } else if (num == 2)
        {
            

for( int i = 0 ; i < source.length ; i++ )
        {
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getTitle().compareTo( dest[k-1].getTitle() ) < 0 )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }

            dest[ insertIndex ] = next;
            
            //Debugging Statements 
            //uncomment to print the listings after each pass through the sort
            //System.out.println("\nPass # " + i);
            //for(HouseListing h : dest)  
            //    if( h != null) System.out.printf("%-15s \n", h.getCity() );
        } // end of for
        for(int i = 0; i < source.length; i++){
        source[i] = dest[i];
    } 

} 
        return dest;
    }
  public static Movie[] insertionStudio(Movie[] source, int num)
    {
        Movie[] dest = new Movie[ source.length ];
        if (num == 1){
        

        for( int i = 0 ; i < source.length ; i++ )
        {
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getStudio().compareTo( dest[k-1].getStudio() ) > 0 )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }

            dest[ insertIndex ] = next;
            
            //Debugging Statements 
            //uncomment to print the listings after each pass through the sort
            //System.out.println("\nPass # " + i);
            //for(HouseListing h : dest)  
            //    if( h != null) System.out.printf("%-15s \n", h.getCity() );
        } // end of for
        for(int i = 0; i < source.length; i++){
        source[i] = dest[i];
    } 
        
    } else if (num == 2)
        {
            

for( int i = 0 ; i < source.length ; i++ )
        {
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getStudio().compareTo( dest[k-1].getStudio() ) < 0 )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }

            dest[ insertIndex ] = next;
            
            //Debugging Statements 
            //uncomment to print the listings after each pass through the sort
            //System.out.println("\nPass # " + i);
            //for(HouseListing h : dest)  
            //    if( h != null) System.out.printf("%-15s \n", h.getCity() );
        } // end of for
        for(int i = 0; i < source.length; i++){
        source[i] = dest[i];
    } 

} 
        return dest;
    }
   public static Movie [] insertionYear(Movie [] source, int num)
    {
        Movie [] dest = new Movie [ source.length ];
        
        if(num == 1){
        

        for( int i = 0 ; i < source.length ; i++ )
        {
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getYear() > dest[k-1].getYear() )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }

            dest[ insertIndex ] = next;
            
            //Debugging Statements 
            //uncomment to print the listings after each pass through the sort
            //System.out.println("\nPass # " + i);
            //for(HouseListing h : dest)  
            //    if( h != null) System.out.printf("$%10.2f \n", h.getCost() );
        } // end of for
        
        }
     else if(num == 2){
         

        for( int i = 0 ; i < source.length ; i++ )
        {
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getYear() < dest[k-1].getYear() )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }

            dest[ insertIndex ] = next;
            
            //Debugging Statements 
            //uncomment to print the listings after each pass through the sort
            //System.out.println("\nPass # " + i);
            //for(HouseListing h : dest)  
            //    if( h != null) System.out.printf("$%10.2f \n", h.getCost() );
        } // end of for
        


}
    



for(int i = 0; i < source.length; i++){
        source[i] = dest[i];
}
 return dest;
}
} // end of class   
   
   
   
   
   

