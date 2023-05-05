package com.cloudmall.backend.board;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {
    
    private final BoardRepository boardRepository;

    public List<BoardDTO> itemList(){
        List<BoardEntity> entity = boardRepository.findAll();
        List<BoardDTO> dto = new ArrayList<>();

        for(BoardEntity i: entity){
            dto.add(new BoardDTO(i));
        }

        return dto;
    }

    public BoardDTO itemDetail(Integer id){
        if(id==0){
            return new BoardDTO();
        }else{
            BoardEntity entity = boardRepository.findById(id).get();
            BoardDTO dto = new BoardDTO(entity);
            
            return dto;
        }
    }

    public String itemCreate(BoardDTO dto){
        if(dto.getId() == null){
            BoardEntity entity = BoardEntity.builder()
            .title(dto.getTitle())
            .content(dto.getContent())
            .image_src(dto.getImage_src())
            .price(dto.getPrice())
            .created_date(LocalDate.now())
            .build();
            boardRepository.save(entity);
            return entity.getId().toString();
        } else{
            BoardEntity entity = BoardEntity.builder()
            .id(dto.getId())
            .title(dto.getTitle())
            .content(dto.getContent())
            .image_src(dto.getImage_src())
            .price(dto.getPrice())
            .updated_date(LocalDate.now())
            .build();
            boardRepository.save(entity);
            return entity.getId().toString();
        }
    }

    public void itemDelete(Integer id){
        BoardEntity entity = boardRepository.findById(id).get();
        boardRepository.delete(entity);
    }
}
