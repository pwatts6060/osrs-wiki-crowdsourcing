package com.crowdsourcing;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;
import net.runelite.client.plugins.crowdsourcing.CrowdsourcingPlugin;

public class CrowdsourcingPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(CrowdsourcingPlugin.class);
		RuneLite.main(args);
	}
}