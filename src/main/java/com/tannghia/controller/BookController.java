package com.tannghia.controller;

import com.tannghia.model.MemberDTO;
import com.tannghia.model.Person;
import com.tannghia.service.IMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class BookController {

    private static List<Person> persons = new ArrayList<Person>();
    private static List<String> listHocVan = new ArrayList<String>();
    private static List<String> listEmail = new ArrayList<String>();
    private static List<String> listDiaChi = new ArrayList<String>();
    final static String DATE_FORMAT = "dd/mm/yyyy";
    @Autowired
    IMember memberservice ;


    private static	String arrHocVan[] = new String[] {"Đại Học","Cao Đẳng","Thạc Sĩ"};
    private static	String arrDiaChi[] = new String[] {"TP.Hồ Chi Minh","Hà Nội","Huế","Đà Nẵng"};
    private static String arrEmail[] = new String[] {"abc@gmail.com","tannghia@gmail.com"};
    static {
        persons.add(new Person("Bill", "Gates"));
        persons.add(new Person("Steve", "Jobs"));
        listHocVan = Arrays.asList(arrHocVan);
        listDiaChi = Arrays.asList(arrDiaChi);
        listEmail = Arrays.asList(arrEmail);
    }
    @GetMapping(value = {"/dangky"})
    public String viewRegister(Model model) {
        MemberDTO data = new MemberDTO();

        model.addAttribute("data", data);
        model.addAttribute("listHocVan", listHocVan);
        model.addAttribute("listDiaChi", listDiaChi);

        return "formRegister";
    }

    @PostMapping(value = {"/dangkytaikhoan"})
    public String resgister(@ModelAttribute("data") MemberDTO data, Model model) {
        String result ="";
        Date ngaysinh = isDateValid(data.getDob());

        memberservice.findOneById(data.getEmail());

        if(data!=null && data.getDiachi() != "" && data.getPassword() != "" && data.getRepassword() != ""&& data.getDob() != ""&& data.getFullname()!="") {
            if(memberservice.findOneById(data.getEmail())!=null){
                return "redirect:/dangky?error=emailExist";
            };
            if(!data.getEmail().contains("@")) {
                return "redirect:/dangky?error=emailInvalid";
            }else if(listEmail.contains(data.getEmail())) {
                return "redirect:/dangky?error=emailExist";
            }else
            if(data.getPassword().length()<8) {
                return "redirect:/dangky?error=password";
            }else
            if(!data.getRepassword().equals(data.getPassword())) {
                return "redirect:/dangky?error=incorrectpassword";
            }
            else
            if(ngaysinh==null) {
                return "redirect:/dangky?error=incorrectdate";
            }else{
                data.setNgaysinh(ngaysinh);
            }
        }else {
            return "redirect:/dangky?error=empty";
        }
      MemberDTO dataRegisted = memberservice.save(data);
        model.addAttribute("data",dataRegisted);

        return "dangkythanhcong";
    }
    public  Date isDateValid(String date)
    {
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            ;
            return df.parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {

        String message = "Hello Spring Boot + JSP";

        model.addAttribute("message", message);

        return "index";
    }
    @RequestMapping(value = { "/personList" }, method = RequestMethod.GET)
    public String viewPersonList(Model model) {

        model.addAttribute("persons", persons);

        return "personList";
    }
    @RequestMapping(value  ="/danhsachthanhvien",method = RequestMethod.GET)
    public String viewDanhSachMem(Model model){
        model.addAttribute("listmem",memberservice.findAll());
        return "danhsachthanhvien";
    }
}
