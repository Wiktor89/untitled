package pattern.abstract_factory.nrd_team;


import pattern.abstract_factory.product.Developer;

public class JavaNrdDeveloperImpl implements Developer {
    @Override
    public void writeCode () {
        System.out.println ("JavaNrdDeveloperImpl.writeCode");
    }
}
