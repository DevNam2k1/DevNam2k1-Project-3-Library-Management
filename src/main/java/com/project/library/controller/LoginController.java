package com.project.library.controller;

import com.project.library.service.BookService;
import com.project.library.service.CallCardDetailService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    private BookService bookService;

    @Autowired
    private CallCardDetailService callCardDetailService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "/login";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model){
        model.addAttribute("cateStat", this.bookService.totalBookOfCategory());
        return "/home";
    }

    @RequestMapping(value = "/book-price-stats", method = RequestMethod.GET)
    public String bookPriceStats(Model model) {
//        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
//
//        Date startDate = null;
//        String start = payload.getOrDefault("fromDate", null);
//        if (start != null)
//            startDate = f.parse(start);
//
//        Date endDate = null;
//        String end = payload.getOrDefault("toDate", null);
//        if (end != null)
//            endDate = f.parse(end);

        model.addAttribute("bookStats", this.callCardDetailService.totalBookPrice());
        return "/stats/book-stats";
    }

}
