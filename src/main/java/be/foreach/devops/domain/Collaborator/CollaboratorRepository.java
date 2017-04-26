package be.foreach.devops.domain.Collaborator;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollaboratorRepository extends MongoRepository<Collaborator, String> {

    List<Collaborator> findByFirstName(String firstName);

    @Query("{ 'firstName' : ?0 }")
    List<Collaborator> findByThePersonsFirstName(String firstName);

    @Query(value = "{ 'firstName' : ?0 }", fields = "{ 'firstName' : 1, 'lastName' : 1}")
    List<Collaborator> findByThePersonsFirstNameFiltered(String firstName);
}
