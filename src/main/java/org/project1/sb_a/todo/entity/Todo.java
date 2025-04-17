package org.project1.sb_a.todo.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "tbl_todo") //table 이름은 필요시 수정
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 300)// length는 임의로 설정한것이니 필요시 수정
    private String title;

    @Column(nullable = false, length = 100)// length는 임의로 설정한것이니 필요시 수정
    private String writer;

    @CreatedDate
    @Column(name = "regdate", updatable = false)
    private LocalDateTime regDate;

    @LastModifiedDate
    @Column(name = "moddate")
    private LocalDateTime modDate;
}