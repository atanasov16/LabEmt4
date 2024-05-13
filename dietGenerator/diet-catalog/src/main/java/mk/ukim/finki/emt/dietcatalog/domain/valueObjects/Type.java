package mk.ukim.finki.emt.dietcatalog.domain.valueObjects;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Value;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueObject;

@Embeddable
@Getter
public class Type implements ValueObject {
    private final String type;
    protected Type(){
        this.type = "";
    }
}
