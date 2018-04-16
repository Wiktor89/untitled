package pattern.structural.adapter;


public class JavaDatabaseAdapter extends JavaApplication implements Database {

    @Override
    public void insert () {
        createObject ();
    }

    @Override
    public void update () {
        updateObject ();
    }

    @Override
    public void select () {
        selectObject ();
    }

    @Override
    public void delete () {
        deleteObject ();
    }
}
