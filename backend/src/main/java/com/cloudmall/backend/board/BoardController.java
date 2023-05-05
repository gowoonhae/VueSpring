package com.cloudmall.backend.board;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/catalog")
    public List<BoardDTO> catalog(){
        return boardService.itemList();
    }

    @GetMapping("/item/detail/{id}")
    public BoardDTO itemDetail(@PathVariable("id") Integer id){
        return boardService.itemDetail(id);
    }

    @GetMapping("/item/create/{id}")
    public BoardDTO itemCreate(@PathVariable("id") Integer id){
        return boardService.itemDetail(id);
    }
    @PostMapping("/item/create")
    public String itemCreate(@RequestBody BoardDTO dto){
        return boardService.itemCreate(dto);
    }

    @PostMapping("/item/delete")
    public void itemDelete(@RequestBody Integer id){
        boardService.itemDelete(id);
    }
}