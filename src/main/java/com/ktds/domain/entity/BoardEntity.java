package com.ktds.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "feed_test")

public class BoardEntity extends TimeEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 10, nullable = false)
    private String writer;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(length = 100, nullable = false)
    private String price;

    @Column(length = 100, nullable = false)
    private String content;

    @Builder
    public BoardEntity(Long id, String writer, String title, String content, String price) {
        this.id = id;
        this.writer = writer;
        this.price = price;
        this.title = title;
        this.content = content;
    }

}
