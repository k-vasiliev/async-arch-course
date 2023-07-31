package ru.vasilev.asyncarccourse.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import ru.vasilev.asyncarccourse.dao.TestRepository;
import ru.vasilev.asyncarccourse.entity.TestEntity;

@Service
public class TestService {

  private final TestRepository testRepository;
  private final KafkaTemplate<String, String> kafkaTemplate;

  public TestService(TestRepository testRepository, KafkaTemplate<String, String> kafkaTemplate) {
    this.testRepository = testRepository;
    this.kafkaTemplate = kafkaTemplate;
  }

  public Iterable<TestEntity> findAllTest() {
    kafkaTemplate.send("testtopic", "Hello, Kafka!");
    return testRepository.findAll();
  }
}
