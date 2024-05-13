package mk.ukim.finki.emt.dietcatalog.services.impl;

import mk.ukim.finki.emt.dietcatalog.domain.models.Meal;
import mk.ukim.finki.emt.dietcatalog.domain.models.MealId;
import mk.ukim.finki.emt.dietcatalog.domain.repository.MealRepository;
import mk.ukim.finki.emt.dietcatalog.services.MealService;
import mk.ukim.finki.emt.sharedkernel.domain.nutrition.Nutrition;

import java.util.List;
import java.util.Optional;

public class MealServiceImpl implements MealService {

    private final MealRepository mealRepository;

    public MealServiceImpl(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    @Override
    public List<Meal> findAll() {
        return mealRepository.findAll();
    }

    @Override
    public Optional<Meal> findById(MealId mealId) {
        return mealRepository.findById(mealId);
    }

    @Override
    public void addMeal(Nutrition nutrition, List<String> allergens) {
        mealRepository.saveAndFlush(new Meal(nutrition, allergens));
    }
}
