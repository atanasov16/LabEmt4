package mk.ukim.finki.emt.sharedkernel.domain.events.diets;

import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.config.TopicHolder;
import mk.ukim.finki.emt.sharedkernel.domain.events.DomainEvent;

import java.lang.reflect.Type;
import java.util.List;
@Getter
public class DietEdited extends DomainEvent {
    private List<String> allergens;
    private Type type;
    private int quantity;

    public DietEdited(String topic) {
        super(TopicHolder.TOPIC_ORDER_ITEM_EDITED);
    }

    public DietEdited(Type type, List<String> allergens) {
        super(TopicHolder.TOPIC_ORDER_ITEM_EDITED);
        this.allergens = allergens;
        this.type = type;
    }
}
