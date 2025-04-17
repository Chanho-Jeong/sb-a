package org.project1.sb_a.todo.repository;
import org.project1.sb_a.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    // JpaRepository가 CRUD 메서드를 모두 제공합니다.
}