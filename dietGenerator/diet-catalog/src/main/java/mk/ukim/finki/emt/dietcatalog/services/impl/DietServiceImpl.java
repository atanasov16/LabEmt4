package mk.ukim.finki.emt.dietcatalog.services.impl;

import mk.ukim.finki.emt.dietcatalog.domain.models.Diet;
import mk.ukim.finki.emt.dietcatalog.domain.models.DietId;
import mk.ukim.finki.emt.dietcatalog.domain.models.Meal;
import mk.ukim.finki.emt.dietcatalog.domain.models.MealId;
import mk.ukim.finki.emt.dietcatalog.domain.repository.DietRepository;
import mk.ukim.finki.emt.dietcatalog.domain.repository.MealRepository;
import mk.ukim.finki.emt.dietcatalog.services.DietService;
import mk.ukim.finki.emt.sharedkernel.domain.nutrition.Nutrition;

import java.util.List;
import java.util.Optional;

public class DietServiceImpl implements DietService {
    private final DietRepository dietRepository;
    private final MealRepository mealRepository;

    public DietServiceImpl(DietRepository dietRepository, MealRepository mealRepository) {
        this.dietRepository = dietRepository;
        this.mealRepository = mealRepository;
    }

    @Override
    public List<Diet> findAll() {
        return dietRepository.findAll();
    }

    @Override
    public Optional<Diet> findById(DietId dietId) {
        return dietRepository.findById(dietId);
    }

    @Override
    public void addMealToDiet(DietId dietId, Nutrition nutrition, List<String> allergens) {
        Meal meal = new Meal(nutrition, allergens);
        meal.addToDiet(dietRepository.findById(dietId).orElseThrow(RuntimeException::new));
        dietRepository.findById(dietId).ifPresent(l -> l.addMeal(meal));
        mealRepository.saveAndFlush(meal);
    }
}
