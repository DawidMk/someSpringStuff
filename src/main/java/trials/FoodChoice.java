package trials;


import lombok.Getter;

@Getter
public enum FoodChoice {
    POLISH("traditional"),
    FRENCH("sweet desserts"),
    SPANISH("spicy"),
    DUTCH("mysterious");
//some comment
    //some comment 2
    private String description;

    FoodChoice(String description) {
        this.description = description;
    }
}
//aaaaa