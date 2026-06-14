package tests;

import helpers.Config;
import org.testng.annotations.Test;
import utils.TestDataGenerator;

import static com.codeborne.selenide.Selenide.*;

public class ProjectTest extends BaseTest {

    @Test
    public void checkCreateProject() {
        String projectName = TestDataGenerator.generateProjectName();
        String projectCode = TestDataGenerator.generateProjectCode();
        loginPage.open()
                .login(Config.getUser(), Config.getPassword())
                .isPageOpened()
                .clickCreateNewProjectButton()
                .isPageOpened()
                .fillInProjectForm(projectName, projectCode)
                .clickCreateProjectButton();
        open("/projects");

        projectsPage.isPageOpened()
                .shouldSeeProject(projectName);

        createdProjectName = projectName;
        projectCreated = true;
    }
}
