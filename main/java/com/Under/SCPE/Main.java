package com.Under.SCPE;

import com.Under.SCPE.proxy.CommonProxy;
import com.Under.SCPE.util.Referance;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Referance.MOD_ID, name = Referance.NAME, version = Referance.VERSION)
public class Main {
	@Instance
	public static Main instance;

	@SidedProxy(clientSide = Referance.CLIENT_PROXY_CLASS, serverSide = Referance.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) 
	{
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) 
	{
		
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) 
	{
		
	}
}
