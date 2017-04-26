package be.foreach.devops.config;

import be.foreach.devops.domain.Collaborator.CollaboratorRepository;
import com.mongodb.Mongo;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackageClasses = CollaboratorRepository.class)
public class ApplicationConfig extends AbstractMongoConfiguration {
    @Override
    protected String getDatabaseName() {
        return "devops";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new Mongo();
    }

    @Override
    protected String getMappingBasePackage() {
        return "com.oreilly.springdata.mongodb";
    }
}
