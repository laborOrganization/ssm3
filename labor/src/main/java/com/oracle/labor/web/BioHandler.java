package com.oracle.labor.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.oracle.labor.common.codetable.ComputergradeOperation;
import com.oracle.labor.common.codetable.EducationallevelOperation;
import com.oracle.labor.common.codetable.EmploytypeOperation;
import com.oracle.labor.common.codetable.HealthstateOperation;
import com.oracle.labor.common.codetable.IndustryOperation;
import com.oracle.labor.common.codetable.LanguageOperation;
import com.oracle.labor.common.codetable.MarriageOperation;
import com.oracle.labor.common.codetable.OrgtypeOperation;
import com.oracle.labor.common.codetable.PersonneltypeOperation;
import com.oracle.labor.common.codetable.ProficiencyOperation;
import com.oracle.labor.common.codetable.RegioncodeOperation;
import com.oracle.labor.common.codetable.RegtypeOperation;
import com.oracle.labor.common.codetable.RprtypeOperation;
import com.oracle.labor.common.codetable.SpecialtyOperation;
import com.oracle.labor.common.codetable.ZjdgwlbOperation;
import com.oracle.labor.po.Bio;
import com.oracle.labor.po.ZjDwzpgzb;
import com.oracle.labor.service.DwdjService;
@RequestMapping("/Dwdj")
@Controller
@SessionAttributes(value= {"name","age"})
public class BioHandler {
   @Autowired
	DwdjService dwdjService;
   
   @RequestMapping("/addBio")
   public String addBio(Bio bio) {
	   dwdjService.AddBio(bio);
	   return "redirect:/service/zj/dwzp/dwdj_3.jsp";
   }
   
   
   @RequestMapping("/addBio2")
   public String addBio2(ZjDwzpgzb zjdwzpgzb) {
	   dwdjService.AddZjDwzpgzb(zjdwzpgzb);
	   return "redirect:/service/zj/dwzp/dwdj_2.jsp";
   }
   
   
   @RequestMapping(value="/getDwdj1")
   @ResponseBody
   public Bio getDwdj1(String No) {
	   
	  Bio bio=dwdjService.getBio(No);
	   return bio;
	  
   }
   
   @RequestMapping(value="/Text")
    public String Text(Map<String,Object> map) {
	   map.put("name", "caonima");
	   map.put("age",2);

	   return "redirect:/service/zj/dwzp/text.jsp";
	  
   }

   
   @RequestMapping(value="/getRegioncodeZcs",produces="text/html;charset=UTF-8")
   @ResponseBody
   public String getRegioncodeZcs() {
	  
	   return RegioncodeOperation.getProvince();
	  
   }
   
   
   @RequestMapping(value="/getRegioncodeZcq",produces="text/html;charset=UTF-8")
   @ResponseBody
   public String getRegioncodeZcq(String selectedId,String region) {
	
	   return RegioncodeOperation.getSelectedRegion(selectedId, region);
	  
   }
   
   @RequestMapping(value="/getOrgType",produces="text/html;charset=UTF-8")
   @ResponseBody
   public String getOrgType() {
	  
	   return OrgtypeOperation.getOption();
	  
   }
   

   
   @RequestMapping(value="/getRegType",produces="text/html;charset=UTF-8")
   @ResponseBody
   public String getRegType() {
	  
	   return RegtypeOperation.getOption();
	  
   }
   
   @RequestMapping(value="/getIndustry",produces="text/html;charset=UTF-8")
   @ResponseBody
   public String getIndustry() {
	  
	   return IndustryOperation.getOption();
	  
   }
   

	@ResponseBody
	@RequestMapping(value="/getSpecialty",produces="text/html;charset=UTF-8")
	public String getSpecialty( ) {
		return SpecialtyOperation.getOption();
	}
	
	@ResponseBody
	@RequestMapping(value="/getGwlb",produces="text/html;charset=UTF-8")
	public String getGwlb( ) {
		return ZjdgwlbOperation.getOption();
	}
	
	@ResponseBody
	@RequestMapping(value="/getRprType",produces="text/html;charset=UTF-8")
	public String getRprType( ) {
		return RprtypeOperation.getOption();
	}
	
	@ResponseBody
	@RequestMapping(value="/getEduLevel",produces="text/html;charset=UTF-8")
	public String getEduLevel( ) {
		return EducationallevelOperation.getOption();
	}
	
	@ResponseBody
	@RequestMapping(value="/getEmployType",produces="text/html;charset=UTF-8")
	public String getEmployType( ) {
		return EmploytypeOperation.getOption();
	}
	
	@ResponseBody
	@RequestMapping(value="/getMarriage",produces="text/html;charset=UTF-8")
	public String getMarriage( ) {
		return MarriageOperation.getOption();
	}
	
	@ResponseBody
	@RequestMapping(value="/getHealthState",produces="text/html;charset=UTF-8")
	public String getHealthState( ) {
		return HealthstateOperation.getOption();
	}
	
	@ResponseBody
	@RequestMapping(value="/getPersonnelType",produces="text/html;charset=UTF-8")
	public String getPersonnelType( ) {
		return PersonneltypeOperation.getOption();
	}
	
	@ResponseBody
	@RequestMapping(value="/getComputerGrade",produces="text/html;charset=UTF-8")
	public String getComputerGrade( ) {
		return ComputergradeOperation.getOption();
	}
	
	@ResponseBody
	@RequestMapping(value="/getProficiency",produces="text/html;charset=UTF-8")
	public String getProficiency( ) {
		return ProficiencyOperation.getOption();
	}
	
	@ResponseBody
	@RequestMapping(value="/getLanguage",produces="text/html;charset=UTF-8")
	public String getLanguage( ) {
		return LanguageOperation.getOption();
	}
	
}
