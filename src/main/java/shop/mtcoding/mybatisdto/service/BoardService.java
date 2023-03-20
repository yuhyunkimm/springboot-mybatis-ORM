package shop.mtcoding.mybatisdto.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.mybatisdto.dto.BoardDetailOutDto;
import shop.mtcoding.mybatisdto.dto.BoardDetailOutDto2;
import shop.mtcoding.mybatisdto.dto.BoardJoinUserDto;
import shop.mtcoding.mybatisdto.model.board.BoardRepository;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardDetailOutDto2 게시글상세보기(Integer id) {
        BoardDetailOutDto boardDetailOutDto = boardRepository.findByIdJoinUser(id);
        System.out.println("디버그 : " + boardDetailOutDto);
        BoardDetailOutDto2 boardDetailOutDto2 = new BoardDetailOutDto2(boardDetailOutDto);
        System.out.println("디버그 : " + boardDetailOutDto2);
        return boardDetailOutDto2;
    }

    public BoardJoinUserDto 게시글상세보기2(Integer id) {
        BoardJoinUserDto dto = boardRepository.findByIdJoinUser2(id);
        System.out.println("디버그 : " + dto);
        return dto;
    }

}
