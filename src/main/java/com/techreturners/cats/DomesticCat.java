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
		return RUN;
	}

	@Override
	public void goToSleep() {
		setAsleep(true);

	}

	@Override
	public int getAverageHeight() {
		if (super.isDomestic())
			return AVERAGEDOMESTICCATHEIGHT;
		else
			return AVERAGEWILDCATHEIGHT;
	}

	@Override
	public String getSetting() {
		if (super.isDomestic())
			return SETTINGDOMESTIC;
		else
			return SETTINGWILD;
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
		if (super.getCatDefaultSound() == super.MEAOW)
			return "meaaaaow...";
		return super.MEAOW;
	}

}
