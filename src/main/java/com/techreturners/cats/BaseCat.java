package com.techreturners.cats;

public abstract class BaseCat {
	private boolean isDomestic;
	private boolean isAsleep;
	private String eatingSound;
	private String color;

	public enum CatFeature {
		MEAOW("meaow"), RUN("I am running"), DOMESTIC("domestic"), WILD("wild");

		protected String behaviour;

		CatFeature(String behaviour) {
			this.behaviour = behaviour;
		}
	}

	public enum CatAverageHeight {
		DOMESTIC_CAT_HEIGHT(23), WILD_CAT_HEIGHT(1100);

		protected int height;

		CatAverageHeight(int height) {
			this.height = height;
		}
	}

	public BaseCat(boolean isAsleep, boolean isDomestic, String eatingSound, String color) {
		this.isAsleep = isAsleep;
		this.isDomestic = isDomestic;
		this.eatingSound = eatingSound;
		this.color = color;
	}

	public String getCatDefaultSound() {
		return CatFeature.MEAOW.behaviour;
	}

	public int getAverageHeight() {
		if (isDomestic())
			return CatAverageHeight.DOMESTIC_CAT_HEIGHT.height;
		else
			return CatAverageHeight.WILD_CAT_HEIGHT.height;
	}

	public String getSetting() {
		if (isDomestic())
			return CatFeature.DOMESTIC.behaviour;
		else
			return CatFeature.WILD.behaviour;
	}

	public String run() {
		return CatFeature.RUN.behaviour;
	}

	public void goToSleep() {
		setAsleep(true);

	}

	public void wakeUp() {
		setAsleep(false);
	}

	public String eat() {
		return eatingSound;
	}

	public boolean isAsleep() {
		return getAsleep();
	}

	public boolean isDomestic() {
		return isDomestic;
	}

	public void setDomestic(boolean isDomestic) {
		this.isDomestic = isDomestic;
	}

	public void setAsleep(boolean isAsleep) {
		this.isAsleep = isAsleep;
	}

	public boolean getAsleep() {
		return isAsleep;
	}

	public String getColor() {
		return color;
	}

}
