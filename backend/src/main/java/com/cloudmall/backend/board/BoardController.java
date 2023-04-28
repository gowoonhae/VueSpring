package com.cloudmall.backend.board;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/catalog")
    public List<BoardResponse> catalog(){
        return boardService.itemList();
    }

    @GetMapping("/item/{id}")
    public BoardResponse item(@PathVariable("id") Long id){
        return boardService.itemDetail(id);
    }
}
