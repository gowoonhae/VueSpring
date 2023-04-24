package com.cloudmall.backend.board;

import java.time.LocalDate;

import lombok.Data;

@Data
public class BoardResponse {
    private Long id;
    private String title;
    private String writer;
    private String content;
    private String image_src;
    private LocalDate created_date;
    private LocalDate updated_date;

    // Entity 를 DTO 로 변환
    public BoardResponse(BoardEntity entity){
        id = entity.getId();
        title = entity.getTitle();
        writer = entity.getWriter();
        content = entity.getContent();
        image_src = entity.getImage_src();
        created_date = entity.getCreated_date();
        updated_date = entity.getUpdated_date();
    }
}