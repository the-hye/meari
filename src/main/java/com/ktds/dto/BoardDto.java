package com.ktds.dto;

import com.ktds.domain.entity.BoardEntity;
import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BoardDto {
    private Long id;
    private String writer;
    private String title;
    private String price;
    private String content;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public BoardEntity toEntity(){
        BoardEntity boardEntity = BoardEntity.builder()
                .id(id)
                .writer(writer)
                .title(title)
                .price(price)
                .content(content)
                .build();
        return boardEntity;
    }

    @Builder
    public BoardDto(Long id, String title, String content, String writer, String price, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.id = id;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.price = price;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }
}
