package mk.ukim.finki.emt.usermanagement.domain.model;

import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

public class UserId extends DomainObjectId {
    public static Object randomId(Class<UserId> userIdClass) {
        return userIdClass.hashCode();
    }
}
