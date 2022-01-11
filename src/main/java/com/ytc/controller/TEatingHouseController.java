package com.ytc.controller;

import com.ytc.model.*;
import com.ytc.util.*;
import com.ytc.service.TEatingHouseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/TEatingHouse")
public class TEatingHouseController {

    @Autowired
    private TEatingHouseService service;

    @RequestMapping("/queryTEatingHouseList")
    public String queryTEatingHouseList(Model model, PageUtil<TEatingHouse> page){
        System.out.println(page.getList());
        model.addAttribute("page",service.queryTEatingHouseList(page));
        return "store_list";
    }
}
