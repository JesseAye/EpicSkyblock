package com.peaches.epicskyblock.configs;

import org.bukkit.Material;
import org.bukkit.block.Biome;

import java.util.HashMap;

public class Config {

    public String prefix = "&b&lEpicSkyblock";
    public String UpgradeGUITitle = "&7Upgrade";
    public String BoosterGUITitle = "&7Booster";
    public String MissionsGUITitle = "&7Missions";
    public String MembersGUITitle = "&7Members";
    public String WarpGUITitle = "&7Warps";
    public String TopGUITitle = "&7Top Islands";
    public String BorderColorGUITitle = "&7Border Color";
    public String PermissionsGUITitle = "&7Permissions";
    public int distance = 1;
    public HashMap<Integer, Upgrade> size = new HashMap<Integer, Upgrade>() {{
        put(1, new Upgrade(50, 15));
        put(2, new Upgrade(100, 15));
        put(3, new Upgrade(150, 15));
    }};
    public HashMap<Integer, Upgrade> member = new HashMap<Integer, Upgrade>() {{
        put(1, new Upgrade(9, 15));
        put(2, new Upgrade(18, 15));
        put(3, new Upgrade(27, 15));
    }};
    public HashMap<Integer, Upgrade> warp = new HashMap<Integer, Upgrade>() {{
        put(1, new Upgrade(2, 15));
        put(2, new Upgrade(5, 15));
        put(3, new Upgrade(9, 15));
    }};
    public Biome defaultBiome = Biome.PLAINS;
    public int spawnerBoosterCost = 15;
    public int farmingBoosterCost = 15;
    public int experienceBoosterCost = 15;
    public int flightBoosterCost = 15;
    public HashMap<Material, Integer> blockvalue = new HashMap<Material, Integer>() {{
        put(Material.DIAMOND_BLOCK, 10);
        put(Material.EMERALD_BLOCK, 20);
        put(Material.BEACON, 100);
    }};
    public HashMap<String, Integer> spawnervalue = new HashMap<String, Integer>() {{
        put("PIG", 100);
        put("IRON_GOLEM", 1000);
    }};
    public HashMap<Integer, Integer> islandTopSlots = new HashMap<Integer, Integer>() {{
        put(1, 4);
        put(2, 12);
        put(3, 14);
        put(4, 19);
        put(5, 20);
        put(6, 21);
        put(7, 22);
        put(8, 23);
        put(9, 24);
        put(10, 25);

    }};

    public class Upgrade {
        private int size;
        private int cost;

        public Upgrade(int size, int cost) {
            this.size = size;
            this.cost = cost;
        }

        public int getSize() {
            return size;
        }

        public int getCost() {
            return cost;
        }
    }
}
