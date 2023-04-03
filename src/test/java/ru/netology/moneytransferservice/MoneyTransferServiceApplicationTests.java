package ru.netology.moneytransferservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import ru.netology.moneytransferservice.model.Amount;
import ru.netology.moneytransferservice.model.ConfirmOperation;
import ru.netology.moneytransferservice.model.TransferRequest;

import java.math.BigDecimal;

@Testcontainers
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MoneyTransferServiceApplicationTests {
//    @Autowired
//    private TestRestTemplate restTemplate;
//
//    private final String HOST = "http://localhost:";
//    private final int PORT = 5500;
//
//    @Container
//    private GenericContainer<?> transferApp = new GenericContainer<>("transferapp")
//            .withExposedPorts(PORT);
//
//    @Test
//    void transferResponseTest() {
//        TransferRequest transferRequest = new TransferRequest(
//                1111111111111111L,
//                "1234",
//                123,
//                2222222222222222L,
//                new Amount(new BigDecimal("10000"))
//        );
//
//        ResponseEntity<String> entity = restTemplate.postForEntity(
//                HOST + transferApp.getMappedPort(PORT) + "/transfer", transferRequest, String.class
//        );
//
//        String expected = "Присвоен id 1. Ожидается подтверждение";
//        String actual = entity.getBody();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    void confirmOperationTest() {
//        ConfirmOperation confirmOperation = new ConfirmOperation(
//                "1",
//                "0000"
//        );
//
//        ResponseEntity<String> entity = restTemplate.postForEntity(
//                HOST + transferApp.getMappedPort(PORT) + "/confirmOperation", confirmOperation, String.class
//        );
//
//        String expected = "Операция с id 1 подтверждена";
//        String actual = entity.getBody();
//
//        Assertions.assertEquals(expected, actual);
//    }
}
