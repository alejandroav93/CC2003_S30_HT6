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

    void printDeck(){
        System.out.println("Cards on Deck:");
        for (int i=0;i<deck.size();i++){
            System.out.println(Arrays.toString(deck.get(i)));
        }
        // for(int i=0;i<deck.size();i++){
        //     for(int j=0;j<deck.get(i).length;j++) {
        //         System.out.println(deck.get(i)[j]);
        //     }
            
        }

    void put(String cardName)
    {
        Set<String> keysList=map.keySet();
        Object[] keysArray=keysList.toArray();
        boolean found=false;

        for (int i = 0; i < map.size(); i++){
            String check=keysArray[i].toString();
            if(check.equals(cardName)){
                System.out.println("Found! On index: "+i);
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
