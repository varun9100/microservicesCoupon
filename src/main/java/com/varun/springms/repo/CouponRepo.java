package com.varun.springms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.varun.springms.model.Coupon;

@Repository
public interface CouponRepo extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);

}
