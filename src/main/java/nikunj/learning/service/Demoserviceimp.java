package nikunj.learning.service;


import org.springframework.stereotype.Service;

@Service
public class Demoserviceimp implements DemoService{
    @Override
    public String gethellomessage(String user) {
        return "helllo "+user;
    }

    @Override
    public String getwelcomemessage() {
        return "Welcome to this spring app";
    }
}
