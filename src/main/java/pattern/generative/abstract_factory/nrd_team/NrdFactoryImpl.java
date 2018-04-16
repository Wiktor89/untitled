package pattern.generative.abstract_factory.nrd_team;

import pattern.generative.abstract_factory.product.AbstractFactory;
import pattern.generative.abstract_factory.product.Developer;
import pattern.generative.abstract_factory.product.ProjectManager;
import pattern.generative.abstract_factory.product.Test;


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
