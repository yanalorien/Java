package com.modifiers.pack2;

import com.modifiers.pack1.MemberLevel;

public class MemberLevel2 extends MemberLevel
{
	public MemberLevel2(String ln, String fn, int ag, String ci)
	{
		super(ln, fn, ag, ci);
	}
	
	public void usingSuperclassVariables()
	{
//		privateLastName = "Raegan";
		publicFirstName = "Ronald";
		protectedAge = 88;
//		defaultCity = "DC";
	}
	
	public void usingSuperclassMethods()
	{
//		getPrivateLastName();
		getPublicFirstName();
		getProtectedAge();
//		getDefaultCity();
	}
}
