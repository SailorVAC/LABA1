public class Bat extends Food {
    private String dough;

    public Bat(String dough) {
        super("Булка");
        this.dough=dough;
    }
    public String getDough() {
        return dough;
    }

    @Override
    public int calculateCalories() {
        switch (dough.toLowerCase()) {
            case "с маком": return 30;
            case "с сыром": return 25;
            case "с повидлом": return 24;
            default: return 15;
        }
    }
    @Override
    public String toString() {
        return super.toString() + dough + "'";
    }
    @Override
    public int compare(Food o1, Food o2) {
        return 0;
    }
    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            Bat other = (Bat) obj;
            return dough.equals(other.dough);
        }
        return false;
    }

}
