package nikunj.learning.service;

import nikunj.learning.todo.Todoclass;
import nikunj.learning.todo.Tododatastorage;

public interface Todoitemserviceinterface {

   void addvalue(Todoclass todoclass);
    void removeitem(int id_no);
    Todoclass getitem(int id_no);
    Tododatastorage getdata();



}
