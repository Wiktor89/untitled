package pattern.generative.abstract_factory.nrd_team;

import pattern.generative.abstract_factory.product.ProjectManager;


public class ProjectManagerNrdImpl implements ProjectManager {
    @Override
    public void createProject () {
        System.out.println ("ProjectManagerNrdImpl.createProject");
    }
}
