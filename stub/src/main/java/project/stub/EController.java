package project.stub;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import project.stub.model.User;


@RestController
public class EController {

    @PostMapping(path = "/test1")
    public String test1(@RequestBody User request) {
        return request.getSecretBase() != null ? request.getSecretBase()  : "No base";
    }

    @GetMapping(path = "/test2")
    public String hello(@RequestHeader(value = "secretBase", defaultValue = "No base") String secretBase) {
      return secretBase;
    }

} 