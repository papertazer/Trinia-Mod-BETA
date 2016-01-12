package com.trinia.events;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class EventHandlerCommon {
	@SubscribeEvent
	public void onPlayerLogin(PlayerLoggedInEvent e) {
		EntityPlayer player = (EntityPlayer) e.player;
		if (ConfigurationHandler.canDisplay) {
			if (!player.worldObj.isRemote) {
				if (!ConfigurationHandler.hasDisplayedOnce) {
					player.addChatMessage(new ChatComponentText(
							EnumChatFormatting.AQUA
									+ "Thank you for downloading Trinia 2.0."));
					player.addChatMessage(new ChatComponentText(
							"Make sure you check out the PMC Page! http://www.planetminecraft.com/mod/125-trinia/"));
					ConfigurationHandler.hasDisplayedOnce = true;
				}
			}
		}
	}
}