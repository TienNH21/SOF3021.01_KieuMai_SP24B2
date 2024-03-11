package com.example.demo.controller;

import com.example.demo.entities.MauSac;
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

    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String maMauSac)
    {
        for (int i = 0; i < this.ds.size(); i++) {
            MauSac ms = this.ds.get(i);
            if (ms.getMa().equals(maMauSac)) {
                this.ds.remove(i);
            }
        }

        return "mau_sac/create";
    }

    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma") String maMauSac, Model model)
    {
        for (MauSac ms: this.ds) {
            if (ms.getMa().equals(maMauSac)) {
                model.addAttribute("ms", ms);
                return "mau_sac/edit"; // đường dẫn đến file jsp
            }
        }

//        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
        return "redirect:/mau-sac/index";
    }

    @PostMapping("/update/{ma}")
    public String update(MauSac newValue, @PathVariable("ma") String maMauSac)
    {
        for (int i = 0; i < this.ds.size(); i++) {
            MauSac ms = this.ds.get(i);
            if (ms.getMa().equals(maMauSac)) {
                this.ds.set(i, newValue);
            }
        }

        return "redirect:/mau-sac/index";
    }
}
