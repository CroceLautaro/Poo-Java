public class Card extends Payment{
    Integer numberCard;
    Integer cvvCard;
    String expirationDate;

    public Card(Integer numberCard, Integer cvvCard, String expirationDate){
        this.cvvCard = cvvCard;
        this.expirationDate = expirationDate;
        this.numberCard = numberCard;
    }
    
}
