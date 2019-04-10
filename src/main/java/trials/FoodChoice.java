package trials;


import lombok.Getter;

@Getter
public enum FoodChoice {
    POLISH("traditional"),
    FRENCH("sweet desserts"),
    SPANISH("spicy"),
    DUTCH("mysterious");
//some comment
    private String description;

    FoodChoice(String description) {
        this.description = description;
    }
}
