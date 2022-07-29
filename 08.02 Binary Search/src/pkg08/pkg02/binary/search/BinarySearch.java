/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg08.pkg02.binary.search;

/**
 *
 * @author kubrt
 */
public class BinarySearch {

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
       insertionTitle(data); // soarting data by artish
       printData(data);
       binarySearchLocAr(data,"The Pot"); // binary Searching
       insertionYear(data);
       binarySearchLocYe(data,2021);
       
       
       
    }
    public static void printData(Music[] r)
    {
        System.out.println("Name                      Year        band");
        System.out.println("-------------------------------------------------------");
        for(int i = 0; i < r.length; i++)
            System.out.println(r[i]);
    }
    // soarting
   public static Music[] insertionTitle(Music[] source)
    {
        Music[] dest = new Music[ source.length ];
       
        

        for( int i = 0 ; i < source.length ; i++ )
        {
            Music next = source[ i ];
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
    return source;   
    
}
   //soarting
     public static Music[] insertionYear(Music[] source)
    {
       
        
        
int i;
int k;
int posMax;
Music temp;

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
        
    }
return source;
}
     // soarting
 public static Music[] insertionArtish(Music[] source)
    {
        Music[] dest = new Music[ source.length ];
       
        

        for( int i = 0 ; i < source.length ; i++ )
        {
            Music next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getArtist().compareTo( dest[k-1].getArtist() ) > 0 )
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
            
            
        } 
        for(int i = 0; i < source.length; i++){
        source[i] = dest[i];
    } 
    return source;   
    
}
//binary search 
public static void binarySearchLoc(Music[] r, String toFind)
{
int high = r.length;
int low = -1;
int probe;

while( high - low > 1 )
{
probe = ( high + low ) / 2;

if(r[probe].getArtist().compareTo(toFind) > 0)
high = probe;
else
{
low = probe;
if( r[probe].getArtist().compareTo(toFind) == 0)
{
break;
}
}
}

if( (low >= 0) && (r[low].getArtist().compareTo(toFind) == 0 ))
{
linearPrintLoc(r, low, toFind);
}

else
    System.out.println("NOT found: " + toFind);
}
public static void linearPrintLoc(Music[] r, int low, String toFind)
{
    System.out.println("\t");
for(int i = low; i < r.length; i++) {
         if(r[i].getArtist().compareTo(toFind) == 0) {
             
             System.out.println(r[i]);
         } else {
             break;
         }
}
// now print out the matches


}
public static void binarySearchLocAr(Music[] r, String toFind)
{
int high = r.length;
int low = -1;
int probe;

while( high - low > 1 )
{
probe = ( high + low ) / 2;

if(r[probe].getTitle().compareTo(toFind) > 0)
high = probe;
else
{
low = probe;
if( r[probe].getTitle().compareTo(toFind) == 0)
{
break;
}
}
}

if( (low >= 0) && (r[low].getTitle().compareTo(toFind) == 0 ))
{
linearPrintLocAr(r, low, toFind);
}

else
    System.out.println("NOT found: " + toFind);
}
public static void linearPrintLocAr(Music[] r, int low, String toFind)
{
    System.out.println("\t");
for(int i = low; i < r.length; i++) {
         if(r[i].getTitle().compareTo(toFind) == 0) {
             
             System.out.println(r[i]);
         } else {
             break;
         }
}
// now print out the matches


}
public static void binarySearchLocYe(Music[] r, int toFind)
{
int high = r.length;
int low = -1;
int probe;

while( high - low > 1 )
{
probe = ( high + low ) / 2;

if(r[probe].getYear() != toFind)
high = probe;
else
{
low = probe;
if( r[probe].getYear() == toFind)
{
break;
}
}
}

if( (low >= 0) && (r[low].getYear() == toFind))
{
linearPrintLocYe(r, low, toFind);
}else
    System.out.println("NOT found: " + toFind);
}
public static void linearPrintLocYe(Music[] r, int low, int toFind)
{
    System.out.println("\t");
for(int i = low; i < r.length; i++) {
         if(r[i].getYear() == toFind) {
             
             System.out.println(r[i]);
         } else {
             break;
         }
}
// now print out the matches


}
}