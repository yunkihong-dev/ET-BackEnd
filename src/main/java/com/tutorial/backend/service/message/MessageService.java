package com.tutorial.backend.service.message;

import com.tutorial.backend.entity.Message;
import com.tutorial.backend.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageService {
    private final MessageRepository messageRepository;

    public List<Message> getMessagesByChatRoomId(Long chatRoomId) {
        return messageRepository.findByChatRoomId(chatRoomId);
    }

    public Message saveMessage(Message message) {
        return messageRepository.save(message);
    }
}
