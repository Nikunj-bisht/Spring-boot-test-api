package nikunj.learning.controller;

import nikunj.learning.service.Todoitemserviceclass;
import nikunj.learning.todo.Todoclass;
import nikunj.learning.todo.Tododatastorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class Todocontroller {

    private Todoitemserviceclass todoitemserviceclass;

    @ModelAttribute
    public Tododatastorage tododatastorage(){   // in order to access  this within jsp file we need to make the getter as class name with lower case first letter

        return todoitemserviceclass.getdata();

    }

    @Autowired
    public  Todocontroller(Todoitemserviceclass todoitemserviceclass){  // contructor injection

        this.todoitemserviceclass=todoitemserviceclass;

    }

    @GetMapping("additem")

    public String requestform(Model model){

        Todoclass todoclass= new Todoclass("","", LocalDate.now());
        model.addAttribute("newitem",todoclass);


        return "additem";

    }


    @PostMapping("additem")
    public String processitem(@ModelAttribute("newitem") Todoclass todoclass){

        todoitemserviceclass.addvalue(todoclass);

        return "redirect:/"+"items";    // when the form will be submit
    }

    // routers

    @GetMapping("items")
    public String items(){

        return "items";
    }

    @GetMapping("deleteitem")
    public String deletethisitem(@RequestParam int id){

        todoitemserviceclass.removeitem(id);

        return "redirect:/"+"items";

    }

    @GetMapping("viewitem")
    public String viewitem(@RequestParam int id,Model model){

        Todoclass todoclass =  todoitemserviceclass.getitem(id);
        model.addAttribute("showitem",todoclass);   // will be injected to jsp file

           

        return "detailsitem"; // view will be shown
    }

}
