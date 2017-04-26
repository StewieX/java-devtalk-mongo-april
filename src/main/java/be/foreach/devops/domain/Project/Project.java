package be.foreach.devops.domain.Project;

import be.foreach.devops.domain.Collaborator.Collaborator;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Getter
@Setter
public class Project {
    @Id
    private String id;
    private String title;
    private String organisation;
    private List<Collaborator> collaborators;
}
