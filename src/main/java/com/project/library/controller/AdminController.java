package com.project.library.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.project.library.model.Admin;
import com.project.library.service.AdminService;



@Controller
@RequestMapping(value = "/admin")
public class AdminController {
	
	@Autowired
    private AdminService adminService;


    @RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)
    public String index(Model model){
        List<Admin> admin = adminService.getAllAdmin();

        model.addAttribute("admin", admin);
        return "admin/list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addAdmin(Model model){
        model.addAttribute("admin", new Admin());

        return "admin/form";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editAdmin(@PathVariable("id") Long adminId, Model model){
        Optional<Admin> adminEdit = adminService.findAdminById(adminId);
        if(adminEdit.isPresent()) {
        	adminEdit.ifPresent(admin -> model.addAttribute("admin", admin));
            return "/admin/form";
        } else {
            return "redirect:/admin/add";
        }
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@Valid Admin admin, final BindingResult bindingResult, final RedirectAttributes redirectAttributes){
        if( bindingResult.hasErrors()){
            System.out.println("here");

            return  "/admin/form";
        }
        System.out.println("hello:" + admin.toString());
        if(admin.getId() == null){
        	adminService.addNew(admin);
            redirectAttributes.addFlashAttribute("successMsg", "'" + admin.getAdminName() + "' đã được thêm admin mới.");
            return "redirect:/admin/add";
        } else {
            Admin updateAdmin = adminService.saveAdmin(admin);
            redirectAttributes.addFlashAttribute("successMsg", "Thay đổi '" + admin.getAdminName() + "' thành công. ");
            return "redirect:/admin/edit/"+updateAdmin.getId();
        }

    }

    @RequestMapping(value = "/remove/{id}", method = RequestMethod.GET)
    public String deleteAdmin(@PathVariable("id") Long adminId){
    	adminService.deleteAdmin(adminId);
        return "redirect:/admin/list";
    }

}
