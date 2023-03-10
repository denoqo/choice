package com.choice.onlineOrder.controller;

import com.choice.onlineOrder.service.CartService;
import com.choice.onlineOrder.entity.Cart;
// dependency injection
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
// use api with GET
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CartController {

    @Autowired
    private CartService cartService;

    @RequestMapping(value = "/cart", method = RequestMethod.GET)
    @ResponseBody
    public Cart getCart(){
        return cartService.getCart();
    }
}
