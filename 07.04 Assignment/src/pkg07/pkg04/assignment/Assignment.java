/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg07.pkg04.assignment;



import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 *
 * @author kubrt
 */
public class Assignment {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       String TypeOf = "original result ";
       List<Candidate> inventory = new ArrayList<Candidate>();
       List<Candidate1> inventory1 = new ArrayList<Candidate1>();
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
       int [] votes = {AdamV,JakubV,KlaraV,HelenaV,AlexV};
       int [] votes1 = new int[votes.length];
       inventory.add(new Candidate(Adam,AdamV));
       inventory.add(new Candidate(Jakub,JakubV));
       inventory.add(new Candidate(Klara,KlaraV));
       inventory.add(new Candidate(Helena,HelenaV));
       inventory.add(new Candidate(Alex,AlexV));
       inventory1.add(new Candidate1(Adam,AdamV));
       inventory1.add(new Candidate1(Jakub,JakubV));
       inventory1.add(new Candidate1(Klara,KlaraV));
       inventory1.add(new Candidate1(Helena,HelenaV));
       inventory1.add(new Candidate1(Alex,AlexV));
       //printRaw(inventory);
       //printRaw1(TypeOf,inventory1,votes);
       System.out.println();
       printRaw1("Normal",inventory1,votes);
       deleteByName(inventory1,"Alex",votes,AlexV);
       printRaw1("Without Alex",inventory1,deleteVotesByName(votes,AlexV));
       for(int a = 0; a < votes.length-1; a++){  
        votes1[a] += deleteVotesByName(votes,AlexV)[a];
        
    }
       deleteByLoc(inventory1,2,votes1,2);
       printRaw1("Without 2",inventory1,deleteVotesByLoc(votes1,2));

}
    public static void printRaw(List<Candidate> itemList)
{
    for(int i = 0; i < itemList.size(); i++)
    System.out.println(itemList.get(i));
}
    public static void printRaw1(String TypeOf,List<Candidate1> itemList, int [] votes)
{
    DecimalFormat df = new DecimalFormat("###.###");
    System.out.println("\n");
    System.out.println(TypeOf);
    System.out.println("Election Result: \n" );
    
    System.out.println("Candidate \t Votes  \t %of Total ");
    System.out.printf("%32s", "Recieved \t  Votes");
    System.out.println(" ");
    //make a percentages
    int num = 0;
    double [] procent = new double[votes.length];
    for(int a = 0; a < votes.length; a++){  
        num += votes[a];
        
    }
    int a = 0;
    for( a = 0; a < votes.length; a++){  
        procent[a] = ((double) votes[a] / (double) num) * 100;
        
    }
    
    for(int i = 0; i < itemList.size(); i++){
    System.out.println(itemList.get(i) + "\t \t"+ df.format(procent[i]));
    }
    System.out.println("\n");
    System.out.println("overall  number of votes \t" + num);
}

public static void changeName(List<Candidate1> itemList, String find, String replace)
{
for(int index = 0; index < itemList.size(); index++)
if(itemList.get(index).getName().equals(find))
itemList.get(index).setName(replace);
}
public static void changeVotes(List<Candidate1> itemList, int find, int replace)
{
for(int index = 0; index < itemList.size(); index++){
if(itemList.get(index).getVotes() == (find))
itemList.get(index).setVotes(replace);
}

}
public static void changeBothOfThem(List<Candidate1> itemList, String find, String replace,int findV, int replaceV,int [] votes)
{
for(int index = 0; index < itemList.size(); index++){
if(itemList.get(index).getName().equals(find))
itemList.get(index).setName(replace);
}
for(int index = 0; index < itemList.size(); index++){
if(itemList.get(index).getVotes() == (findV))
itemList.get(index).setVotes(replaceV);
}
for(int index = 0; index < votes.length; index++){
if(votes[index] == (findV))
votes[index] = (replaceV);
}
}

public static void insertItemL(List<Candidate1> itemList, int location,
                               String addN, int addS)
{
    // insert item into ArrayList
    itemList.add(location, new Candidate1(addN, addS));
    
}
    

public static void insertItemN(List<Candidate1> itemList, String find,
                               String addN, int addS)
{
    int location = 0;

    // find location of item you want to insert before
    for(int index = 0; index < itemList.size(); index++)
        if(itemList.get(index).getName().equals(find))
            location = index;

    // insert item into ArrayList
    itemList.add(location, new Candidate1(addN, addS));
    /*for(int index = 0; index < votes.length; index++){
    if(votes[index] == (location)){
        votes[index] = (addS);
    }
} 
*/
}


// find location of item you want to delete
public static void deleteByName(List<Candidate1> itemList, String find, int [] votes, int nvote)
{
int location = 0;
int index;

// find location of item you want to delete
for(index = 0; index < itemList.size(); index++)
{
if(itemList.get(index).getName().equals(find))
{
location = index;
break;
}
}
// delete item from ArrayList
if(index != itemList.size()){
itemList.remove(location);

}



}
public static void deleteByLoc(List<Candidate1> itemList, int location, int [] votes, int locate)
{
// delete item from ArrayList
itemList.remove(location);
deleteVotesByLoc(votes,locate);
}
public static int [] deleteVotesByLoc(int [] votes,int locate){
    // From array to ArrayList
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
public static int [] deleteVotesByName(int [] votes,int nvote){
    // From array to ArrayList
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

}