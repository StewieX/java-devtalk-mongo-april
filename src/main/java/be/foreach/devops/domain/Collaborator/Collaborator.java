package be.foreach.devops.domain.Collaborator;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Builder
@ToString
public class Collaborator {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private int number;
}
