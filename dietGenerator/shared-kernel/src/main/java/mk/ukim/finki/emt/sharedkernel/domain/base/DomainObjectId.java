package mk.ukim.finki.emt.sharedkernel.domain.base;

import jakarta.persistence.Embeddable;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

import java.io.Serializable;
import java.util.Objects;

@MappedSuperclass
@Embeddable
@Getter
public class DomainObjectId implements Serializable {
    private String id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DomainObjectId that = (DomainObjectId) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
