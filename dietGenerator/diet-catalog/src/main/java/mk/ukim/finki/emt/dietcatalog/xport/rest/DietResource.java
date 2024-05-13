package mk.ukim.finki.emt.dietcatalog.xport.rest;

import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.dietcatalog.domain.models.Diet;
import mk.ukim.finki.emt.dietcatalog.services.DietService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/diet")
@AllArgsConstructor
public class DietResource {
    private final DietService dietService;

    @GetMapping
    public List<Diet> getAll(){
        return dietService.findAll();
    }
}
