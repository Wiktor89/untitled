package pattern.abstract_factory.product;


public interface AbstractFactory {

    public Developer createDeveloper ();

    public Test createTest ();

    public ProjectManager createProjectManager ();
}
