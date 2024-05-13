package mk.ukim.finki.emt.usermanagement.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.domain.subscription.Subscription;
import mk.ukim.finki.emt.sharedkernel.domain.user.UserInfo;
import mk.ukim.finki.emt.usermanagement.domain.valueObjects.Goal;

@Entity
@Table(name = "user_info")
public class User extends AbstractEntity<UserId> {
    private UserInfo userInfo;
    @Enumerated(EnumType.STRING)
    private Goal goal;

    public User(){
        userInfo = null;
        goal = null;
    }
    public User(UserInfo userInfo, Goal goal) {
        this.userInfo = new UserInfo(userInfo);
        this.goal = goal;
    }
}
