package mk.ukim.finki.emt.sharedkernel.domain.nutrition;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueObject;

import java.util.HashMap;
import java.util.Map;
@Embeddable
public class Nutrition implements ValueObject {
    private Integer protein;
    private Integer carbs;
    private Integer fats;
    private int calories;
    public Nutrition(){
        this.calories = 0;
        this.carbs = 0;
        this.fats = 0;
        this.protein = 0;
    }
    public Nutrition(Integer protein, Integer carbs, Integer fats){
        this.carbs = carbs;
        this.fats = fats;
        this.protein = protein;
        this.calories = protein * 4 + carbs * 4 + fats * 9;
    }
    public Nutrition(Nutrition nutrition){
        this.carbs = nutrition.carbs;
        this.fats = nutrition.fats;
        this.protein = nutrition.protein;
        this.calories = protein * 4 + carbs * 4 + fats * 9;
    }

    public int accessCalories(){
        return protein * 4 + carbs * 4 + fats * 9;
    }
}
