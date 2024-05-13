package mk.ukim.finki.emt.dietcatalog.domain.repository;

import mk.ukim.finki.emt.dietcatalog.domain.models.Meal;
import mk.ukim.finki.emt.dietcatalog.domain.models.MealId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepository extends JpaRepository<Meal, MealId> {
}
