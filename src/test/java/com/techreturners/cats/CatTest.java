package com.techreturners.cats;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

	@Test
	public void checkCatIsAwake() {
		Cat domesticCat = new DomesticCat(false,true);
		assertFalse("Cat should be awake by default", domesticCat.isAsleep());
	}

	@Test
	public void checkCatCanGoToSleep() {
		Cat domesticCat = new DomesticCat(false,true);
		domesticCat.goToSleep();
		assertTrue("Cat should be snoozing", domesticCat.isAsleep());
	}

	@Test
	public void checkCatCanWakep() {
		Cat domesticCat = new DomesticCat(false,true);
		domesticCat.goToSleep();
		domesticCat.wakeUp();
		assertFalse("Cat should be awake now", domesticCat.isAsleep());
	}

	@Test
	public void checkCatSetting() {
		Cat domesticCat = new DomesticCat(false,true);
		assertEquals("domestic", domesticCat.getSetting());
	}

	@Test
	public void checkCatHeight() {
		Cat domesticCat = new DomesticCat(false,true);
		assertEquals(23, domesticCat.getAverageHeight());
	}

	@Test
	public void checkLionHeight() {
		Cat lionCat = new LionCat(false,false);
		assertEquals(1100, lionCat.getAverageHeight());
	}
	
	@Test
	public void checkCheetahHeight() {
		Cat cheetahCat = new CheetahCat(false,false);
		assertEquals(1100, cheetahCat.getAverageHeight());
	}

	@Test
	public void feedTheLion() {
		Cat lionCat = new LionCat(false,false);
		assertEquals("Roar!!!!", lionCat.eat());
	}

	@Test
	public void feedTheCheetah() {
		Cat cheetahCat = new CheetahCat(false,false);
		assertEquals("Zzzzzzz", cheetahCat.eat());
	}

	@Test
	public void feedTheCat() {
		Cat domesticCat = new DomesticCat(false,true);
		assertEquals("Purrrrrrr", domesticCat.eat());
	}

	@Test
	public void checkGetCatDefaultSound() {
		DomesticCat domesticCat = new DomesticCat(false,true);
		assertEquals("meaaaaow...", domesticCat.getCatDefaultSound());
	}
	
	@Test
	public void checkGetColor() {
		DomesticCat domesticCat = new DomesticCat(false,true);
		assertEquals("green", domesticCat.getColor());
		LionCat lionCat = new LionCat(false,false);
		assertEquals("orange", lionCat.getColor());
		CheetahCat cheetahCat = new CheetahCat(false,false);
		assertEquals("yellow", cheetahCat.getColor());
	}
}
