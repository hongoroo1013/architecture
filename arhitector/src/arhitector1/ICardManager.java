package arhitector1;

import java.util.ArrayList;

public interface ICardManager {
    public int getCardSize();
    
    // from Play
    public String getCardQuestion(int index);
    public boolean validateCardReply(String Question,int index);

    // from Study
    public ArrayList<Card> getAllCards();
    public void printAllCards();

    // from Editor
    public void addNewCard(String q, String r);
    public void deleteCard(int index);
}
