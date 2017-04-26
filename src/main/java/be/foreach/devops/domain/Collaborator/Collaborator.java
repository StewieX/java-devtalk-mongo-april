package be.foreach.devops.domain.Collaborator;

import lombok.*;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Collaborator {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private int number;
}
