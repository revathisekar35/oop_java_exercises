package com.techreturners.cats;

public class DomesticCat extends BaseCat implements Cat {

	public DomesticCat() {
		super(false, true, "Purrrrrrr", "green");
	}

	@Override
	public String getCatDefaultSound() {
		if (super.getCatDefaultSound() == CatFeature.MEAOW.behaviour)
			return "meaaaaow...";
		return CatFeature.MEAOW.behaviour;
	}

}
