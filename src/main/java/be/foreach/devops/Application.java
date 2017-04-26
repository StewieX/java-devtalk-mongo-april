package be.foreach.devops;

import be.foreach.devops.domain.Collaborator.Collaborator;
import be.foreach.devops.domain.Collaborator.CollaboratorRepository;
import be.foreach.devops.domain.Project.Project;
import be.foreach.devops.domain.Project.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private CollaboratorRepository collaboratorRepository;
    @Autowired
    private ProjectRepository projectRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        collaboratorRepository.deleteAll();

        List<Collaborator> collaborators = Arrays.asList(
                Collaborator.builder()
                    .firstName("Seger")
                    .lastName("de Kort")
                    .number(1)
                    .build(),
                Collaborator.builder()
                    .firstName("Steven")
                    .lastName("Gentens")
                    .number(1)
                    .build()
                );

        Project project = Project.builder()
                .organisation("ForEach")
                .title("Intiligent Support Platform")
                .collaborators(collaborators)
                .build();
        projectRepository.save(project);
    }
}
