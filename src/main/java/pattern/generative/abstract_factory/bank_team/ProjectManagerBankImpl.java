package pattern.generative.abstract_factory.bank_team;


import pattern.generative.abstract_factory.product.ProjectManager;

public class ProjectManagerBankImpl implements ProjectManager {
    @Override
    public void createProject () {
        System.out.println ("ProjectManagerBankImpl.createProject");
    }
}
