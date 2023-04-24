package com.cloudmall.backend.board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {
    
    private final BoardRepository boardRepository;

    public List<BoardResponse> itemList(){
        List<BoardEntity> entity = boardRepository.findAll();
        List<BoardResponse> response = new ArrayList<>();

        for(BoardEntity i: entity){
            response.add(new BoardResponse(i));
        }

        return response;
    }

}
