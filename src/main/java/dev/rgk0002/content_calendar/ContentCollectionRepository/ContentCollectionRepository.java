package dev.rgk0002.content_calendar.ContentCollectionRepository;

import dev.rgk0002.content_calendar.model.Content;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ContentCollectionRepository {

    List<Content> content = new ArrayList<>();

    public ContentCollectionRepository() {}

    public List<Content> findAll() {
        return content;
    }
    public void save(Content content) {
        this.content.add(content);
    }
    public Content findById(Integer id) {
        return content.stream().filter(c -> c.id().equals(id)).findFirst().orElse(null);
    }

}
