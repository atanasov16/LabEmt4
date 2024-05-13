package mk.ukim.finki.emt.dietcatalog.xport.events;

import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.dietcatalog.domain.models.MealId;
import mk.ukim.finki.emt.dietcatalog.services.DietService;
import mk.ukim.finki.emt.sharedkernel.domain.config.TopicHolder;
import mk.ukim.finki.emt.sharedkernel.domain.events.DomainEvent;
import mk.ukim.finki.emt.sharedkernel.domain.events.diets.DietCreated;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DietCreating {

    private final DietService dietService;

//    @KafkaListener(topics= TopicHolder.DIET_CREATED, groupId = "dietCatalog")
//    public void consumeOrderItemCreatedEvent(String jsonMessage) {
//        try {
//            DietCreated event = DomainEvent.fromJson(jsonMessage,OrderItemCreated.class);
//            dietService.addMealToDiet(MealId.of(event.getType()), event.getQuantity());
//        } catch (Exception e){
//
//        }
//
//    }
//
//    @KafkaListener(topics= TopicHolder.TOPIC_ORDER_ITEM_REMOVED, groupId = "productCatalog")
//    public void consumeOrderItemRemovedEvent(String jsonMessage) {
//        try {
//            OrderItemRemoved event = DomainEvent.fromJson(jsonMessage,OrderItemRemoved.class);
//            productService.orderItemRemoved(ProductId.of(event.getProductId()), event.getQuantity());
//        } catch (Exception e){
//
//        }
//
//    }
}
