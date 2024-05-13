package mk.ukim.finki.emt.usermanagement.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
public class PremiumUser extends User{
    public String dateFrom;
    public String dateTo;

    public PremiumUser(String dateFrom, String dateTo) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    public PremiumUser() {
        this.dateFrom="";
        this.dateTo="";
    }
}
