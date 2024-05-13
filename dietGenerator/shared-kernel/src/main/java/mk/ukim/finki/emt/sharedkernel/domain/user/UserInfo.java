package mk.ukim.finki.emt.sharedkernel.domain.user;

import jakarta.persistence.Embeddable;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueObject;
@Embeddable
public class UserInfo implements ValueObject {
    private String name;
    private String email;
    private String phoneNumber;
    private Integer heightInCm;
    private Integer weightInCm;
    private Integer bmr;

    public UserInfo() {
        name="";
        email="";
        phoneNumber="";
        heightInCm=0;
        weightInCm=0;
        bmr=0;
    }

    public UserInfo(String name, String email, String phoneNumber, Integer heightInCm, Integer weightInCm, Integer bmr) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.heightInCm = heightInCm;
        this.weightInCm = weightInCm;
        this.bmr = bmr;
    }

    public UserInfo(UserInfo userInfo) {
        this.name = userInfo.name;
        this.phoneNumber = userInfo.phoneNumber;
        this.email = userInfo.email;
        this.heightInCm = userInfo.heightInCm;
        this.weightInCm = userInfo.weightInCm;
        this.bmr = userInfo.bmr;
    }
}
