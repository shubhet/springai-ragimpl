package com.ragimpl.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ragimpl.service.ChatService;

@RestController
@RequestMapping("/ai")
public class ChatController {

    private ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }


    @PostMapping("/chat")
    public ResponseEntity<String> getResponse(@RequestParam("q") String userQuery) {
        return ResponseEntity.ok(chatService.getResponse(userQuery));
    }


}
