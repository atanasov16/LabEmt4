package mk.ukim.finki.emt.sharedkernel.domain.events.diets;

import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.config.TopicHolder;
import mk.ukim.finki.emt.sharedkernel.domain.events.DomainEvent;

import java.lang.reflect.Type;
import java.util.List;
@Getter
public class DietCreated extends DomainEvent {
    private List<String> allergens;
    private Type type;
    private int quantity;

    public DietCreated(String topic) {
        super(TopicHolder.DIET_CREATED);
    }

    public DietCreated(Type type, List<String> allergens) {
        super(TopicHolder.DIET_CREATED);
        this.allergens = allergens;
        this.type = type;
    }
}
