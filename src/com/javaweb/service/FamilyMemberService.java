package com.javaweb.service;

import java.util.List;

import com.javaweb.po.FamilyMember;

public interface FamilyMemberService {
	public boolean addFamilyMember(FamilyMember familymember);
	
	public boolean deleteFamilyMember(int id);
	
	public boolean updateFamilyMember(FamilyMember familymember);
	
	public List queryAllFamilyMember();
	
	public FamilyMember queryFamilyMemberByID(int id);
}
