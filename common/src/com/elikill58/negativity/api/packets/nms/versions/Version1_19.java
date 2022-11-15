package com.elikill58.negativity.api.packets.nms.versions;

import java.util.Arrays;

import com.elikill58.negativity.api.packets.PacketType.*;
import com.elikill58.negativity.api.packets.nms.NamedVersion;

public class Version1_19 extends NamedVersion {

	public Version1_19() {
		int i = 0;
		for (Client type : Arrays.asList(Client.TELEPORT_ACCEPT, Client.TILE_NBT_QUERY, Client.DIFFICULTY_CHANGE,
				Client.CHAT_COMMAND, Client.CHAT, Client.CHAT_PREVIEW, Client.CLIENT_COMMAND, 
				Client.SETTINGS, Client.TAB_COMPLETE, Client.ENCHANT_ITEM, Client.WINDOW_CLICK, Client.CLOSE_WINDOW,
				Client.CUSTOM_PAYLOAD, Client.BEDIT, Client.ENTITY_NBT_QUERY, Client.USE_ENTITY, Client.JIGSAW_GENERATE,
				Client.KEEP_ALIVE, Client.DIFFICULTY_LOCK, Client.POSITION, Client.POSITION_LOOK, Client.LOOK,
				Client.GROUND, Client.VEHICLE_MOVE, Client.BOAT_MOVE, Client.PICK_ITEM, Client.AUTO_RECIPE,
				Client.ABILITIES, Client.BLOCK_DIG, Client.ENTITY_ACTION, Client.STEER_VEHICLE, Client.PONG,
				Client.RECIPE_SETTINGS, Client.RECIPE_DISPLAYED, Client.ITEM_NAME, Client.RESOURCE_PACK_STATUS,
				Client.ADVANCEMENTS, Client.TR_SEL, Client.BEACON, Client.HELD_ITEM_SLOT, Client.SET_COMMAND_BLOCK,
				Client.SET_COMMAND_MINECART, Client.SET_CREATIVE_SLOT, Client.SET_JIGSAW, Client.STRUCT,
				Client.UPDATE_SIGN, Client.ARM_ANIMATION, Client.SPECTATE, Client.BLOCK_PLACE, Client.USE_ITEM)) {
			playIn.put(i++, type);
		}
		i = 0;
		for (Server type : Arrays.asList(Server.SPAWN_ENTITY, Server.SPAWN_ENTITY_EXPERIENCE_ORB, Server.SPAWN_PLAYER,
				Server.ANIMATION, Server.STATISTIC, Server.BLOCK_CHANGED_ACK, Server.BLOCK_BREAK_ANIMATION,
				Server.TILE_ENTITY_DATA, Server.BLOCK_ACTION, Server.BLOCK_CHANGE, Server.BOSS,
				Server.SERVER_DIFFICULTY, Server.CHAT_PREVIEW, Server.CLEAR_TITLE, Server.TAB_COMPLETE, Server.COMMANDS,
				Server.CLOSE_WINDOW, Server.WINDOW_ITEMS, Server.WINDOW_DATA, Server.SET_SLOT, Server.SET_COOLDOWN,
				Server.CUSTOM_PAYLOAD, Server.CUSTOM_SOUND_EFFECT, Server.KICK_DISCONNECT, Server.ENTITY_STATUS,
				Server.EXPLOSION, Server.UNLOAD_CHUNK, Server.GAME_STATE_CHANGE, Server.OPEN_WINDOW_HORSE,
				Server.INITIALIZE_BORDER, Server.KEEP_ALIVE, Server.LEVEL_CHUNK_LIGHT, Server.WORLD_EVENT,
				Server.WORLD_PARTICLES, Server.LIGHT_UPDATE, Server.LOGIN, Server.MAP, Server.OPEN_WINDOW_MERCHANT,
				Server.REL_ENTITY_MOVE, Server.REL_ENTITY_MOVE_LOOK, Server.REL_ENTITY_LOOK, Server.VEHICLE_MOVE,
				Server.OPEN_BOOK, Server.OPEN_WINDOW, Server.OPEN_SIGN_EDITOR, Server.PING, Server.AUTO_RECIPE,
				Server.ABILITIES, Server.CHAT, Server.COMBAT_END_EVENT, Server.COMBAT_ENTER_EVENT,
				Server.COMBAT_KILL_EVENT, Server.PLAYER_INFO, Server.LOOK_AT, Server.POSITION, Server.RECIPES,
				Server.ENTITY_DESTROY, Server.REMOVE_ENTITY_EFFECT, Server.RESOURCE_PACK_SEND, Server.RESPAWN,
				Server.ENTITY_HEAD_ROTATION, Server.MULTI_BLOCK_CHANGE, Server.SELECT_ADVANCEMENT_TAB, Server.SERVER_DATA,
				Server.ACTION_BAR_TEXT, Server.SET_ACTION_BAR, Server.SET_BORDER_CENTER, Server.SET_BORDER_LERP_SIZE,
				Server.SET_BORDER_SIZE, Server.SET_BORDER_WARNING_DELAY, Server.SET_BORDER_WARNING_DISTANCE,
				Server.CAMERA, Server.HELD_ITEM_SLOT, Server.VIEW_CENTRE, Server.VIEW_DISTANCE, Server.SPAWN_POSITION,
				Server.SET_DISPLAY_CHAT_PREVIEW, Server.SCOREBOARD_DISPLAY_OBJECTIVE, Server.ENTITY_METADATA,
				Server.ATTACH_ENTITY, Server.ENTITY_VELOCITY, Server.ENTITY_EQUIPMENT, Server.EXPERIENCE,
				Server.UPDATE_HEALTH, Server.SCOREBOARD_OBJECTIVE, Server.MOUNT, Server.SCOREBOARD_TEAM,
				Server.SCOREBOARD_SCORE, Server.SIMULATION_DISTANCE, Server.SET_SUBTITLE_TEXT, Server.UPDATE_TIME,
				Server.SET_TITLE_TEXT, Server.SET_TITLE_ANIMATION, Server.ENTITY_SOUND, Server.NAMED_SOUND_EFFECT,
				Server.STOP_SOUND, Server.SYSTEM_CHAT, Server.PLAYER_LIST_HEADER_FOOTER, Server.NBT_QUERY,
				Server.COLLECT, Server.ENTITY_TELEPORT, Server.ADVANCEMENTS, Server.UPDATE_ATTRIBUTES,
				Server.ENTITY_EFFECT, Server.RECIPE_UPDATE, Server.TAGS)) {
			playOut.put(i++, type);
		}
	}
}
