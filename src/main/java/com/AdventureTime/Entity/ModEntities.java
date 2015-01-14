package com.AdventureTime.Entity;

import cpw.mods.fml.common.registry.EntityRegistry;

public class ModEntities {

	public static void mainRegistry() {
		EntityRegistry.registerGlobalEntityID(EntityFinn.class, "Finn", EntityRegistry.findGlobalUniqueEntityId(), 0x7AE8FF, 0x47FFE2);
	}

}
