package usst.cqk.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import usst.cqk.hotel.model.Administor;
import usst.cqk.hotel.model.repository.AdministorRepository;

@Controller
@RequestMapping(path = "/all")
public class AllController {
    @Autowired
    private AdministorRepository administorRepository;

    @PostMapping(path = "/registerAdministorForm")
    public @ResponseBody
    String registerAdministorController(@RequestParam String account,
                                            @RequestParam String password,
                                            @RequestParam String username,
                                            @RequestParam String identification){
        for (Administor administor:administorRepository.findAll()){
            if (administor.getAdministorAccount().equals(account)){
                return "{\"registerMessage\":\"exist account!\"}";
            }
        }
        Administor newAdministor=new Administor();
        newAdministor.setAdministorAccount(account);
        newAdministor.setAdministorPassword(password);
        newAdministor.setUsername(username);
        newAdministor.setPersonalIdentification(identification);
        newAdministor.setAdministorLevel("normal");
        administorRepository.save(newAdministor);
        return "{\"registerMessage\":\"successfully!\"}";
    }

    @PostMapping(path = "/loginForm")
    public @ResponseBody String loginConfirmController(@RequestParam String account,
                                                       @RequestParam String password
                                                       ){
        Administor foundAdminitor=
                administorRepository.findAdministorByAdministorAccount(account);
        if (foundAdminitor==null){
            return "{\"loginMessage\":\"no this account!\"}";
        }else {
            if (foundAdminitor.getAdministorPassword().equals(password)) {
                if (foundAdminitor.getAdministorLevel().equals("normal")){
                    return foundAdminitor+
                            "{\"loginMessage\":\"login successfully!\"}";
                }else {
                    return foundAdminitor+
                            "{\"loginMessage\":\"second login!\"}";
                }
            }else {
                return "{\"loginMessage\":\"wrong password!\"}";
            }
        }
    }

    @PostMapping(path = "/secondLoginForm")
    public @ResponseBody String secondLoginController(@RequestParam String secondPassword){
        return "";
    }
}
