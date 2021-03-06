package au.com.mineauz.minigamesregions.actions;

import java.util.Map;

import org.bukkit.configuration.file.FileConfiguration;

import au.com.mineauz.minigames.MinigamePlayer;
import au.com.mineauz.minigames.menu.Menu;
import au.com.mineauz.minigamesregions.Node;
import au.com.mineauz.minigamesregions.Region;

public abstract class ActionInterface {
	public abstract String getName();
	public abstract String getCategory();
	public abstract void describe(Map<String, Object> out);
	public abstract boolean useInRegions();
	public abstract boolean useInNodes();
	public abstract void executeRegionAction(MinigamePlayer player, Region region);
	public abstract void executeNodeAction(MinigamePlayer player, Node node);
	public abstract void saveArguments(FileConfiguration config, String path);
	public abstract void loadArguments(FileConfiguration config, String path);
	public abstract boolean displayMenu(MinigamePlayer player, Menu previous);
}
