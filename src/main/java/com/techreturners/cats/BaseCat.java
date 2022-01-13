package com.techreturners.cats;

public abstract class BaseCat {
	private boolean isDomestic;
	private boolean isAsleep;
	protected final String MEAOW = "meaow";
	protected final String RUN = "I am running";
	protected final String SETTINGDOMESTIC = "domestic";
	protected final String SETTINGWILD = "wild";
	protected final int AVERAGEDOMESTICCATHEIGHT = 23;
	protected final int AVERAGEWILDCATHEIGHT = 1100;

	public BaseCat(boolean isAsleep, boolean isDomestic) {
		this.isAsleep = isAsleep;
		this.isDomestic = isDomestic;
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

	abstract String getColor();

	public String getCatDefaultSound() {
		return MEAOW;
	}

}
