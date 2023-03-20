package shop.mtcoding.mybatisdto.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.mybatisdto.dto.BoardDetailOutDto2;
import shop.mtcoding.mybatisdto.dto.BoardJoinUserDto;
import shop.mtcoding.mybatisdto.dto.BoardJoinUserDto2;
import shop.mtcoding.mybatisdto.service.BoardService;

@RequiredArgsConstructor
@RestController
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/board/{id}")
    public ResponseEntity<?> detail(@PathVariable Integer id) {
        BoardDetailOutDto2 dto = boardService.게시글상세보기(id);
        return ResponseEntity.ok().body(dto);
    }

    @GetMapping("/board/v2/{id}")
    public ResponseEntity<?> detailV2(@PathVariable Integer id) {
        BoardJoinUserDto dto = boardService.게시글상세보기2(id);
        return ResponseEntity.ok().body(dto);
    }

    @GetMapping("/board/v3/{id}")
    public ResponseEntity<?> detailV3(@PathVariable Integer id) {
        BoardJoinUserDto2 dto = boardService.게시글상세보기3(id);
        return ResponseEntity.ok().body(dto);
    }
}
