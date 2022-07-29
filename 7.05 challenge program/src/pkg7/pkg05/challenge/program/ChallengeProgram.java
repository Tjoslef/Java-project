/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.pkg05.challenge.program;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kubrt
 */
public class ChallengeProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<challengehelp> inventory = new ArrayList<challengehelp>();
       inventory.add(new challengehelp("Adam",80,70,60,90,40));
       inventory.add(new challengehelp("lukas",85,60,67,93,21));
       inventory.add(new challengehelp("Hana",35,90,77,66,33));
       inventory.add(new challengehelp("Eva",55,66,67,93,21));
       inventory.add(new challengehelp("Gulas",45,63,68,91,27));
       printRaw(inventory);
       changeName(inventory,"Hana","pepa");
       insertItemN(inventory,"Gulas","oko",45,63,68,91,27);
       deleteByName(inventory,"Adam");
       printRaw(inventory);
    }
    public static void printRaw(List<challengehelp> itemList)
            
{
    System.out.println("Starting Gradebook: \n");
    System.out.println("Student name \t \t Q1 \t \t  Q2 \t \t Q3  \t \t Q4  \t\tQ5");
    System.out.println("---------------------------------------------------------------------");
    for(int i = 0; i < itemList.size(); i++){
    System.out.println(itemList.get(i));
    }
    System.out.println("\n");
}
    public static void changeName(List<challengehelp> itemList, String find, String replace)
{
for(int index = 0; index < itemList.size(); index++)
if(itemList.get(index).getName().equals(find))
itemList.get(index).setName(replace);
}
    
public static void changeScore(List<challengehelp> itemList, int find, int replace)
{
for(int index = 0; index < itemList.size(); index++){
if(itemList.get(index).get1Score() == (find)){
itemList.get(index).set1Score(replace);
}else if(itemList.get(index).get2Score() == (find)){
itemList.get(index).set2Score(replace);
}else if(itemList.get(index).get3Score() == (find)){
itemList.get(index).set3Score(replace);
}else if(itemList.get(index).get4Score() == (find)){
itemList.get(index).set4Score(replace);
}else if(itemList.get(index).get5Score() == (find)){
itemList.get(index).set5Score(replace);
}
}
}
public static void changeBothOfThem(List<challengehelp> itemList, String find, String replace,int findS1, int findS2,int findS3, int findS4, int findS5,
        int replaceS,int replaceS1,int replaceS2,int replaceS3,int replaceS4)
{
for(int index = 0; index < itemList.size(); index++){
if(itemList.get(index).getName().equals(find))
itemList.get(index).setName(replace);
}
for(int index = 0; index < itemList.size(); index++){
if(itemList.get(index).get1Score() == (findS1)){
itemList.get(index).set1Score(replaceS);
}else if(itemList.get(index).get2Score() == (findS1)){
itemList.get(index).set2Score(replaceS);
}else if(itemList.get(index).get3Score() == (findS1)){
itemList.get(index).set3Score(replaceS);
}else if(itemList.get(index).get4Score() == (findS1)){
itemList.get(index).set4Score(replaceS);
}else if(itemList.get(index).get5Score() == (findS1)){
itemList.get(index).set5Score(replaceS);
}
}
for(int index = 0; index < itemList.size(); index++){
if(itemList.get(index).get1Score() == (findS2)){
itemList.get(index).set1Score(replaceS);
}else if(itemList.get(index).get2Score() == (findS2)){
itemList.get(index).set2Score(replaceS);
}else if(itemList.get(index).get3Score() == (findS2)){
itemList.get(index).set3Score(replaceS);
}else if(itemList.get(index).get4Score() == (findS2)){
itemList.get(index).set4Score(replaceS);
}else if(itemList.get(index).get5Score() == (findS2)){
itemList.get(index).set5Score(replaceS);
}
}
for(int index = 0; index < itemList.size(); index++){
if(itemList.get(index).get1Score() == (findS3)){
itemList.get(index).set1Score(replaceS);
}else if(itemList.get(index).get2Score() == (findS3)){
itemList.get(index).set2Score(replaceS);
}else if(itemList.get(index).get3Score() == (findS3)){
itemList.get(index).set3Score(replaceS);
}else if(itemList.get(index).get4Score() == (findS3)){
itemList.get(index).set4Score(replaceS);
}else if(itemList.get(index).get5Score() == (findS3)){
itemList.get(index).set5Score(replaceS);
}
}
for(int index = 0; index < itemList.size(); index++){
if(itemList.get(index).get1Score() == (findS4)){
itemList.get(index).set1Score(replaceS);
}else if(itemList.get(index).get2Score() == (findS4)){
itemList.get(index).set2Score(replaceS);
}else if(itemList.get(index).get3Score() == (findS4)){
itemList.get(index).set3Score(replaceS);
}else if(itemList.get(index).get4Score() == (findS4)){
itemList.get(index).set4Score(replaceS);
}else if(itemList.get(index).get5Score() == (findS4)){
itemList.get(index).set5Score(replaceS);
}
}
for(int index = 0; index < itemList.size(); index++){
if(itemList.get(index).get1Score() == (findS5)){
itemList.get(index).set1Score(replaceS);
}else if(itemList.get(index).get2Score() == (findS5)){
itemList.get(index).set2Score(replaceS);
}else if(itemList.get(index).get3Score() == (findS5)){
itemList.get(index).set3Score(replaceS);
}else if(itemList.get(index).get4Score() == (findS5)){
itemList.get(index).set4Score(replaceS);
}else if(itemList.get(index).get5Score() == (findS5)){
itemList.get(index).set5Score(replaceS);
}
}
}
public static void insertItemN(List<challengehelp> itemList, String find,
                               String addN, int addS1, int addS2, int addS3, int addS4,int addS5)
{
    int location = 0;

    // find location of item you want to insert before
    for(int index = 0; index < itemList.size(); index++)
        if(itemList.get(index).getName().equals(find))
            location = index;

    // insert item into ArrayList
    itemList.add(location, new challengehelp(addN, addS1,addS2,addS3,addS4,addS5));
    /*for(int index = 0; index < votes.length; index++){
    if(votes[index] == (location)){
        votes[index] = (addS);
    }
} 
*/
}
public static void deleteByName(List<challengehelp> itemList, String find)
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
if(index != itemList.size())
itemList.remove(location);
}
}
