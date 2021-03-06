package be.foreach.devops.domain.Project;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends MongoRepository<Project, String> {
    Project findOneByTitle(String title);
}
