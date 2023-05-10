/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg07.pkg04.assignment;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author kubrt
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
       String TypeOf = "original result ";
       String Adam = "Adam";
       String Jakub = "Jakub";
       String Helena = "Helena";
       String Klara = "Klara";
       String Alex =  "Alex";
       int AdamV = 1333;
       int JakubV = 1555;
       int KlaraV = 1666;
       int HelenaV = 1888;
       int AlexV = 1111;
       
       int [] votes = {AdamV,JakubV,HelenaV,KlaraV,AlexV};
       int [] votes1 = new int[votes.length];
       Candidate[] prices = {new Candidate(Adam, AdamV), new Candidate(Jakub,JakubV ), new Candidate(Helena, HelenaV), new Candidate(Klara,KlaraV), new Candidate(Alex,AlexV)};
       Candidate1[] prices1 = {new Candidate1(Adam, AdamV), new Candidate1(Jakub,JakubV ), new Candidate1(Helena, HelenaV), new Candidate1(Klara,KlaraV), new Candidate1(Alex,AlexV)};
       
       printInventory(prices);
       printResults(TypeOf,prices1,votes);
       deleteByName(prices1,"Alex",votes,AlexV);
       printResults("New One",prices1,deleteVoteByName(votes,AlexV));
       for(int a = 0; a < votes.length-1; a++){  
        votes1[a] += deleteVoteByName(votes,AlexV)[a];
        
    }
       deleteByLoc(prices1,2);
       printResults("New One",prices1,deleteVoteByLoc(votes1,2));
       
    
}
    public static void printInventory(Candidate [] prices) 
    {
        for(int i = 0; i < prices.length; i++)
        System.out.println(" " + prices[i]);
    } 
     public static void printResults(String TypeOf,Candidate1 [] prices1,int [] votes)
{   
    
    
    DecimalFormat df = new DecimalFormat("###.###");
    System.out.println("\n");
    System.out.println(TypeOf);
    System.out.println("Election Result: \n" );
    
    System.out.println("Candidate \t Votes  \t %of Total ");
    System.out.printf("%32s", "Recieved \t  Votes");
    System.out.println(" ");
    int num = 0;
    double [] procent = new double[prices1.length];
    int x = 0;
    for(int a = 0; a < votes.length; a++){  
        num += votes[a];
        
    }
    for(int a = 0; a < votes.length; a++){  
        procent[a] = ((double) votes[a] / (double) num) * 100;
        
    }
    
    for(int i = 0; i < prices1.length; i++){
    
    

    
    System.out.println(prices1[i] + "\t \t"+ df.format(procent[i]));
    
    }
    System.out.println("\n");
    System.out.println("overall  number of votes \t" + num);
}   
 public static void changeName(Candidate1[] prices1, String find, String replace)
{
for(int index = 0; index < prices1.length; index++)
if(prices1[index].getName().equals(find))
prices1[index].setName(replace);
} 
public static void changeVotes(Candidate1[] prices1, int find, int replace, int [] votes)
{
for(int index = 0; index < prices1.length; index++){
if(prices1[index].getVotes() == (find))
prices1[index].setVotes(replace);
}
for(int index = 0; index < votes.length; index++){
if(votes[index] == (find))
votes[index] = (replace);
}
}
public static void changeBothOfThem(Candidate1[] prices1, String find, String replace,int findV, int replaceV, int [] votes)
{
for(int index = 0; index < prices1.length; index++){
if(prices1[index].getName().equals(find))
prices1[index].setName(replace);
}
for(int index = 0; index < prices1.length; index++){
if(prices1[index].getVotes() == (findV))
prices1[index].setVotes(replaceV);
}
for(int index = 0; index < votes.length; index++){
if(votes[index] == (findV))
votes[index] = (replaceV);
}
}
public static void insertItem1(Candidate1[] prices1, int location,
                               String addN, int addS)
{
    //move items down in the array − last item is lost
    for(int index = prices1.length - 1; index > location; index--){
    prices1[index] = prices1[index-1];
}
    prices1[location] = new Candidate1(addN, addS);
}
public static void deleteByName(Candidate1[] itemList, String find,int [] votes,int nvote)
    {
        int location = 0;
        int index;

        // find location of item you want to delete
        for(index = 0; index < itemList.length; index++)
            if((itemList[index] != null) && (itemList[index].getName().equals(find)))
            {
                location = index;
                break;
            }
            else if(itemList[index] == null)
            {
                location = -1;
                break;
            }

        if ((index != itemList.length) && (location >= 0))
        { 
            //move items up in the array
            for(index = location; index < itemList.length -1; index++)
                itemList[index] = itemList[index + 1];

            itemList[itemList.length-1] = null;
        }
    deleteVoteByName(votes,nvote);    
    }
public static void deleteByLoc(Candidate1[] itemList, int location)
    {
        if ((location > 0) && (location < itemList.length))
        {
            //move items up in the array -
            for(int index = location; index < itemList.length -1; index++)
                itemList[index] = itemList[index + 1];

            itemList[itemList.length-1] = null;
        }
       
    }
public static int [] deleteVoteByName(int [] votes,int nvote){
List<Integer> arrayList = IntStream.of(votes)
                                    .boxed()
                                    .collect(Collectors.toList());
        int num = arrayList.indexOf(nvote);
        // Remove the specified element
        arrayList.remove(num);
 
        // return the resultant array
        return arrayList.stream()
            .mapToInt(Integer::intValue)
            .toArray();
}
public static int [] deleteVoteByLoc(int [] votes,int locate){
List<Integer> arrayList = IntStream.of(votes)
                                    .boxed()
                                    .collect(Collectors.toList());
        
        // Remove the specified element
        arrayList.remove(locate);
 
        // return the resultant array
        return arrayList.stream()
            .mapToInt(Integer::intValue)
            .toArray();
}
}