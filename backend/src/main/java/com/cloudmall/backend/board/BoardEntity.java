package com.cloudmall.backend.board;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private String writer;

    @Column
    private String content;

    @Column
    private String image_src;

    @Column
    private LocalDate created_date;

    @Column
    private LocalDate updated_date;

    @Builder
    public BoardEntity(String title, String writer, String content, String image_src){
        this.title = title;
        this.writer = writer;
        this.content = content;
        this.image_src = image_src;
    }
    
}
