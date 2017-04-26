package be.foreach.devops.domain.Project;

import be.foreach.devops.domain.Collaborator.Collaborator;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

@Getter
@Setter
@Builder
@ToString
public class Project {
    @Id
    private String id;
    private String title;
    private String organisation;
    @DBRef
    private List<Collaborator> collaborators;
}
