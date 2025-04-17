package org.project1.sb_a.todo.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TodoDTO {
    private Long id;               // 엔티티의 PK
    private String title;          // 필수: 최대 300자
    private String writer;         // 필수: 최대 100자
    private LocalDateTime regDate; // 생성 시각
    private LocalDateTime modDate; // 수정 시각
}