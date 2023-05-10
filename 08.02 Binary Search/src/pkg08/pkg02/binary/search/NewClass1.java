/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg08.pkg02.binary.search;

/**
 *
 * @author kubrt
 */
public static void linearPrintLoc(Music[] r, int low, String toFind)
{
int i;
int start = low;
int end = low;
System.out.println(low);
// find starting point of matches
i = low  - 1;
while((i >= 0) && (r[i].getArtist().compareTo(toFind) == 0))
{
    
start += i;
i--;
}
// find ending point of matches
i = low + 1;
while((i < r.length) && (r[i].getArtist().compareTo(toFind) == 0))
{
    
end += i;
i++;
}   
System.out.println(i);
System.out.println(r.length);
// now print out the matches
for(i = start; i <= end; i++){
System.out.println(r[i]);

}

}