package pattern.abstract_factory;


import pattern.abstract_factory.bank_team.BankTeamFactoryImpl;
import pattern.abstract_factory.nrd_team.NrdFactoryImpl;
import pattern.abstract_factory.product.AbstractFactory;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final Map<String, AbstractFactory> FACTORY_MAP;

    static {
        FACTORY_MAP = new HashMap<> ();
        FACTORY_MAP.put ("Команда_На_Банк", new BankTeamFactoryImpl ());
        FACTORY_MAP.put ("Команда_На_НРД", new NrdFactoryImpl ());
    }

    public static void main (String[] args) {
        AbstractFactory factory = FACTORY_MAP.get (args.length < 1 ? "Команда_На_Банк" : args[0]);
        factory.createDeveloper ().writeCode ();
        factory.createTest ().test ();
        factory.createProjectManager ().createProject ();
    }
}
