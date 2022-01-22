package com.techreturners.cats;

public abstract class BaseCat {
	private boolean isDomestic;
	private boolean isAsleep;

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
		return CatFeature.MEAOW.behaviour;
	}

}
