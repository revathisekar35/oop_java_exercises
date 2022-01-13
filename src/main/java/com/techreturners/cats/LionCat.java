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
		return RUN;
	}

	@Override
	public void goToSleep() {
		setAsleep(true);
	}
	public int getAverageHeight() {
		if (super.isDomestic())
			return AVERAGEDOMESTICCATHEIGHT;
		else
			return AVERAGEWILDCATHEIGHT;
	}

	@Override
	public void wakeUp() {
		setAsleep(true);
	}

	@Override
	public String getSetting() {
		if (super.isDomestic())
			return SETTINGDOMESTIC;
		else
			return SETTINGWILD;
	}

	@Override
	public String getColor() {
		return ORANGE;
	}

}
