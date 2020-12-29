package nikunj.learning.todo;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Tododatastorage {

private static int idvalue =1;
private final List<Todoclass> items = new ArrayList<Todoclass>();

  public Tododatastorage(){

      additem(new Todoclass("First","Spring api", LocalDate.now()));

      additem(new Todoclass("Second","Spring api", LocalDate.now()));

      additem(new Todoclass("Third","Spring api", LocalDate.now()));
      additem(new Todoclass("Fourth","Spring api", LocalDate.now()));
      additem(new Todoclass("Fifth","Spring api", LocalDate.now()));


  }

  public List<Todoclass> getItems(){

      return  Collections.unmodifiableList(items);

  }

  public void additem(Todoclass todoclass){
      todoclass.setId(idvalue);
      items.add(todoclass);
      idvalue++;

  }

  public void removeitem(int idno){

      ListIterator<Todoclass> listIterator = items.listIterator();

      while (listIterator.hasNext()){

          Todoclass todo = listIterator.next();
          if(todo.getId() == idno){
              items.remove(todo);break;
          }

      }

  }

  public Todoclass getitem(int id){

      for(Todoclass todoclass : items){

          if(todoclass.getId() == id){

              return todoclass;
          }


      }
      return null;


  }




}
