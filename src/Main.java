import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Food> food = new ArrayList<>();
        Coffee a=new Coffee("насыщенный");
        System.out.println((a.toString()));
        System.out.println(a.calculateCalories());
        Coffee b=new Coffee("горький");
        System.out.println((b.toString()));
        System.out.println(b.calculateCalories());
        Bat c=new Bat("с маком");
        System.out.println((c.toString()));
        System.out.println(c.calculateCalories());


        food.add(a);
        food.add(b);
        food.add(c);
        System.out.println(Food.countFoodOfType(food, a));
        Food.specialPar(args,food);




    }
}





