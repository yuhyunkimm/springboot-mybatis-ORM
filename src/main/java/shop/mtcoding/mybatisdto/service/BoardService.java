package shop.mtcoding.mybatisdto.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import shop.mtcoding.mybatisdto.dto.BoardJoinUserDtoV1;
import shop.mtcoding.mybatisdto.dto.BoardJoinUserDtoV2;
import shop.mtcoding.mybatisdto.dto.BoardJoinUserDtoV3;
import shop.mtcoding.mybatisdto.dto.BoardJoinUserDtoV1Flattern;
import shop.mtcoding.mybatisdto.model.board.BoardRepository;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardJoinUserDtoV1 게시글상세보기1(Integer id) {
        BoardJoinUserDtoV1Flattern flotDto = boardRepository.findByIdJoinUserV1(id);
        System.out.println("디버그 : " + flotDto);
        BoardJoinUserDtoV1 ormDto = new BoardJoinUserDtoV1(flotDto);
        System.out.println("디버그 : " + ormDto);
        return ormDto;
    }

    public BoardJoinUserDtoV2 게시글상세보기2(Integer id) {
        BoardJoinUserDtoV2 ormDto = boardRepository.findByIdJoinUserV2(id);
        System.out.println("디버그 : " + ormDto);
        return ormDto;
    }

    public BoardJoinUserDtoV3 게시글상세보기3(Integer id) {
        BoardJoinUserDtoV3 ormDto = boardRepository.findByIdJoinUserV3(id);
        System.out.println("디버그 : " + ormDto);
        return ormDto;
    }

}
