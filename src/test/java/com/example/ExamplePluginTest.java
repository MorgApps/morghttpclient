package com.example;

import com.morghttpclient.HttpServerPlugin;
import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ExamplePluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(HttpServerPlugin.class);
		RuneLite.main(args);
	}
}