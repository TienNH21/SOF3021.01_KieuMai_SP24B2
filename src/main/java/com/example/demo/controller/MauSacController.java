package com.example.demo.controller;

import com.example.demo.entities.MauSac;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("mau-sac")
public class MauSacController {
    private List<MauSac> ds = new ArrayList<>();

    public MauSacController()
    {
        this.ds.add(new MauSac("PH1", "Red", 1));
        this.ds.add(new MauSac("PH2", "Yellow", 0));
    }

    @GetMapping("index")
    public String index(Model model)
    {
        model.addAttribute("listMS", ds);
        return "mau_sac/index";
    }

    @GetMapping("create")
    public String create()
    {
        return "mau_sac/create";
    }

    @PostMapping("store")
    public String store(MauSac ms)
    {
        System.out.println(ms.getMa());
        System.out.println(ms.getTen());
        System.out.println(ms.getTrangThai());
        this.ds.add(ms);
        return "mau_sac/create";
    }
}
