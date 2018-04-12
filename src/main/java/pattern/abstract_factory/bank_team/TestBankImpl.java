package pattern.abstract_factory.bank_team;


import pattern.abstract_factory.product.Test;

public class TestBankImpl implements Test {
    @Override
    public void test () {
        System.out.println ("TestBankImpl.test");
    }
}
