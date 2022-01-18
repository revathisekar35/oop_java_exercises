package com.techreturners.cats;

public class DomesticCat extends BaseCat implements Cat {

	private final String GREEN = "green";
	private final String EATINGSOUND = "Purrrrrrr";

	public DomesticCat(boolean isAsleep, boolean isDomestic) {
		super(isAsleep, isDomestic);
	}

	@Override
	public String eat() {
		return EATINGSOUND;
	}

	@Override
	public boolean isAsleep() {
		return getAsleep();
	}

	@Override
	public String run() {
		return CatFeature.RUN.behaviour;
	}

	@Override
	public void goToSleep() {
		setAsleep(true);

	}

	@Override
	public int getAverageHeight() {
		if (isDomestic())
			return CatAverageHeight.DOMESTICCATHEIGHT.height;
		else
			return CatAverageHeight.WILDCATHEIGHT.height;
	}

	@Override
	public String getSetting() {
		if (isDomestic())
			return CatFeature.DOMESTIC.behaviour;
		else
			return CatFeature.WILD.behaviour;
	}

	@Override
	public void wakeUp() {
		setAsleep(false);
	}

	@Override
	public String getColor() {
		return GREEN;
	}

	@Override
	public String getCatDefaultSound() {
		if (super.getCatDefaultSound() == CatFeature.MEAOW.behaviour)
			return "meaaaaow...";
		return CatFeature.MEAOW.behaviour;
	}

}
