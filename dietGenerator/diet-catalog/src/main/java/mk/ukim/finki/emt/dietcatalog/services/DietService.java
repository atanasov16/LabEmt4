package mk.ukim.finki.emt.dietcatalog.services;

import mk.ukim.finki.emt.dietcatalog.domain.models.Diet;
import mk.ukim.finki.emt.dietcatalog.domain.models.DietId;
import mk.ukim.finki.emt.dietcatalog.domain.models.MealId;
import mk.ukim.finki.emt.sharedkernel.domain.nutrition.Nutrition;

import java.util.List;
import java.util.Optional;

public interface DietService {
    List<Diet> findAll();
    Optional<Diet> findById(DietId dietId);
    void addMealToDiet(DietId dietId, Nutrition nutrition, List<String> allergens);

}
