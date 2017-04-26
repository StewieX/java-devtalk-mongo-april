package be.foreach.devops;

import be.foreach.devops.domain.Collaborator.Collaborator;
import be.foreach.devops.domain.Collaborator.CollaboratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private CollaboratorRepository collaboratorRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        collaboratorRepository.deleteAll();

        Collaborator collaborator = new Collaborator();
        collaboratorRepository.save(collaborator);
    }
}
