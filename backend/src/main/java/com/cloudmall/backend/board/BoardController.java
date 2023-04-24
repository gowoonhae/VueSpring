package com.cloudmall.backend.board;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/catalog")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public List<BoardResponse> catalog(){
        return boardService.itemList();
    }
}
