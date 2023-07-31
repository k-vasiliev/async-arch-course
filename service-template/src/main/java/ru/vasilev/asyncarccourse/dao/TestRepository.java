package ru.vasilev.asyncarccourse.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.vasilev.asyncarccourse.entity.TestEntity;

@Repository
public interface TestRepository extends CrudRepository<TestEntity, Integer> {
}
