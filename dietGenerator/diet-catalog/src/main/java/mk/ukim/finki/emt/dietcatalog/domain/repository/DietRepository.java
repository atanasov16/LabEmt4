package mk.ukim.finki.emt.dietcatalog.domain.repository;

import mk.ukim.finki.emt.dietcatalog.domain.models.Diet;
import mk.ukim.finki.emt.dietcatalog.domain.models.DietId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DietRepository extends JpaRepository<Diet, DietId> {
}
