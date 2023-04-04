package dev.aml.contentcalendar.repository;

import dev.aml.contentcalendar.model.Content;
import org.springframework.data.repository.ListCrudRepository;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {
}
