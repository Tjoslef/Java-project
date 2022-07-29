/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg08.pkg03.challenge.program;

/**
 *
 * @author kubrt
 */
public class ChallengeProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Concact[] data = new Concact[10];
       data[0] = new Concact("Jana", "Mom", "11.Feb",666777, "Jana@hello.com");
       data[1] = new Concact("Josef", "Brother", "10.Feb",066777,"Josef@hello.com");
       data[2] = new Concact("Adel", "Sister", "12.Feb",966777,"Adel@hello.com");
       data[3] = new Concact("honza", "uncle", "13.Feb",866777,"honza@hello.com");
       data[4] = new Concact("Karel", "friend", "14.Feb",766777,"Karel@hello.com");
       data[5] = new Concact("Elen", "friend", "15.Feb",166777,"Elen@hello.com");
       data[6] = new Concact("Jonaš", "fellow", "16.Feb",266777,"Jonaš@hello.com");
       data[7] = new Concact("Zuzka", "fellow", "17.Feb",366777,"Alex@hello.com");
       data[8] = new Concact("Pepa", "fellow", "18.Feb",566777,"Pepa@hello.com");
       data[9] = new Concact("Sara", "grandmother", "19.Feb",466777,"Sara@hello.com");
       insertionRelation(data);
       findBirthday(data,"Feb");
       
       
       
       
    }
    public static void printData(Concact[] r)
    {
        System.out.println("Name                      Year        band");
        System.out.println("-------------------------------------------------------");
        for(int i = 0; i < r.length; i++)
            System.out.println(r[i]);
    }
    
   public static Concact[] insertionEmail(Concact[] source)
    {
        Concact[] dest = new Concact[ source.length ];
       
        

        for( int i = 0 ; i < source.length ; i++ )
        {
            Concact next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getEmail().compareTo( dest[k-1].getEmail() ) > 0 )
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
   public static Concact[] insertionBirthday(Concact[] source)
    {
        Concact[] dest = new Concact[ source.length ];
       
        

        for( int i = 0 ; i < source.length ; i++ )
        {
            Concact next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getBirthday().compareTo( dest[k-1].getEmail() ) > 0 )
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
     public static Concact[] insertionPnume(Concact[] source)
    {
       
        
        
int i;
int k;
int posMax;
Concact temp;

for(i = source.length -1; i >= 0; i--)
{


posMax = 0;
for( k = 0; k <= i; k++ )
{
if( source[k].getPnume() > source[ posMax ].getPnume() )
posMax = k;
}

temp = source[ i ];
source[ i ] = source[posMax ];
source[ posMax ] = temp;
        
    }
return source;
}
 public static Concact[] insertionName(Concact[] source)
    {
        Concact[] dest = new Concact[ source.length ];
       
        

        for( int i = 0 ; i < source.length ; i++ )
        {
            Concact next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getName().compareTo( dest[k-1].getName() ) > 0 )
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
 public static Concact[] insertionRelation(Concact[] source)
    {
        Concact[] dest = new Concact[ source.length ];
       
        

        for( int i = 0 ; i < source.length ; i++ )
        {
            Concact next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getRelation().compareTo( dest[k-1].getRelation() ) > 0 )
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

 
public static void binarySearchLocName(Concact[] r, String toFind)
{
int high = r.length;
int low = -1;
int probe;

while( high - low > 1 )
{
probe = ( high + low ) / 2;

if(r[probe].getName().compareTo(toFind) > 0)
high = probe;
else
{
low = probe;
if( r[probe].getName().compareTo(toFind) == 0)
{
break;
}
}
}

if( (low >= 0) && (r[low].getName().compareTo(toFind) == 0 ))
{
linearPrintLocName(r, low, toFind);
}

else
    System.out.println("NOT found: " + toFind);
}
public static void linearPrintLocName(Concact[] r, int low, String toFind)
{
    System.out.println("\t");
for(int i = low; i < r.length; i++) {
         if(r[i].getName().compareTo(toFind) == 0) {
             
             System.out.println(r[i]);
         } else {
             break;
         }
}
}
    public static void binarySearchLocRelation(Concact[] r, String toFind)
{
int high = r.length;
int low = -1;
int probe;

while( high - low > 1 )
{
probe = ( high + low ) / 2;

if(r[probe].getRelation().compareTo(toFind) > 0)
high = probe;
else
{
low = probe;
if( r[probe].getRelation().compareTo(toFind) == 0)
{
break;
}
}
}

if( (low >= 0) && (r[low].getRelation().compareTo(toFind) == 0 ))
{
linearPrintLocRelation(r, low, toFind);
}

else
    System.out.println("NOT found: " + toFind);
}
public static void linearPrintLocRelation(Concact[] r, int low, String toFind)
{
    System.out.println("\t");
for(int i = low-1; i < r.length; i++) {
         if(r[i].getRelation().compareTo(toFind) == 0) {
             
             System.out.println(r[i]);
             
         } else {
             break;
         }
}


}
public static void findEmail(Concact[] r, String toFind)
    {
        int found = -1;

        for(int i = 0; i < r.length; i++)
        {
            if(r[i].getEmail().compareTo(toFind) == 0)
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
public static void findpNumber(Concact[] r, int toFind)
    {
        int found = -1;

        for(int i = 0; i < r.length; i++)
        {
            if(r[i].getPnume() == toFind)
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
public static void findBirthday(Concact[] r, String toFind)
    {
        int found = -1;

        for(int i = 0; i < r.length; i++)
        {
            if(r[i].getBirthday().substring(3).compareTo(toFind) == 0)
            {
                
                System.out.println(r[i]); 
            }else if(r[i].getBirthday().substring(3).compareTo(toFind) > 0)
            {
             
             break;
            }
        }
        
    }   
}

