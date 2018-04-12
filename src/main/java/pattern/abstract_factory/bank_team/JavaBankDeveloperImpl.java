package pattern.abstract_factory.bank_team;

import pattern.abstract_factory.product.Developer;

/**
 * Created by VAfonin on 12.04.2018.
 */
public class JavaBankDeveloperImpl implements Developer {
    @Override
    public void writeCode () {
        System.out.println ("JavaBankDeveloperImpl.writeCode");
    }
}
