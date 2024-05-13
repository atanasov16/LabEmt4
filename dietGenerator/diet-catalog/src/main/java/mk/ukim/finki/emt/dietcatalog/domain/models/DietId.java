package mk.ukim.finki.emt.dietcatalog.domain.models;

import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

public class DietId extends DomainObjectId {
    public static Object randomId(Class<DietId> dietIdClass) {
        return dietIdClass.hashCode();
    }
}
