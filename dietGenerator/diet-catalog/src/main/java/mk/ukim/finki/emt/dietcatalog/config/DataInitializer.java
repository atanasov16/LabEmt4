package mk.ukim.finki.emt.dietcatalog.config;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;

import mk.ukim.finki.emt.dietcatalog.domain.models.Diet;
import mk.ukim.finki.emt.dietcatalog.domain.repository.DietRepository;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@AllArgsConstructor
public class DataInitializer {

    private final DietRepository dietRepository;

    @PostConstruct
    public void initData() {

    }
}
