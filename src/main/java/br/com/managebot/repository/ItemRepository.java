package br.com.managebot.repository;

import br.com.managebot.model.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemRepository extends CrudRepository<Item, Long> {
    List<Item> findByItem(String name);
    List<Item> findByDescription(String description);
    List<Item> findByLocation(String location);
    List<Item> findByCategory(String category);
}
