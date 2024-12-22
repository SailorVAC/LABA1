import java.util.Collection;

// Класс Coffee, наследующий Food
public class Coffee extends Food  {
    private String aroma;

    public Coffee(String aroma) {
        super("Кофе");
        this.aroma = aroma;
    }
    @Override
    public int calculateCalories() {
        switch (aroma.toLowerCase()) {
            case "насыщенный": return 10;
            case "горький": return 15;
            case "восточный": return 20;
            default: return 5;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " с ароматом '" + aroma + "'";
    }


    @Override
    public int compare(Food o1, Food o2) {
        return 0;
    }
    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            Coffee other = (Coffee) obj;
            return aroma.equals(other.aroma);
        }
        return false;
    }

}