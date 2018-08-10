package com.oasisfeng.nevo.decorators.wechat;

import static android.os.Build.VERSION.SDK_INT;
import static android.os.Build.VERSION_CODES.O_MR1;

/**
 * Static map for WeChat Emoji markers
 *
 * Created by Oasis on 2018-8-9.
 */
public class EmojiMap {

	// Pull Request is welcome. (columns are split by "tab" for visual alignment)
	// Proper emoji is needed for commented lines.
	static final String[][] MAP = new String[][] {
			{ "OK",			"OK",			"👌" },
			{ "耶",			"Yeah!",		"✌" },
			{ "嘘",			"Silent",		"🤫" },
			{ "晕",			"Dizzy",		"😲" },
			{ "衰",			"BadLuck",		"😳" },
			{ "色",			"Drool",		"😍" },
			{ "囧",			"Tension",		"☺" },
			{ "鸡",			"Chick",		"🐥" },
			{ "强",			"Thumbs Up",	"👍" },
			{ "弱",			"Weak",			"👎" },
			{ "睡",			"Sleep",		"😴" },
			{ "吐",			"Puke",			"🤢" },
			{ "困",			"Drowsy",		"😪" },
			{ "發",			"Rich",			"🀅" },
			{ "微笑",		"Smile",		"😃" },
			{ "撇嘴",		"Grimace",		"😖" },
			{ "发呆",		"Scowl",		"😳" },
			{ "得意",		"CoolGuy",		"😎" },
			{ "流泪",		"Sob",			"😭" },
			{ "害羞",		"Shy",			"☺" },
			{ "闭嘴",		"Shutup",		"🤐" },
			{ "大哭",		"Cry",			"😣" },
			{ "尴尬",		"Awkward",		"😰" },
			{ "发怒",		"Angry",		"😡" },
			{ "调皮",		"Tongue",		"😜" },
			{ "呲牙",		"Grin",			"😁" },
			{ "惊讶",		"Surprise",		"😱" },
			{ "难过",		"Frown",		"🙁" },
			{ "抓狂",		"Scream",		"😫" },
			{ "偷笑",		"Chuckle",		"😅" },
			{ "愉快",		"Joyful",		"☺" },
			{ "白眼",		"Slight",		"🙄" },
			{ "傲慢",		"Smug",			"😕" },
			{ "惊恐",		"Panic",		"😱" },
			{ "流汗",		"Sweat",		"😓" },
			{ "憨笑",		"Laugh",		"😄" },
			{ "悠闲",		"Loafer",		"😌" },
			{ "奋斗",		"Strive",		"💪" },
			{ "咒骂",		"Scold",		"😤" },
			{ "疑问",		"Doubt",		"❓" },
			{ "骷髅",		"Skull",		"💀" },
			{ "敲打",		"Hammer",		"👊" },
			{ "捂脸",		"Facepalm",		"🤦" },
			{ "奸笑",		"Smirk",		"😏" },
			{ "皱眉",		"Concerned",	"😟" },
			{ "红包",		"Packet",		SDK_INT > O_MR1 ? "🧧"/* Emoji 11+ */: "💰" },
			{ "小狗",		"Pup",			"🐶" },
			{ "再见",		"Bye",			"🙋" },
			{ "擦汗",		"Relief",		"😥" },
			{ "鼓掌",		"Clap",			"👏" },
			{ "坏笑",		"Trick",		"👻" },
			{ "哈欠",		"Yawn",			"😪" },
			{ "鄙视",		"Lookdown",		"😒" },
			{ "委屈",		"Wronged",		"😣" },
			{ "阴险",		"Sly",			"😈" },
			{ "亲亲",		"Kiss",			"😘" },
			{ "菜刀",		"Cleaver",		"🔪" },
			{ "西瓜",		"Melon",		"🍉" },
			{ "啤酒",		"Beer",			"🍺" },
			{ "咖啡",		"Coffee",		"☕" },
			{ "猪头",		"Pig",			"🐷" },
			{ "玫瑰",		"Rose",			"🌹" },
			{ "凋谢",		"Wilt",			"🥀" },
			{ "嘴唇",		"Lip",			"💋" },
			{ "爱心",		"Heart",		"❤" },
			{ "心碎",		"BrokenHeart",	"💔" },
			{ "蛋糕",		"Cake",			"🎂" },
			{ "炸弹",		"Bomb",			"💣" },
			{ "便便",		"Poop",			"💩" },
			{ "月亮",		"Moon",			"🌃" },
			{ "太阳",		"Sun",			"🌞" },
			{ "拥抱",		"Hug",			"🤗" },
			{ "握手",		"Shake",		"🤝" },
			{ "胜利",		"Victory",		"✌" },
			{ "抱拳",		"Salute",		"🙏" },
			{ "拳头",		"Fist",			"👊" },
			{ "跳跳",		"Waddle",		"💃" },
			{ "发抖",		"Tremble",		"🙇" },
			{ "怄火",		"Aaagh!",		"😡" },
			{ "转圈",		"Twirl",		"🕺" },
			{ "蜡烛",		"Candle",		"🕯️" },
//			{ "勾引",		"Beckon",		""},
//			{ "嘿哈",		"Hey",			"" },
//			{ "机智",		"Smart",		"" },
//			{ "抠鼻",		"DigNose",		"" },
//			{ "可怜",		"Whimper",		"" },
			{ "快哭了",		"Puling",		"😔" },
//			{ "左哼哼",		"Bah！L",		"" },
//			{ "右哼哼",		"Bah！R",		"" },
			{ "破涕为笑",	"Lol",			"😂" },
	};
}
