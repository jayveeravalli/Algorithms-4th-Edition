package exercise2;

import common.Deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckSort {

    public static boolean less(Deck obj1, Deck obj2){
        if (obj2.getSuit().compareTo(obj1.getSuit())!=0){
            return obj2.getSuit().compareTo(obj1.getSuit()) < 0;
        }

        return ((Integer)obj2.getValue()).compareTo(obj1.getValue()) < 0;
    }

    public static void sort(List<Deck> list) {

        // Using Insertion Sort

        for (int i = 1; i<list.size(); i++){
            for (int j = i; j > 0; j--){
                if (less(list.get(j-1), list.get(j))){
                    Collections.swap(list, j, j-1);
                }
            }
        }

    }

    public static void main(String[] args) {
        String[] suit = {"SPADES", "CLUBS", "HEARTS", "DIAMONDS"};
        List<Deck> list = new ArrayList<>();

        for (String i : suit) {
            int j = 1;
            while (j<=13){
                list.add(new Deck(i, j));
                j++;
            }
        }

        Collections.shuffle(list);

        sort(list);

        for (Deck i : list){
            System.out.println(i);
        }

    }

}
