package com.google.api.games;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;

/**
 * An empty container extension whose only purpose is to inject java classes
 * into an adobe air Flex build.
 */
public class Container implements FREExtension {

	@Override
	public FREContext createContext(String type) {
		return null;
	}

	@Override
	public void dispose() {

	}

	@Override
	public void initialize() {

	}

}
