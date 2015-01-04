package com.soni.customPropertyEditor;

import java.beans.PropertyEditorSupport;

import lombok.Getter;
import lombok.Setter;

import com.soni.model.UserDetail;

public class UsernameCustomPropertyEditor extends PropertyEditorSupport { 
	@Getter @Setter
	private UserDetail userDetail;
	
	public UsernameCustomPropertyEditor(UserDetail userDetail){
		this.userDetail = userDetail;
	}
	
	@Override
	public void setAsText(String username) throws IllegalArgumentException {
		String gender = userDetail.getGender();
		if("Male".equals(gender)){
			setValue("Mr. "+username);
		} else if("Female".equals(gender)){
			setValue("Ms. "+username);
		}
	}
}
