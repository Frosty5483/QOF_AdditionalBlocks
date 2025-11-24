package com.testmod;

import com.testmod.block.ModBlocks;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

//HELLO I AM GGBUTTAH

	@Override
	public void onInitialize() {
        ModBlocks.registerModBlocks();
	}
}