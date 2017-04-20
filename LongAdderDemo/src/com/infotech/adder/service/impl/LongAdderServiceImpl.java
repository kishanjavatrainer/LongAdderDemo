package com.infotech.adder.service.impl;

import java.util.concurrent.atomic.LongAdder;

import com.infotech.adder.service.LongAdderService;

public class LongAdderServiceImpl implements LongAdderService {

	private LongAdder longAdder = new LongAdder();
	@Override
	public long increment() {
		longAdder.increment();
		return longAdder.longValue();
	}

	@Override
	public long decrement() {
		longAdder.decrement();
		return longAdder.longValue();
	}

	@Override
	public long getValue() {
		return longAdder.longValue();
	}

}
