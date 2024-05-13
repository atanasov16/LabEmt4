package mk.ukim.finki.emt.dietcatalog.services;

import mk.ukim.finki.emt.dietcatalog.domain.models.Meal;
import mk.ukim.finki.emt.dietcatalog.domain.models.MealId;
import mk.ukim.finki.emt.sharedkernel.domain.nutrition.Nutrition;

import java.util.List;
import java.util.Optional;

public interface MealService {
    List<Meal> findAll();
    Optional<Meal> findById(MealId mealId);
    void addMeal(Nutrition nutrition, List<String> allergens);
}
