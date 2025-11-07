package com.ll.chatApp.domain.chat.chatMessage.service;


import com.ll.chatApp.domain.chat.chatMessage.entity.ChatMessage;
import com.ll.chatApp.domain.chatroom.entity.ChatRoom;
import com.ll.chatApp.domain.chatroom.repository.ChatRoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatMessageService {
    private final ChatRoomRepository chatRoomRepository;

    public void create(ChatRoom chatRoom, String writerName, String content){
        ChatMessage chatMessage = ChatMessage.builder()
                .chatroom(chatRoom)
                .writerName(writerName)
                .content(content)
                .build();

        chatRoomRepository.save(chatRoom);
    }

}
