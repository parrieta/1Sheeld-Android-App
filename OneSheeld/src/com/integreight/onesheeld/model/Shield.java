package com.integreight.onesheeld.model;

import com.integreight.onesheeld.shields.ControllerParent;

public class Shield {
	public byte id;
	public String name;
	public int itemBackgroundColor;
	public int symbolId;
	public boolean mainActivitySelection;
	public static Shield shieldsActivitySelection;
	public static boolean isConnected = false;
	public boolean isReleasable = true;
	public int isInvalidatable = 0;
	public Class<? extends ControllerParent<?>> shieldType;
	public int position = 0;
	public String tag;

	public Shield(byte id, String tag, String name, int mainImageStripId,
			int symbolId, boolean mainActivitySelection,
			Class<? extends ControllerParent<?>> shieldType) {
		this.id = id;
		this.name = name;
		this.itemBackgroundColor = mainImageStripId;
		this.symbolId = symbolId;
		this.mainActivitySelection = mainActivitySelection;
		this.shieldType = shieldType;
		this.tag = tag;
	}

	public Shield(byte id, String tag, String name, int mainImageStripId,
			int symbolId, boolean mainActivitySelection,
			Class<? extends ControllerParent<?>> shieldType, int isInvalidatable) {
		this.id = id;
		this.name = name;
		this.itemBackgroundColor = mainImageStripId;
		this.symbolId = symbolId;
		this.mainActivitySelection = mainActivitySelection;
		this.shieldType = shieldType;
		this.isInvalidatable = isInvalidatable;
		this.tag = tag;
	}

	public Shield(byte id, String tag, String name, int mainImageStripId,
			int symbolId, boolean mainActivitySelection,
			Class<? extends ControllerParent<?>> shieldType,
			boolean isReleasable) {
		this.id = id;
		this.name = name;
		this.itemBackgroundColor = mainImageStripId;
		this.symbolId = symbolId;
		this.mainActivitySelection = mainActivitySelection;
		this.shieldType = shieldType;
		this.isReleasable = isReleasable;
		this.tag = tag;
	}

	public Shield(byte id, String tag, String name, int mainImageStripId,
			int symbolId, boolean mainActivitySelection,
			Class<? extends ControllerParent<?>> shieldType,
			boolean isReleasable, int isInvalidatable) {
		this.id = id;
		this.name = name;
		this.itemBackgroundColor = mainImageStripId;
		this.symbolId = symbolId;
		this.mainActivitySelection = mainActivitySelection;
		this.shieldType = shieldType;
		this.isReleasable = isReleasable;
		this.isInvalidatable = isInvalidatable;
		this.tag = tag;
	}

}
