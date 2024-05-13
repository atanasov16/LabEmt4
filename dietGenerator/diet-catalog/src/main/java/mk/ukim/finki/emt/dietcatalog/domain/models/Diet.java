package mk.ukim.finki.emt.dietcatalog.domain.models;

import jakarta.persistence.*;
import lombok.NonNull;
import mk.ukim.finki.emt.dietcatalog.domain.valueObjects.Type;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "diet")
public class Diet extends AbstractEntity<DietId> {
    private Type type;
    @ManyToMany
    private List<Meal> meals;

    @ElementCollection
    private List<String> allergens;
    public Diet() {
        super(DietId.randomId(DietId.class));
        this.meals = new ArrayList<>();
        allergens=new ArrayList<>();
    }
    public void calculateAllergens(){
        for (Meal m:
             meals) {
            List<String> mAllergens = m.getAllergens();
            for (String allergen:
                 mAllergens) {
                if(!allergen.contains(allergen)){
                    allergens.add(allergen);
                }
            }
        }
    }
    public void addAllergen(String allergen){
        if(!this.allergens.contains(allergen)){
            this.allergens.add(allergen);
        }
    }

    public List<String> getAllergens() {
        return allergens;
    }
    public Meal addMeal(@NonNull Meal meal){
        meals.add(meal);
        return meal;
    }
    public Meal removeMeal(@NonNull Meal meal){
        meals.remove(meal);
        return meal;
    }

    public Diet(Type type, List<Meal> meals, List<String> allergens) {
        super(DietId.randomId(DietId.class));
        this.type = type;
        this.meals = meals;
        this.allergens = allergens;
    }

    public Diet(Type type, List<String> allergens) {
        super(DietId.randomId(DietId.class));
        this.type = type;
        this.allergens = allergens;
    }
}
