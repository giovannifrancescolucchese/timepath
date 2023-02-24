package it.euris.time;

public class Speed {
    private final int value;
    private final TypeOfSpeed type;

    public Speed(int value, TypeOfSpeed type) {
        this.value = value;
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public TypeOfSpeed getType() {
        return type;
    }


}
