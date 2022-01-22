package com.techreturners.cats;

public class LionCat extends BaseCat implements Cat {

	private final String ORANGE = "orange";
	private final String EATINGSOUND = "Roar!!!!";

	public LionCat(boolean isAsleep, boolean isDomestic) {
		super(isAsleep, isDomestic);
	}

	@Override
	public String eat() {
		return EATINGSOUND;
	}

	@Override
	public boolean isAsleep() {
		return false;
	}

	@Override
	public String run() {
		return CatFeature.RUN.behaviour;
	}

	@Override
	public void goToSleep() {
		setAsleep(true);
	}

	public int getAverageHeight() {
		if (isDomestic())
			return CatAverageHeight.DOMESTIC_CAT_HEIGHT.height;
		else
			return CatAverageHeight.WILD_CAT_HEIGHT.height;
	}

	@Override
	public void wakeUp() {
		setAsleep(true);
	}

	@Override
	public String getSetting() {
		if (super.isDomestic())
			return CatFeature.DOMESTIC.behaviour;
		else
			return CatFeature.WILD.behaviour;
	}

	@Override
	public String getColor() {
		return ORANGE;
	}

}
