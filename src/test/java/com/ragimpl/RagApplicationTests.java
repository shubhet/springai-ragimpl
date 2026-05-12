package com.ragimpl;

import com.ragimpl.service.ChatService;
import com.ragimpl.util.DummyData;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RagApplicationTests {

    @Autowired
    private ChatService chatService;

    @Test
    void testDataLoader() {

        var dummyData = DummyData.getData();
        chatService.saveData(dummyData);

        System.out.println("Dummy data loaded: " + dummyData.size());
        dummyData.forEach(System.out::println);
    }

}
