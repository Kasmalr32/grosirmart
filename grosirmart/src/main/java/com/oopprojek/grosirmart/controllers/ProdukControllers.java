package com.oopprojek.grosirmart.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oopprojek.grosirmart.barang.Produk;
import com.oopprojek.grosirmart.services.ProdukRepository;



@Controller
@RequestMapping("/produk")
public class ProdukControllers {
	
	@Autowired
	private ProdukRepository repo;
	
	@GetMapping({"", "/"})
    public String showProductList(Model model) {
        List<Produk> products = repo.findAll();
        model.addAttribute("produk", products);
        return "produk/index";
    }

}
