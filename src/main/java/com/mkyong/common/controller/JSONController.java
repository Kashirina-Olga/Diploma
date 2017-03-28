package com.mkyong.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.mkyong.common.model.Shop;

import ru.rsreu.tc.tracker.dao.DAOFactory;

@Controller
@RequestMapping("/kfc/brands")
public class JSONController {

	// @Autowired
	// DAOFactory daoFactory;

	@RequestMapping(value = "{name}", method = RequestMethod.GET)
	public @ResponseBody Shop getShopInJSON(@PathVariable String name) {
		// System.out.println(daoFactory);
		Shop shop = new Shop();
		shop.setName(name);
		shop.setStaffName(new String[] { "mkyong1", "mkyong2" });

		return shop;

	}
	
//	public static void main(String[] args) {
//		JSONController jsonController= new JSONController();
//		jsonController.getShopInJSON("as");
//	}

}