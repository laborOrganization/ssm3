package com.oracle.labor.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Dwdj")
public class BioFreezeHandler {

	@RequestMapping("/getBioByNo")
	public String getBioByNo(int bioNo) {
		
		
		return "service/zj/dwzp/dwdj_dj_2";
	}
}
