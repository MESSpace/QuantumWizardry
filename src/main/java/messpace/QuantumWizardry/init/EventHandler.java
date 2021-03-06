package messpace.QuantumWizardry.init;

import messpace.QuantumWizardry.network.PlayerNetworkManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenBase.Height;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventHandler {
	private boolean isOnGround;
	@SubscribeEvent
	public void onEntityConstructing(EntityConstructing event)
	{
		if (event.entity instanceof EntityPlayer && PlayerNetworkManager.get((EntityPlayer) event.entity) == null)
			PlayerNetworkManager.register((EntityPlayer) event.entity);
	}
	
	@SubscribeEvent
	public void onEntityUpdate(LivingUpdateEvent event) {
		NBTTagCompound nbt = new NBTTagCompound();
		boolean isWorldAwakened;
		isWorldAwakened = nbt.getBoolean("isWorldAwakened");
	}
		
 }
