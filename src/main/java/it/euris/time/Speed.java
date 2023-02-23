package it.euris.time;

public class Speed {
    private int value;
    private TypeOfSpeed type;

    public Speed(int value, TypeOfSpeed type) {
        this.value = value;
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TypeOfSpeed getType() {
        return type;
    }

    public void setType(TypeOfSpeed type) {
        this.type = type;
    }
}
