package com.gavman.canineorigin;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class canineorigin implements ModInitializer {
	public static final String MOD_ID = "canineorigin";
    public static final Logger LOGGER = LoggerFactory.getLogger("canineorigin");

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing " + MOD_ID + ". arf arf :3");
	}
	public static Identifier identifier(String path) {
		return new Identifier(MOD_ID, path);
	}
}