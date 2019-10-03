package system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import system.model.Title;
import system.service.HelloService;

@Controller
@RequestMapping(value = "/message")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "redirect:/static/html/show_message_page.html";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public @ResponseBody
    Title getMessage() {
        return helloService.getHelloModel();
    }

    @RequestMapping(value = "/set", method = RequestMethod.POST, produces="application/json")
    public ResponseEntity<String> setMessage(@RequestBody Title title) {
        if (helloService.updateModel(title)){
            return ResponseEntity.ok("{\"msg\":\"success\"}");
        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
}
