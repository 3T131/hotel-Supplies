package com.accp.controller;

import com.accp.biz.PassengerBiz;
import com.accp.biz.impl.AttributeDetailsBizImpl;
import com.accp.entity.Passenger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/Passenger")
public class PassengerController {
    @Resource
    private PassengerBiz passengerBiz;
    @Resource
    private AttributeDetailsBizImpl attributeDetailsBiz;


    @RequestMapping("/tolist.do")
    public String list(Model model, String name) {

        model.addAttribute("list", passengerBiz.list(name));
        return "passenger/list";
    }

    @RequestMapping("/delete.do")
    public String delete(String[] id, Model model, String name) {
        System.out.println(id);
        passengerBiz.delete(id);
        return list(model, name);
    }

    @RequestMapping("toupdate.do")
    public String toupdate(Model model, int id) {

//        model.addAttribute("listGender",passengerBiz.queryPassengerId(id));
//        model.addAttribute("listNation",passengerBiz.queryPassengerId(id));
//        model.addAttribute("listEducationDegree",passengerBiz.queryPassengerId(id));
//        model.addAttribute("listPassengerLevel",passengerBiz.queryPassengerId(id));
//        model.addAttribute("listPapers",passengerBiz.queryPassengerId(id));
//        model.addAttribute("listThingReason",passengerBiz.queryPassengerId(id));
        model.addAttribute("list", passengerBiz.queryPassengerId(id));
        model.addAttribute("listGender", attributeDetailsBiz.listByAttributeName(8));
        model.addAttribute("listNation", attributeDetailsBiz.listByAttributeName(9));
        model.addAttribute("listPassengerLevel", attributeDetailsBiz.listByAttributeName(13));
        model.addAttribute("listPapers", attributeDetailsBiz.listByAttributeName(10));

        return "passenger/update";
    }

    @RequestMapping("/toadd.do")
    public String add(Model model) {
        model.addAttribute("listGender", attributeDetailsBiz.listByAttributeName(8));
        model.addAttribute("listNation", attributeDetailsBiz.listByAttributeName(9));
        model.addAttribute("listPassengerLevel", attributeDetailsBiz.listByAttributeName(13));
        model.addAttribute("listPapers", attributeDetailsBiz.listByAttributeName(10));
        return "passenger/add";
    }
    @RequestMapping("/add.do")
    public String addTable(Model model,String name,Passenger passenger){
            passengerBiz.add(passenger);
        name=null;
        return list( model, name) ;
    }


    @RequestMapping("/update.do")
    public String update(Model model,String name,Passenger passenger) {
        if (passengerBiz.update(passenger)!=null){
            name=null;
        return list( model,name);
        }
        else{
            return "error";
        }
    }
}
