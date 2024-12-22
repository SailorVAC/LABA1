import java.util.Comparator;
import java.util.List;

public abstract class Food implements Nutritious, Comparator<Food> {
    protected String name;

    // Конструктор для всех продуктов
    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Абстрактный метод для вычисления калорийности
    public abstract int calculateCalories();


    // Переопределяем метод equals() для сравнения продуктов по имени
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Food food = (Food) obj;
        return name != null ? name.equals(food.name) : food.name == null;
    }

    @Override
    public String toString() {
        return name;
    }

    public static int countFoodOfType(List<Food> breakfast, Food targetFood) {
        int count = 0;
        for (Food food : breakfast) {
            if (food.equals(targetFood)) {
                count++;
            }
        }
        return count;
    }

    public static List<Food> sortByCalories(List<Food> breakfast) {
        breakfast.sort(Comparator.comparingInt(Food::calculateCalories));
        return breakfast;
    }

    public static void specialPar(String[] args,List<Food> food) {
        int allCalories = 0;

        for (String arg : args) {
            if (arg.equals("-calories")) {
                for (Food a : food)
                    allCalories += a.calculateCalories();
                System.out.println("Все калории "+ allCalories);
            }
            if (arg.equals("-sort")) {
                Food.sortByCalories(food);
                for (Food a : food) System.out.println(a);
            }
        }
    }

}




