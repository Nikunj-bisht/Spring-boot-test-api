package nikunj.learning.service;

import nikunj.learning.todo.Todoclass;
import nikunj.learning.todo.Tododatastorage;
import org.springframework.stereotype.Service;

@Service
public class Todoitemserviceclass implements Todoitemserviceinterface {

private final Tododatastorage tododatastorage = new Tododatastorage();


    @Override
    public void addvalue(Todoclass todoclass) {

        tododatastorage.additem(todoclass);

    }

    @Override
    public void removeitem(int id_no) {

        tododatastorage.removeitem(id_no);

    }

    @Override
    public Todoclass getitem(int id_no) {
        return tododatastorage.getitem(id_no);
    }

    @Override
    public Tododatastorage getdata() {
        return tododatastorage;
    }
}
