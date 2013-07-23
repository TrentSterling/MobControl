package com.trentsterling.mobcontrol;

import org.bukkit.entity.Blaze;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Horse;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.MushroomCow;
import org.bukkit.entity.Ocelot;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Witch;
import org.bukkit.entity.Wither;
import org.bukkit.entity.Wolf;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;
import org.bukkit.plugin.java.JavaPlugin;

public class MobControlPlugin extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		getLogger().info("STOPBREEDING LOADED");
		getServer().getPluginManager().registerEvents(this, this);
	}

	@EventHandler
	public void onEntitySpawn(CreatureSpawnEvent event) {
		if (event.getSpawnReason().equals(SpawnReason.BREEDING)) {
			// getLogger().info("CANCELLED BREEDING!");
			event.setCancelled(true);
		}
		if (event.getSpawnReason().equals(SpawnReason.BUILD_IRONGOLEM)) {
			// getLogger().info("CANCELLED BUILD_IRONGOLEM!");
			event.setCancelled(true);
		}
		if (event.getSpawnReason().equals(SpawnReason.BUILD_WITHER)) {
			// getLogger().info("CANCELLED BUILD_WITHER!");
			event.setCancelled(true);
		}
		if (event.getSpawnReason().equals(SpawnReason.CHUNK_GEN)) {

			if (event.getEntity() instanceof Cow || event.getEntity() instanceof Sheep || event.getEntity() instanceof Chicken || event.getEntity() instanceof MushroomCow
					|| event.getEntity() instanceof Horse || event.getEntity() instanceof Wolf || event.getEntity() instanceof Ocelot) {

				// getLogger().info("CANCELLED CHUNK_GEN!");
				event.setCancelled(true);
			}

		}
		if (event.getSpawnReason().equals(SpawnReason.NATURAL)) {

			if (event.getEntity() instanceof Cow || event.getEntity() instanceof Sheep || event.getEntity() instanceof Chicken || event.getEntity() instanceof MushroomCow
					|| event.getEntity() instanceof Horse || event.getEntity() instanceof Wolf || event.getEntity() instanceof Ocelot) {

				// getLogger().info("CANCELLED NATURAL!");
				event.setCancelled(true);
			}

		}

		if (event.getEntity() instanceof Wither || event.getEntity() instanceof IronGolem || event.getEntity() instanceof Blaze || event.getEntity() instanceof PigZombie
				|| event.getEntity() instanceof EnderDragon|| event.getEntity() instanceof Witch) {

			event.setCancelled(true);

		}
	}

}
