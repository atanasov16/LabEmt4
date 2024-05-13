package mk.ukim.finki.emt.dietcatalog.domain.models;

import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

public class MealId extends DomainObjectId {
    public static Object randomId(Class<MealId> mealIdClass) {
        return mealIdClass.hashCode();
    }
}
