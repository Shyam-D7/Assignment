package com.data.messages.controller;

import com.data.messages.Message;
import com.data.messages.exception.MessageNotFoundException;
import com.data.messages.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/message")
public class MessageController {

    @Autowired
    MessageRepository messageRepository;

    @GetMapping(value = "/read")
    public @ResponseBody Iterable<Message> getAll() {
        return messageRepository.findAll();
    }

    @PostMapping(value = "/create")
    public @ResponseBody String store(@RequestBody final Message message) {
        messageRepository.save(message);
        return "saved";
    }
    @PutMapping("/update/{id}")
    public @ResponseBody String updateMessage(@RequestBody Message updatedMessage, @PathVariable Integer id){
        Optional<Message> messageOptional = messageRepository.findById(id);
        if (!messageOptional.isPresent()) {
            throw new MessageNotFoundException("id-" + id);
//            return "message not found with the given id: "+id;
        }
        else{
            updatedMessage.setId(id);
            messageRepository.save(updatedMessage);
            return "update the message with id "+id;
        }
    }
    @DeleteMapping("/delete/{id}")
    public @ResponseBody String deleteMessage(@PathVariable int id){
        Optional<Message> messageOptional = messageRepository.findById(id);
        if(messageOptional.isPresent()){
            messageRepository.deleteById(id);
        }
        throw new MessageNotFoundException("id-" + id);
    }

}
