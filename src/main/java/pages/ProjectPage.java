package pages;

import dict.Elements;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ProjectPage {

    private final String PROJECT_NAME_FIELD = "#project-name";
    private final String PROJECT_CODE_FIELD = "#project-code";

    public ProjectPage isPageOpened() {
        $(byText(Elements.CREATE_NEW_PROJECT)).shouldBe(visible);
        return this;
    }

    public ProjectPage fillInProjectForm(String projectName, String projectCode) {
        $(PROJECT_NAME_FIELD).setValue(projectName);
        $(PROJECT_CODE_FIELD).setValue(projectCode);
        return this;
    }

    public ProjectsPage clickCreateProjectButton() {
        $(byText(Elements.CREATE_NEW_PROJECT)).click();
        return new ProjectsPage();
    }
}
