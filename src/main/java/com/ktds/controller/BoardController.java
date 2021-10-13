package com.ktds.controller;

import com.ktds.service.BoardService;
import com.ktds.dto.BoardDto;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class BoardController {
    private BoardService boardService;

    /* 게시글 목록 */
    @GetMapping("/")
    public String list(Model model) {
        List<BoardDto> boardList = boardService.getBoardlist();

        model.addAttribute("boardList", boardList);
        return "commerce/commerce.html";
    }

    @GetMapping("/post")
    public String write() {
        return "commerce/commerce_write.html";
    }

    @PostMapping("/post")
    public String write(BoardDto boardDto) {
        boardService.savePost(boardDto);

        return "redirect:/";
    }

    @RequestMapping(value = "/post/edit/{no}" , method = RequestMethod.GET)
    public String edit(@PathVariable("no") Long no, Model model) {
        BoardDto boardDTO = boardService.getPost(no);

        model.addAttribute("boardDto", boardDTO);
        return "board/update.html";
    }

    @RequestMapping(value = "/post/edit/{no}" , method = {RequestMethod.POST, RequestMethod.PUT})
    public String update(BoardDto boardDTO) {
        boardService.savePost(boardDTO);

        return "redirect:/";
    }

    @RequestMapping(value = "/post/{no}" , method = RequestMethod.GET)
    public String detail(@PathVariable("no") Long no, Model model) {
        BoardDto boardDTO = boardService.getPost(no);

        model.addAttribute("boardDto", boardDTO);
        return "commerce/board_info.html";
    }

    @RequestMapping(value = "/post/{no}" , method = {RequestMethod.POST, RequestMethod.DELETE})
    public String delete(@PathVariable("no") Long no) {
        boardService.deletePost(no);

        return "redirect:/";
    }

}
