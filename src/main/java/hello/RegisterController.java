package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/register")
public class RegisterController {

    @RequestMapping("/step1")
    public String handleStep1() {
        return "register/step1";
    }
    @RequestMapping(value ="/step2", method = RequestMethod.POST)
    // post로 한정함 Request method 'GET' not supported
    public String handleStep2(
        @RequestParam(value="agree", defaultValue="false") Boolean agree
    ) {
        //HttpServletRequest .getParameter("agree");
        if (!agree) {
            return "register/step1";
        }
        return "register/step2";
    }
    @RequestMapping(value ="/step2", method = RequestMethod.GET)
    public String handleStep2Get() {
        return "register/step1";
    }

}
