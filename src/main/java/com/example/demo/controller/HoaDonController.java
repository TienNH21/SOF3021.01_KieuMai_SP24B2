package com.example.demo.controller;

import com.example.demo.entities.HoaDon;
import com.example.demo.entities.MauSac;
import com.example.demo.entities.custom.ThongTinHoaDon;
import com.example.demo.repositories.HoaDonRepository;
import com.example.demo.repositories.MauSacRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("hoa-don")
public class HoaDonController {
    @Autowired
    private HoaDonRepository hdRepo;

    @GetMapping("index")
    public String index(Model model) {
        List<ThongTinHoaDon> ds = this.hdRepo.loadAll();
        model.addAttribute("ds", ds);
        return "hoa_don/index";
    }
}
