package be.foreach.devops.domain.Collaborator;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollaboratorRepository extends MongoRepository<Collaborator, String> {
}
