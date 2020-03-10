import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Arrays;
import javax.sound.sampled.SourceDataLine;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Deck{
    Map<String,String> map;
    ArrayList<String[]> deck = new ArrayList<String[]>();

    Deck(Map<String,String> map){
        this.map=map;
    }

    //inciso 3
    void printDeck(){
        System.out.println("Cards on Deck:");
        for (int i=0;i<deck.size();i++){
            System.out.println(Arrays.toString(deck.get(i)));
        }
        }

        //inciso 4
    void printOrderedDeck(){
        System.out.println("Cartas tipo MONSTRUO:");
        for(int i=0;i<deck.size();i++){
            if(deck.get(i)[1].equals("Monstruo")){
                System.out.println(Arrays.toString(deck.get(i)));   
            }
        }
        System.out.println("Cartas tipo TRAMPA:");
        for(int i=0;i<deck.size();i++){
            if(deck.get(i)[1].equals("Trampa")){
                System.out.println(Arrays.toString(deck.get(i)));   
            }
        }
        System.out.println("Cartas tipo HECHIZO:");
        for(int i=0;i<deck.size();i++){
            if(deck.get(i)[1].equals("Hechizo")){
                System.out.println(Arrays.toString(deck.get(i)));   
            }
        }
    }

    //inciso 5
    void printMap(){
        Set<String> keysList=map.keySet();
        Object[] keysArray=keysList.toArray();
        for (int i = 0; i < map.size(); i++) 
        {
            System.out.println("Name: "+keysArray[i]+". Type: "+map.get(keysArray[i]));
            i++;
        }
    }

    //inciso 6
    void printOrderedMap(){
        Set<String> keysList=map.keySet();
        Object[] keysArray=keysList.toArray();
        System.out.println("CARTAS TIPO MONSTRUO:");
        System.out.println(keysArray[0]);
        for (int i = 0; i < map.size(); i++)
        {
            if(map.get(keysArray[i]).equals("Monstruo")){
            System.out.println("Type: "+keysArray[i]+". Name: "+map.get(keysArray[i]));//falta agregar cantidad
            }
        }
        System.out.println("CARTAS TIPO HECHIZO:");
        for (int i = 0; i < map.size(); i++)
        {
            if(map.get(keysArray[i]).equals("Hechizo")){
            System.out.println("Type: "+keysArray[i]+". Name: "+map.get(keysArray[i]));//falta agregar cantidad
            }
        }
        System.out.println("CARTAS TIPO TRAMPA:");
        for (int i = 0; i < map.size(); i++)
        {

            if(map.get(keysArray[i]).equals("Trampa")){
            System.out.println("Type: "+keysArray[i]+". Name: "+map.get(keysArray[i]));//falta agregar cantidad
            }
        }


    }

        //inciso 1
    void put(String cardName)
    {
        Set<String> keysList=map.keySet();
        Object[] keysArray=keysList.toArray();
        boolean found=false;

        for (int i = 0; i < map.size(); i++){
            String check=keysArray[i].toString();
            if(check.equals(cardName)){
                found=true;
                if(cardExists(cardName)){
                validateCard(cardName);
                break;
                }
                else{
                String[] newCard={check,map.get(check),"1"};
                deck.add(newCard);
                System.out.println("Added card= "+Arrays.toString(newCard));
                break;
                }
            }
        }
        if(!found)
        {
        System.out.println("ERROR. Couldn't add card: "+cardName);
        }
}

//inciso 2
void showCard(Object cardName)
{
    String type=map.get(cardName);
    System.out.println("The type for "+cardName.toString()+" is: "+type);
}



void validateCard(String cardName)
{
    for(int i=0;i<deck.size();i++){
        if(deck.get(i)[0].equals(cardName)){
            String extraCard=deck.get(i)[2];
            int oneMoreCard=Integer.parseInt(extraCard)+1;
            String addedCard=Integer.toString(oneMoreCard);
            deck.get(i)[2]=addedCard;
            break;
        }
    }
    
}


boolean cardExists(String cardName){
    for(int i=0;i<deck.size();i++){
        if(deck.get(i)[0].equals(cardName))
        {
            return true;
        }
    }
    return false;
}
}
