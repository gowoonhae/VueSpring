package com.cloudmall.backend.board;

import java.time.LocalDate;

import lombok.Data;

@Data
public class BoardResponse {
    private Integer id;
    private String title;
    private String content;
    private String image_src;
    private Integer price;
    private LocalDate created_date;
    private LocalDate updated_date;

    // Entity 를 DTO 로
    public BoardResponse(BoardEntity entity){
        id = entity.getId();
        title = entity.getTitle();
        content = entity.getContent();
        image_src = entity.getImage_src();
        price = entity.getPrice();
        created_date = entity.getCreated_date();
        updated_date = entity.getUpdated_date();
    }
}