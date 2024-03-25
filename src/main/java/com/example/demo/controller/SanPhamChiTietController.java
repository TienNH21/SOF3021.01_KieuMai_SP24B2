package com.example.demo.controller;

import com.example.demo.repositories.KichThuocRepository;
import com.example.demo.repositories.MauSacRepository;
import com.example.demo.repositories.SanPhamChiTietRepository;
import com.example.demo.repositories.SanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("spct")
public class SanPhamChiTietController {
    @Autowired
    private MauSacRepository msRepo;

    @Autowired
    private SanPhamRepository spRepo;

    @Autowired
    private KichThuocRepository ktRepo;

    @Autowired
    private SanPhamChiTietRepository spctRepo;

    @GetMapping("create")
    public String create(Model model)
    {
        model.addAttribute("listMS", msRepo.findAll());
        model.addAttribute("listKT", ktRepo.findAll());
        model.addAttribute("listSP", spRepo.findAll());
        return "spct/create";
    }
}
