package com.varun.springms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.varun.springms.model.Coupon;
import com.varun.springms.repo.CouponRepo;

@RestController
@RequestMapping("/couponapi")
public class CouponController {
	
	@Autowired
	public CouponRepo repo;
	
	@RequestMapping(value="/createCoupon", method = RequestMethod.POST)
	public Coupon createCoupon(@RequestBody Coupon coupon) {
		return repo.save(coupon);
	}
	
	@RequestMapping(value="/getCoupon/{code}", method = RequestMethod.GET)
	public Coupon getCoupon(@PathVariable("code") String code) {
		return repo.findByCode(code);
	}
	
		

}
