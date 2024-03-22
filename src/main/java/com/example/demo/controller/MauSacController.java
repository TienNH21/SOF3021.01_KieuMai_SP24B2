package com.example.demo.controller;

import com.example.demo.entities.MauSac;
import com.example.demo.repositories.MauSacRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("mau-sac")
public class MauSacController {
    @Autowired
    private MauSacRepository msRepo;

    @GetMapping("index")
    public String index(Model model)
    {
        List<MauSac> ds = this.msRepo.findAll();
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
        ms.setId(null);
        this.msRepo.save(ms);
        return "mau_sac/create";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") MauSac ms)
    {
//        MauSac ms = this.msRepo.findByMa(maMauSac);
//        this.msRepo.delete(ms);
        this.msRepo.delete(ms);
        return "mau_sac/create";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") MauSac ms, Model model)
    {
        model.addAttribute("ms", ms);
        return "mau_sac/edit";
    }

    @PostMapping("/update/{id}")
    public String update(
        MauSac newValue,
        @PathVariable("id") MauSac oldValue
    ) {
        newValue.setId(oldValue.getId());
        this.msRepo.save(newValue);

        return "redirect:/mau-sac/index";
    }
}
