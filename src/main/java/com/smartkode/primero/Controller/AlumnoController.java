package com.smartkode.primero.Controller;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.slf4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.smartkode.primero.Service.AlumnoService;
import com.smartkode.primero.entidad.Alumno;

@Controller
public class AlumnoController {
	//private static final Logger logger = LoggerFactory.getLogger(Alumno.class);
    
    AlumnoService se	;
    

    @RequestMapping(value = "/add")
    //@RequestParam
    public String Agregaralumnos(Model model1){           
            model1.addAttribute("alu", "VICTOR");
            return "crear";

    }
}
