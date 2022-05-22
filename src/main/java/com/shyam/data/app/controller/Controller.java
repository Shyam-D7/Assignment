package com.shyam.data.app.controller;

import com.shyam.data.app.student.Student;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/get/student")
    public String getStudentDetail(@RequestParam String name, @RequestParam int rollNo) {
/*      In the RequestParam by default the required value is true( @RequestParam(required=true) String name)
        If the required value is true then, you cannot send any url without that RequestParam in this case (name , rollNo)
        If you don't want to make any RequestParam mandatory then you should explicitly give the required value as false them,
        that particular parameter will not be mandatory anymore, which means you can pass the url without that variable in the url
        If any variable value which is not mandatory and not sent in the url then by default that value will be null/ 0 based on the datatype*/
        return "Request Param- name: " + name + ", rollNo: " + rollNo;

    /*    By using the below format for requestParam we will always get the default values given in the RequestParam as below
      Irrespective of values given in the url.

    @GetMapping("/get/student")
    public String getStudentDetail(@RequestParam(name = "name", required = true, defaultValue = "shyam") String name,
                                   @RequestParam(name = "rolNo", required = true, defaultValue = "123") int rollNo){
        return "Request Param:" + name+":"+rollNo;
    } */
    }

    @PostMapping("/post/student")
    public Student postStudentDetail(@RequestBody Student newStudentObject){
        return newStudentObject;
    }

    @PutMapping("/put/student/{name}")
    public String updateStudentDetail(@RequestBody Student newStudentObject, @PathVariable String name){
        newStudentObject.setName(name);
//    Because of the above statement the PathVariable value is set to the name variable

        return newStudentObject + "updated with name :" + name;
    }

    @DeleteMapping("/delete/student")
    public String deleteStudentDetail(@RequestParam String name){
        return name;
    }

}


