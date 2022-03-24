package sg.edu.nus.mockAssessment2.model;

import jakarta.json.JsonObject;

public class Card {
    private String image;
    private String value;
    private String suit;
    private String code;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static Card create(JsonObject o) {
        Card c = new Card();
        c.setImage(o.getString("image"));
        c.setValue(o.getString("value"));
        c.setSuit(o.getString("suit"));
        c.setValue(o.getString("code"));
        return c;
    }
}