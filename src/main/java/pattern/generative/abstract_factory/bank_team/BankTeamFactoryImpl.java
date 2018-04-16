package pattern.generative.abstract_factory.bank_team;

import pattern.generative.abstract_factory.product.AbstractFactory;
import pattern.generative.abstract_factory.product.Developer;
import pattern.generative.abstract_factory.product.ProjectManager;
import pattern.generative.abstract_factory.product.Test;


public class BankTeamFactoryImpl implements AbstractFactory {
    @Override
    public Developer createDeveloper () {
        return new JavaBankDeveloperImpl ();
    }

    @Override
    public Test createTest () {
        return new TestBankImpl ();
    }

    @Override
    public ProjectManager createProjectManager () {
        return new ProjectManagerBankImpl ();
    }
}
