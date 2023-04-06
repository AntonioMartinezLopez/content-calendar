package dev.aml.contentcalendar.repository;

import dev.aml.contentcalendar.model.Content;
import dev.aml.contentcalendar.model.Status;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {

    // "query derivation"
    List<Content> findAllByTitleContains(String keyword);

    // "custom query"
    @Query("""
            SELECT * FROM Content
            where status = :status
            """)
    List<Content> listByStatus(@Param("status") Status status);
}
