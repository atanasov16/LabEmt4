package mk.ukim.finki.emt.dietcatalog.domain.models;

import jakarta.persistence.*;
import lombok.NonNull;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.domain.nutrition.Nutrition;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="meal")
public class Meal extends AbstractEntity<MealId> {
    private Nutrition nutrition;
    @ElementCollection
    private List<String> allergens;
    @ManyToMany
    private List<Diet> dietList;
    public Meal() {
        super(MealId.randomId(MealId.class));
        nutrition = new Nutrition();
        dietList = new ArrayList<>();
        allergens = new ArrayList<>();
    }
    public Meal(Nutrition nutrition, List<String> allergens){
        super(MealId.randomId(MealId.class));
        this.allergens = allergens;
        this.nutrition = new Nutrition(nutrition);
    }
    public void addAllergen(String str){
        allergens.add(str);
    }
    public void updateNutrition(Nutrition nutrition){
        this.nutrition = new Nutrition(nutrition);
    }
    public List<String> getAllergens(){
        return allergens;
    }

    public List<Diet> getDietList() {
        return dietList;
    }
    public Diet addToDiet(@NonNull Diet diet){
        dietList.add(diet);
        return diet;
    }
    public Diet removeFromDiet(@NonNull Diet diet){
        dietList.remove(diet);
        return diet;
    }
    public int countCalories() {
        return this.nutrition.accessCalories();
    }
}
