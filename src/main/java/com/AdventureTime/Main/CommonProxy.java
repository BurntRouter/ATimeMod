package com.AdventureTime.Main;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;



public class CommonProxy implements IGuiHandler {
	
	 
	        // Client stuff
	        public void registerRenderers() {
	                // Nothing here as the server doesn't render graphics or entities!
	        	
	        	
	        	
	        }

	        @Override
	        public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	        {
	        return null;
	        }
	        @Override
	        public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	        {
	        TileEntity tileEntity = world.getTileEntity(null);

	        if(tileEntity != null)
	        {
	        switch(ID)
	        {
	        case 0: /* your Containers go here*/
	        }
	        }
			return null;
	        }
	}
