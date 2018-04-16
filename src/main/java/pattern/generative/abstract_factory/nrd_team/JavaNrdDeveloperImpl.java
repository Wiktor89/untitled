package pattern.generative.abstract_factory.nrd_team;


import pattern.generative.abstract_factory.product.Developer;

public class JavaNrdDeveloperImpl implements Developer {
    @Override
    public void writeCode () {
        System.out.println ("JavaNrdDeveloperImpl.writeCode");
    }
}
