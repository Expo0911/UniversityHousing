package com.javaweb.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.javaweb.po.FamilyApartment;
import com.javaweb.po.GeneralApartment;
import com.javaweb.po.ResidenceHall;
import com.javaweb.service.FamilyApartmentService;
import com.javaweb.service.GeneralApartmentService;
import com.javaweb.service.ResidenceHallService;
import com.opensymphony.xwork2.ActionSupport;

public class ShowHouseAction extends ActionSupport{
	private FamilyApartmentService familyApartmentService;
	private GeneralApartmentService generalApartmentService;
	private ResidenceHallService residenceHallService;
	
	
	public void setFamilyApartmentService(
			FamilyApartmentService familyApartmentService) {
		this.familyApartmentService = familyApartmentService;
	}
	
	public void setGeneralApartmentService(
			GeneralApartmentService generalApartmentService) {
		this.generalApartmentService = generalApartmentService;
	}

	public void setResidenceHallService(ResidenceHallService residenceHallService) {
		this.residenceHallService = residenceHallService;
	}
	
	@Override
	public String execute() throws Exception {
		List<FamilyApartment> familyApartments=familyApartmentService.queryAllFamilyApartment();
		List<GeneralApartment> generalApartments=generalApartmentService.queryAllGeneralApartment();
		List<ResidenceHall> residenceHalls=residenceHallService.queryAllResidenceHall();
		ServletActionContext.getRequest().setAttribute("family", familyApartments);
		ServletActionContext.getRequest().setAttribute("general", generalApartments);
		ServletActionContext.getRequest().setAttribute("hall", residenceHalls);
		return SUCCESS;
	}
	
}
