package com.example.dday.controller;

import com.example.dday.domain.vo.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Member;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/")
@Slf4j
public class MainController {
    @GetMapping("/")
    public String main(Model model, HttpSession session){
        MemberVO memberVO = new MemberVO();
        memberVO.setMemberNumber(0L);
        session.setAttribute("member", Optional.ofNullable((MemberVO)session.getAttribute("member")).orElse(memberVO));
        return "/index";
   }
}





















