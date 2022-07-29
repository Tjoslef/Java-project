/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author kubrt
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        concact[] data = new concact[10];
        data[0] = new concact("Sourdough ", 10, 3 ,666777);
       data[1] = new concact("Focaccia", 11, 4 ,066777);
       data[2] = new concact("Banana Bread  ", 12, 2 ,966777);
       data[3] = new concact("Boston Quick Bread ", 13, 8 ,866777);
       data[4] = new concact("Cornbread ", 14, 7 ,766777);
       data[5] = new concact("Irish Soda Bread", 15, 1 ,166777);
       data[6] = new concact("Challah Bread", 16, 11 ,266777);
       data[7] = new concact("Brioche Bread ", 17, 6 ,366777);
       data[8] = new concact("Rye Bread", 18, 6 ,566777);
       data[9] = new concact("American Rye Bread", 19, 5 ,466777);
       printData(data);
       System.out.println("\n");
       mergeSort(data,0,9, 2);
       printData(data);
       System.out.println("\n");
       printData(SelectionQuantity(data,2));
       System.out.println("\n");
       printData(insertionCost(data,1));
       System.out.println("\n");
       printData(insertionName(data,2));
    }
    
public static void printData(concact[] r)
    {
        System.out.println("Name \t \t \t \t \t price $ \t\t quantity \t  product nume");
        System.out.println("-------------------------------------------------------");
        for(int i = 0; i < r.length; i++)
            System.out.println(r[i]);
    }
public static void mergeSort(concact[] a, int low, int high, int num)
{
if( low == high ) return;

int mid = ( low + high ) / 2;
mergeSort( a, low, mid,num);
mergeSort( a, mid + 1, high, num);
merge(a, low, mid, high,num);

}

public static void merge( concact[] a, int low, int mid, int high, int num )
{
    if(num == 1){
concact[] temp = new concact[ high - low + 1 ];
int i = low, j = mid + 1, n = 0;
while( i <= mid || j <= high )
{
if( i > mid )
{
temp[ n ] = a[ j ];
j++;
}
else if( j > high )
{
temp[ n ] = a[ i ];
i++;
}
else if( a[ i ].getPnume() < a[ j ].getPnume() )
{
// < is used to sort in ascending order
// use > to sort descending
temp[ n ] = a[ i ];
i++;
}
else
{
temp[ n ] = a[ j ];
j++;
}
n++;
}
for( int k = low; k <= high; k++ )
a[ k ] = temp[ k - low ];
    }
    else{
 concact[] temp = new concact[ high - low + 1 ];
int i = low, j = mid + 1, n = 0;
while( i <= mid || j <= high )
{
if( i > mid )
{
temp[ n ] = a[ j ];
j++;
}
else if( j > high )
{
temp[ n ] = a[ i ];
i++;
}
else if( a[ i ].getPnume() > a[ j ].getPnume() )
{
// < is used to sort in ascending order
// use > to sort descending
temp[ n ] = a[ i ];
i++;
}
else
{
temp[ n ] = a[ j ];
j++;
}
n++;
}
for( int k = low; k <= high; k++ )
a[ k ] = temp[ k - low ];   
    
    
    }
    } // end of merge
public static concact[] SelectionQuantity(concact[] source, int num)
    {
       
        if (num == 1){
        
int i;
int k;
int posMax;
concact temp;

for(i = source.length -1; i >= 0; i--)
{


posMax = 0;
for( k = 0; k <= i; k++ )
{
if( source[k].getQuantity() > source[ posMax ].getQuantity() )
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
concact temp;

for(i = source.length -1; i >= 0; i--)
{

// find largest element in the i elements
posMax = 0;
for( k = 0; k <= i; k++ )
{
if( source[k].getQuantity() < source[ posMax ].getQuantity() )
posMax = k;
}

temp = source[ i ];
source[ i ] = source[posMax ];
source[ posMax ] = temp;

} 
        
    }
        return source;
    }
public static concact[] insertionCost(concact[] source, int num)
{
    concact[] dest = new concact[ source.length ];
    if(num == 1){


for( int i = 0; i < source.length; i++ )
{
concact next = source[ i ];
int insertIndex = 0;
int k = i;
while( k > 0 && insertIndex == 0 )
{
if( next.getPrice() > dest[k-1].getPrice() )
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
    }
    else{


for( int i = 0; i < source.length; i++ )
{
concact next = source[ i ];
int insertIndex = 0;
int k = i;
while( k > 0 && insertIndex == 0 )
{
if( next.getPrice() > dest[k-1].getPrice() )
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
}// end of for
return dest;
} 
public static concact [] insertionName(concact [] source, int num)
    {
        concact[] dest = new concact[ source.length ];
        if (num == 1){
        
 int i;
        int k;
        int posMax;
        concact temp;

        for ( i = source.length - 1 ; i >= 0 ; i-- )
        {
            // find largest element in the i elements
            posMax = 0;
            for ( k = 0 ; k <= i ; k++ )
            {
                
                if (source[k].getName().compareTo(source[posMax].getName()) > 0){
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
        concact temp;
            for ( i = source.length - 1 ; i >= 0 ; i-- )
        {
            // find largest element in the i elements
            posMax = 0;
            for ( k = 0 ; k <= i ; k++ )
            {
                
                if (source[k].getName().compareTo(source[posMax].getName()) < 0){
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
