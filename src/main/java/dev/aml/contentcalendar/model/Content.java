package dev.aml.contentcalendar.model;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

// for JDBCTemplate
/*public record Content(
        Integer id,
        @NotBlank
        String title,
        @NotBlank
        String desc,
        Status status,
        Type contentType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
) {
}*/

public record Content(
        @Id
        Integer id,
        @NotBlank
        String title,
        String description,
        Status status,
        Type contentType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
) {
}
