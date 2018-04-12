package pattern.abstract_factory.nrd_team;

import pattern.abstract_factory.product.AbstractFactory;
import pattern.abstract_factory.product.Developer;
import pattern.abstract_factory.product.ProjectManager;
import pattern.abstract_factory.product.Test;


public class NrdFactoryImpl implements AbstractFactory {
    @Override
    public Developer createDeveloper () {
        return new JavaNrdDeveloperImpl ();
    }

    @Override
    public Test createTest () {
        return new TestNrdImpl ();
    }

    @Override
    public ProjectManager createProjectManager () {
        return new ProjectManagerNrdImpl ();
    }
}
