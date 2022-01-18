

import java.util.ArrayList;
import java.util.List;

/*
This class shall serve as the deck class which shall contain a bunch of cards.
The cards shall be collected in the form of a List.
*/
public class Deck {
    private String name;
    private List<FlashCard> flashCards;

    public Deck(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<FlashCard> getFlashCards() {
        return flashCards;
    }
    
    public void addFlashCard(FlashCard card){
        if(null!=card){
            if(flashCards==null){
                flashCards=new ArrayList<>();
            }
            flashCards.add(card);
        }
    }
}