package com.javaweb.service;

import java.util.List;

import com.javaweb.dao.FamilyMemberDAO;
import com.javaweb.po.FamilyMember;

public class FamilyMemberServiceImpl implements FamilyMemberService {
	private FamilyMemberDAO familyMemberDAO;

	public void setFamilyMemberDAO(FamilyMemberDAO familyMemberDAO) {
		this.familyMemberDAO = familyMemberDAO;
	}

	// add Student
	@Override
	public boolean addFamilyMember(FamilyMember familyMember) {
		if (familyMemberDAO.queryByID(FamilyMember.class,familyMember.getId()) == null) {
			familyMemberDAO.save(familyMember);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteFamilyMember(int id) {
		if (familyMemberDAO.queryByID(FamilyMember.class,id) != null) {
			familyMemberDAO.delete(FamilyMember.class,id);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean updateFamilyMember(FamilyMember familyMember) {
		if (familyMemberDAO.queryByID(FamilyMember.class,familyMember.getId()) != null) {
			familyMemberDAO.update(familyMember);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public List queryAllFamilyMember() {
		return familyMemberDAO.queryAll(FamilyMember.class);
	}

	@Override
	public FamilyMember queryFamilyMemberByID(int id) {
		return familyMemberDAO.queryByID(FamilyMember.class,id);
	}


}
