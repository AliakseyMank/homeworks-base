package progect.medicalcentre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import progect.medicalcentre.model.Procedure;
import progect.medicalcentre.model.User;
import progect.medicalcentre.service.ProcedureService;
import progect.medicalcentre.service.UserService;


@Controller
public class ProcedureController {

    @Autowired
    ProcedureService procedureService;

    @Autowired
    UserService userService;

    @RequestMapping(value = "/procedures",method = RequestMethod.GET)
    public ModelAndView allProcedures(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("procedures");
        modelAndView.addObject("proceduresList",procedureService.allProcedures());
        return modelAndView;
    }

    @RequestMapping(value = "/editProcedure/{id}",method = RequestMethod.GET)
    public ModelAndView editProcPage(@PathVariable("id")int id){
        Procedure procedure = procedureService.getById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editProcedure");
        modelAndView.addObject("procedure",procedure);
        return modelAndView;
    }

    @RequestMapping(value = "/editProcedure",method = RequestMethod.GET)
    public ModelAndView editProcPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editProcedure");
        return modelAndView;
    }

    @RequestMapping(value = "/addProcedure",method = RequestMethod.GET)
    public ModelAndView addProcPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editProcedure");
        return modelAndView;
    }

    @RequestMapping(value = "/addProcedure",method = RequestMethod.POST)
    public ModelAndView addProcedure(@ModelAttribute("procedure")Procedure procedure){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/procedures");
        procedureService.add(procedure);
        return modelAndView;
    }

    @RequestMapping (value = "/deleteProcedure/{id}",method = RequestMethod.GET)
    public ModelAndView deleteProc(@PathVariable("id")int id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/procedures");
        Procedure procedure = procedureService.getById(id);
        procedureService.delete(procedure);
        return modelAndView;
    }

    /*@RequestMapping (value = "/docProc/{id}",method = RequestMethod.GET)
    public ModelAndView docProc(@PathVariable("id") int id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("docProc");
        User user = userService.getProcedures(id);
*/



    @RequestMapping(value = "/startPage",method = RequestMethod.GET)
    public ModelAndView startPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("startPage");
        modelAndView.addObject("doctorsList",userService.roleDoctor());
        modelAndView.addObject("userList",userService.roleUser());
        return modelAndView;

    }

    @RequestMapping(value = "/editDoc/{id}",method = RequestMethod.GET)
    public ModelAndView editDocPage(@PathVariable("id")int id){
        User user = userService.getById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editDoc");
        modelAndView.addObject("newDoctor",user);
        return modelAndView;
    }

    @RequestMapping(value = "/editDoc",method = RequestMethod.GET)
    public ModelAndView editDocPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editDoc");
        return modelAndView;
    }

    @RequestMapping(value = "/addDoc", method = RequestMethod.GET)
    public ModelAndView addPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editDoc");
        return modelAndView;
    }

    @RequestMapping(value = "/addDoc",method = RequestMethod.POST)
    public ModelAndView addDoc(@ModelAttribute("doctor")User doctor){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/startPage");
        userService.add(doctor);
        return modelAndView;
    }

}
