package com.elikill58.negativity.api.packets.nms.versions;

import java.util.Arrays;

import com.elikill58.negativity.api.entity.EntityType;
import com.elikill58.negativity.api.packets.PacketType.Client;
import com.elikill58.negativity.api.packets.PacketType.Server;
import com.elikill58.negativity.api.packets.nms.NamedVersion;

public class Version1_13 extends NamedVersion {

	public Version1_13() {
		super("1.13");
		int i = 0;
		for (Client type : Arrays.asList(Client.TELEPORT_ACCEPT, Client.TILE_NBT_QUERY, Client.CHAT, Client.CLIENT_COMMAND, Client.SETTINGS, Client.TAB_COMPLETE, Client.PONG,
				Client.ENCHANT_ITEM, Client.WINDOW_CLICK, Client.CLOSE_WINDOW, Client.CUSTOM_PAYLOAD, Client.BEDIT, Client.ENTITY_NBT_QUERY, Client.USE_ENTITY, Client.KEEP_ALIVE,
				Client.FLYING, Client.POSITION, Client.POSITION_LOOK, Client.LOOK, Client.VEHICLE_MOVE, Client.BOAT_MOVE, Client.PICK_ITEM, Client.AUTO_RECIPE, Client.ABILITIES,
				Client.BLOCK_DIG, Client.ENTITY_ACTION, Client.STEER_VEHICLE, Client.RECIPE_DISPLAYED, Client.ITEM_NAME, Client.RESOURCE_PACK_STATUS, Client.ADVANCEMENTS, Client.TR_SEL,
				Client.BEACON, Client.HELD_ITEM_SLOT, Client.SET_COMMAND_BLOCK, Client.SET_COMMAND_MINECART, Client.SET_CREATIVE_SLOT, Client.STRUCT, Client.UPDATE_SIGN,
				Client.ARM_ANIMATION, Client.SPECTATE, Client.BLOCK_PLACE, Client.USE_ITEM)) {
			playIn.put(i++, type);
		}
		i = 0;
		for (Server type : Arrays.asList(Server.SPAWN_ENTITY, Server.SPAWN_ENTITY_EXPERIENCE_ORB, Server.SPAWN_ENTITY_WEATHER, Server.SPAWN_ENTITY_LIVING, Server.SPAWN_ENTITY_PAINTING,
				Server.SPAWN_PLAYER, Server.ANIMATION, Server.STATISTIC, Server.BLOCK_BREAK_ANIMATION, Server.TILE_ENTITY_DATA, Server.BLOCK_ACTION, Server.BLOCK_CHANGE, Server.BOSS,
				Server.SERVER_DIFFICULTY, Server.CHAT, Server.MULTI_BLOCK_CHANGE, Server.TAB_COMPLETE, Server.COMMANDS, Server.PING, Server.CLOSE_WINDOW, Server.OPEN_WINDOW,
				Server.WINDOW_ITEMS, Server.WINDOW_DATA, Server.SET_SLOT, Server.SET_COOLDOWN, Server.CUSTOM_PAYLOAD, Server.CUSTOM_SOUND_EFFECT, Server.KICK_DISCONNECT,
				Server.ENTITY_STATUS, Server.NBT_QUERY, Server.EXPLOSION, Server.UNLOAD_CHUNK, Server.GAME_STATE_CHANGE, Server.KEEP_ALIVE, Server.MAP_CHUNK, Server.WORLD_EVENT,
				Server.WORLD_PARTICLES, Server.LOGIN, Server.MAP, Server.ENTITY, Server.REL_ENTITY_MOVE, Server.REL_ENTITY_MOVE_LOOK, Server.REL_ENTITY_LOOK, Server.VEHICLE_MOVE,
				Server.OPEN_SIGN_EDITOR, Server.AUTO_RECIPE, Server.ABILITIES, Server.COMBAT_EVENT, Server.PLAYER_INFO, Server.LOOK_AT, Server.POSITION, Server.BED, Server.RECIPES,
				Server.ENTITY_DESTROY, Server.REMOVE_ENTITY_EFFECT, Server.RESOURCE_PACK_SEND, Server.RESPAWN, Server.ENTITY_HEAD_ROTATION, Server.SELECT_ADVANCEMENT_TAB,
				Server.WORLD_BORDER, Server.CAMERA, Server.HELD_ITEM_SLOT, Server.SCOREBOARD_DISPLAY_OBJECTIVE, Server.ENTITY_METADATA, Server.ATTACH_ENTITY, Server.ENTITY_VELOCITY,
				Server.ENTITY_EQUIPMENT, Server.EXPERIENCE, Server.UPDATE_HEALTH, Server.SCOREBOARD_OBJECTIVE, Server.MOUNT, Server.SCOREBOARD_TEAM, Server.SCOREBOARD_SCORE,
				Server.SPAWN_POSITION, Server.UPDATE_TIME, Server.TITLE, Server.STOP_SOUND, Server.NAMED_SOUND_EFFECT, Server.PLAYER_LIST_HEADER_FOOTER, Server.COLLECT,
				Server.ENTITY_TELEPORT, Server.ADVANCEMENTS, Server.UPDATE_ATTRIBUTES, Server.ENTITY_EFFECT, Server.RECIPE_UPDATE, Server.TAGS)) {
			playOut.put(i++, type);
		}
		i = 0;
		for (EntityType type : Arrays.asList(EntityType.AREA_EFFECT_CLOUD, EntityType.ARMOR_STAND, EntityType.ARROW, EntityType.BAT, EntityType.BLAZE, EntityType.BOAT,
				EntityType.CAVE_SPIDER, EntityType.CHICKEN, EntityType.COD, EntityType.COW, EntityType.CREEPER, EntityType.DONKEY, EntityType.DOLPHIN, EntityType.DRAGON_FIREBALL,
				EntityType.DROWNED, EntityType.ELDER_GUARDIAN, EntityType.ENDER_CRYSTAL, EntityType.ENDER_DRAGON, EntityType.ENDERMAN, EntityType.ENDERMITE, EntityType.EVOKER_FANGS,
				EntityType.EVOKER, EntityType.EXPERIENCE_ORB, EntityType.EYE_OF_ENDER, EntityType.FALLING_BLOCK, EntityType.FIREWORK, EntityType.GHAST, EntityType.GIANT, EntityType.GUARDIAN,
				EntityType.HORSE, EntityType.HUSK, EntityType.ILLUSIONER, EntityType.DROPPED_ITEM, EntityType.ITEM_FRAME, EntityType.FIREBALL, EntityType.LEASH_KNOT, EntityType.LLAMA,
				EntityType.LLAMA_SPIT, EntityType.MAGMA_CUBE, EntityType.MINECART, EntityType.MINECART_CHEST, EntityType.MINECART_COMMAND_BLOCK, EntityType.MINECART_FURNACE,
				EntityType.MINECART_HOPPER, EntityType.MINECART_MOB_SPAWNER, EntityType.MINECART_TNT, EntityType.MULE, EntityType.MOOSHROOM, EntityType.OCELOT, EntityType.PAINTING,
				EntityType.PARROT, EntityType.PIG, EntityType.PUFFER_FISH, EntityType.PIG_ZOMBIE, EntityType.POLAR_BEAR, EntityType.PRIMED_TNT, EntityType.RABBIT, EntityType.SALMON,
				EntityType.SHEEP, EntityType.SHULKER, EntityType.SHULKER_BULLET, EntityType.SILVERFISH, EntityType.SKELETON, EntityType.SKELETON_HORSE, EntityType.SLIME,
				EntityType.SMALL_FIREBALL, EntityType.SNOW_GOLEM, EntityType.SNOW_BALL, EntityType.SPECTRAL_ARROW, EntityType.SPIDER, EntityType.SQUID, EntityType.STRAY,
				EntityType.TROPICAL_FISH, EntityType.TURTLE, EntityType.EGG, EntityType.ENDER_PEARL, EntityType.EXP_BOTTLE, EntityType.SPLASH_POTION, EntityType.VEX, EntityType.VILLAGER,
				EntityType.IRON_GOLEM, EntityType.VINDICATOR, EntityType.WITCH, EntityType.WITHER, EntityType.WITHER_SKELETON, EntityType.WITHER_SKULL, EntityType.WOLF, EntityType.ZOMBIE,
				EntityType.ZOMBIE_HORSE, EntityType.ZOMBIE_VILLAGER, EntityType.PHANTOM, EntityType.LIGHTNING, EntityType.PLAYER, EntityType.FISHING_HOOK, EntityType.TRIDENT)) {
			entityTypes.put(i++, type);
		}
		i = 0;
		for (String type : Arrays.asList("air", "stone", "granite", "polished_granite", "diorite", "polished_diorite", "andesite", "polished_andesite", "grass_block", "dirt", "coarse_dirt",
				"podzol", "cobblestone", "oak_planks", "spruce_planks", "birch_planks", "jungle_planks", "acacia_planks", "dark_oak_planks", "oak_sapling", "spruce_sapling", "birch_sapling",
				"jungle_sapling", "acacia_sapling", "dark_oak_sapling", "bedrock", "water", "bubble_column", "lava", "sand", "red_sand", "gravel", "gold_ore", "iron_ore", "coal_ore",
				"oak_log", "spruce_log", "birch_log", "jungle_log", "acacia_log", "dark_oak_log", "stripped_oak_log", "stripped_spruce_log", "stripped_birch_log", "stripped_jungle_log",
				"stripped_acacia_log", "stripped_dark_oak_log", "oak_wood", "spruce_wood", "birch_wood", "jungle_wood", "acacia_wood", "dark_oak_wood", "stripped_oak_wood",
				"stripped_spruce_wood", "stripped_birch_wood", "stripped_jungle_wood", "stripped_acacia_wood", "stripped_dark_oak_wood", "oak_leaves", "spruce_leaves", "birch_leaves",
				"jungle_leaves", "acacia_leaves", "dark_oak_leaves", "sponge", "wet_sponge", "glass", "lapis_ore", "lapis_block", "dispenser", "sandstone", "chiseled_sandstone",
				"cut_sandstone", "note_block", "white_bed", "orange_bed", "magenta_bed", "light_blue_bed", "yellow_bed", "lime_bed", "pink_bed", "gray_bed", "light_gray_bed", "cyan_bed",
				"purple_bed", "blue_bed", "brown_bed", "green_bed", "red_bed", "black_bed", "powered_rail", "detector_rail", "sticky_piston", "cobweb", "grass", "fern", "dead_bush",
				"seagrass", "tall_seagrass", "piston", "piston_head", "white_wool", "orange_wool", "magenta_wool", "light_blue_wool", "yellow_wool", "lime_wool", "pink_wool", "gray_wool",
				"light_gray_wool", "cyan_wool", "purple_wool", "blue_wool", "brown_wool", "green_wool", "red_wool", "black_wool", "moving_piston", "dandelion", "poppy", "blue_orchid",
				"allium", "azure_bluet", "red_tulip", "orange_tulip", "white_tulip", "pink_tulip", "oxeye_daisy", "brown_mushroom", "red_mushroom", "gold_block", "iron_block", "oak_slab",
				"spruce_slab", "birch_slab", "jungle_slab", "acacia_slab", "dark_oak_slab", "stone_slab", "sandstone_slab", "petrified_oak_slab", "cobblestone_slab", "brick_slab",
				"stone_brick_slab", "nether_brick_slab", "quartz_slab", "red_sandstone_slab", "purpur_slab", "prismarine_slab", "prismarine_brick_slab", "dark_prismarine_slab",
				"smooth_stone", "smooth_sandstone", "smooth_quartz", "smooth_red_sandstone", "bricks", "tnt", "bookshelf", "mossy_cobblestone", "obsidian", "torch", "wall_torch", "fire",
				"spawner", "oak_stairs", "chest", "redstone_wire", "diamond_ore", "diamond_block", "crafting_table", "wheat", "farmland", "furnace", "sign", "oak_door", "spruce_door",
				"birch_door", "jungle_door", "acacia_door", "dark_oak_door", "ladder", "rail", "cobblestone_stairs", "wall_sign", "lever", "stone_pressure_plate", "iron_door",
				"oak_pressure_plate", "spruce_pressure_plate", "birch_pressure_plate", "jungle_pressure_plate", "acacia_pressure_plate", "dark_oak_pressure_plate", "redstone_ore",
				"redstone_torch", "redstone_wall_torch", "stone_button", "snow", "ice", "snow_block", "cactus", "clay", "sugar_cane", "jukebox", "oak_fence", "spruce_fence", "birch_fence",
				"jungle_fence", "dark_oak_fence", "acacia_fence", "pumpkin", "netherrack", "soul_sand", "glowstone", "nether_portal", "carved_pumpkin", "jack_o_lantern", "cake", "repeater",
				"oak_trapdoor", "spruce_trapdoor", "birch_trapdoor", "jungle_trapdoor", "acacia_trapdoor", "dark_oak_trapdoor", "infested_stone", "infested_cobblestone",
				"infested_stone_bricks", "infested_mossy_stone_bricks", "infested_cracked_stone_bricks", "infested_chiseled_stone_bricks", "stone_bricks", "mossy_stone_bricks",
				"cracked_stone_bricks", "chiseled_stone_bricks", "brown_mushroom_block", "red_mushroom_block", "mushroom_stem", "iron_bars", "glass_pane", "melon", "attached_pumpkin_stem",
				"attached_melon_stem", "pumpkin_stem", "melon_stem", "vine", "oak_fence_gate", "spruce_fence_gate", "birch_fence_gate", "jungle_fence_gate", "dark_oak_fence_gate",
				"acacia_fence_gate", "brick_stairs", "stone_brick_stairs", "mycelium", "lily_pad", "nether_bricks", "nether_brick_fence", "nether_brick_stairs", "nether_wart",
				"enchanting_table", "brewing_stand", "cauldron", "end_portal", "end_portal_frame", "end_stone", "dragon_egg", "redstone_lamp", "cocoa", "sandstone_stairs", "emerald_ore",
				"ender_chest", "tripwire_hook", "tripwire", "emerald_block", "spruce_stairs", "birch_stairs", "jungle_stairs", "command_block", "beacon", "cobblestone_wall",
				"mossy_cobblestone_wall", "flower_pot", "potted_poppy", "potted_blue_orchid", "potted_allium", "potted_azure_bluet", "potted_red_tulip", "potted_orange_tulip",
				"potted_white_tulip", "potted_pink_tulip", "potted_oxeye_daisy", "potted_dandelion", "potted_oak_sapling", "potted_spruce_sapling", "potted_birch_sapling",
				"potted_jungle_sapling", "potted_acacia_sapling", "potted_dark_oak_sapling", "potted_red_mushroom", "potted_brown_mushroom", "potted_dead_bush", "potted_fern",
				"potted_cactus", "carrots", "potatoes", "oak_button", "spruce_button", "birch_button", "jungle_button", "acacia_button", "dark_oak_button", "skeleton_wall_skull",
				"skeleton_skull", "wither_skeleton_wall_skull", "wither_skeleton_skull", "zombie_wall_head", "zombie_head", "player_wall_head", "player_head", "creeper_wall_head",
				"creeper_head", "dragon_wall_head", "dragon_head", "anvil", "chipped_anvil", "damaged_anvil", "trapped_chest", "light_weighted_pressure_plate",
				"heavy_weighted_pressure_plate", "comparator", "daylight_detector", "redstone_block", "nether_quartz_ore", "hopper", "quartz_block", "quartz_pillar", "chiseled_quartz_block",
				"quartz_stairs", "activator_rail", "dropper", "white_terracotta", "orange_terracotta", "magenta_terracotta", "light_blue_terracotta", "yellow_terracotta", "lime_terracotta",
				"pink_terracotta", "gray_terracotta", "light_gray_terracotta", "cyan_terracotta", "purple_terracotta", "blue_terracotta", "brown_terracotta", "green_terracotta",
				"red_terracotta", "black_terracotta", "barrier", "iron_trapdoor", "hay_block", "white_carpet", "orange_carpet", "magenta_carpet", "light_blue_carpet", "yellow_carpet",
				"lime_carpet", "pink_carpet", "gray_carpet", "light_gray_carpet", "cyan_carpet", "purple_carpet", "blue_carpet", "brown_carpet", "green_carpet", "red_carpet", "black_carpet",
				"terracotta", "coal_block", "packed_ice", "blue_ice", "acacia_stairs", "dark_oak_stairs", "slime_block", "sunflower", "lilac", "rose_bush", "peony", "tall_grass",
				"large_fern", "white_stained_glass", "orange_stained_glass", "magenta_stained_glass", "light_blue_stained_glass", "yellow_stained_glass", "lime_stained_glass",
				"pink_stained_glass", "gray_stained_glass", "light_gray_stained_glass", "cyan_stained_glass", "purple_stained_glass", "blue_stained_glass", "brown_stained_glass",
				"green_stained_glass", "red_stained_glass", "black_stained_glass", "white_stained_glass_pane", "orange_stained_glass_pane", "magenta_stained_glass_pane",
				"light_blue_stained_glass_pane", "yellow_stained_glass_pane", "lime_stained_glass_pane", "pink_stained_glass_pane", "gray_stained_glass_pane",
				"light_gray_stained_glass_pane", "cyan_stained_glass_pane", "purple_stained_glass_pane", "blue_stained_glass_pane", "brown_stained_glass_pane", "green_stained_glass_pane",
				"red_stained_glass_pane", "black_stained_glass_pane", "prismarine", "prismarine_bricks", "dark_prismarine", "prismarine_stairs", "prismarine_brick_stairs",
				"dark_prismarine_stairs", "sea_lantern", "white_banner", "orange_banner", "magenta_banner", "light_blue_banner", "yellow_banner", "lime_banner", "pink_banner", "gray_banner",
				"light_gray_banner", "cyan_banner", "purple_banner", "blue_banner", "brown_banner", "green_banner", "red_banner", "black_banner", "white_wall_banner", "orange_wall_banner",
				"magenta_wall_banner", "light_blue_wall_banner", "yellow_wall_banner", "lime_wall_banner", "pink_wall_banner", "gray_wall_banner", "light_gray_wall_banner",
				"cyan_wall_banner", "purple_wall_banner", "blue_wall_banner", "brown_wall_banner", "green_wall_banner", "red_wall_banner", "black_wall_banner", "red_sandstone",
				"chiseled_red_sandstone", "cut_red_sandstone", "red_sandstone_stairs", "end_rod", "chorus_plant", "chorus_flower", "purpur_block", "purpur_pillar", "purpur_stairs",
				"end_stone_bricks", "beetroots", "grass_path", "end_gateway", "repeating_command_block", "chain_command_block", "frosted_ice", "magma_block", "nether_wart_block",
				"red_nether_bricks", "bone_block", "structure_void", "observer", "shulker_box", "white_shulker_box", "orange_shulker_box", "magenta_shulker_box", "light_blue_shulker_box",
				"yellow_shulker_box", "lime_shulker_box", "pink_shulker_box", "gray_shulker_box", "light_gray_shulker_box", "cyan_shulker_box", "purple_shulker_box", "blue_shulker_box",
				"brown_shulker_box", "green_shulker_box", "red_shulker_box", "black_shulker_box", "white_glazed_terracotta", "orange_glazed_terracotta", "magenta_glazed_terracotta",
				"light_blue_glazed_terracotta", "yellow_glazed_terracotta", "lime_glazed_terracotta", "pink_glazed_terracotta", "gray_glazed_terracotta", "light_gray_glazed_terracotta",
				"cyan_glazed_terracotta", "purple_glazed_terracotta", "blue_glazed_terracotta", "brown_glazed_terracotta", "green_glazed_terracotta", "red_glazed_terracotta",
				"black_glazed_terracotta", "white_concrete", "orange_concrete", "magenta_concrete", "light_blue_concrete", "yellow_concrete", "lime_concrete", "pink_concrete",
				"gray_concrete", "light_gray_concrete", "cyan_concrete", "purple_concrete", "blue_concrete", "brown_concrete", "green_concrete", "red_concrete", "black_concrete",
				"white_concrete_powder", "orange_concrete_powder", "magenta_concrete_powder", "light_blue_concrete_powder", "yellow_concrete_powder", "lime_concrete_powder",
				"pink_concrete_powder", "gray_concrete_powder", "light_gray_concrete_powder", "cyan_concrete_powder", "purple_concrete_powder", "blue_concrete_powder",
				"brown_concrete_powder", "green_concrete_powder", "red_concrete_powder", "black_concrete_powder", "kelp_plant", "kelp", "dried_kelp_block", "turtle_egg", "void_air",
				"cave_air", "dead_tube_coral_block", "dead_brain_coral_block", "dead_bubble_coral_block", "dead_fire_coral_block", "dead_horn_coral_block", "tube_coral_block",
				"brain_coral_block", "bubble_coral_block", "fire_coral_block", "horn_coral_block", "tube_coral", "brain_coral", "bubble_coral", "fire_coral", "horn_coral", "dead_tube_coral",
				"dead_brain_coral", "dead_bubble_coral", "dead_fire_coral", "dead_horn_coral", "tube_coral_wall_fan", "brain_coral_wall_fan", "bubble_coral_wall_fan", "fire_coral_wall_fan",
				"horn_coral_wall_fan", "tube_coral_fan", "brain_coral_fan", "bubble_coral_fan", "fire_coral_fan", "horn_coral_fan", "sea_pickle", "conduit", "dead_tube_coral_wall_fan",
				"dead_brain_coral_wall_fan", "dead_bubble_coral_wall_fan", "dead_fire_coral_wall_fan", "dead_horn_coral_wall_fan", "dead_tube_coral_fan", "dead_brain_coral_fan",
				"dead_bubble_coral_fan", "dead_fire_coral_fan", "dead_horn_coral_fan", "structure_block")) {
			materials.put(i++, type);
		}
		
		log();
	}
}