let playerName = "Russell";
let playerLevel = 5;
let playerHealth = 150;
let playerGold = 300;
let currentEXP = 1200;
let isAlive = true;
let questStatus = "Active";
let weaponDurability = 93;
let potionCount = 5;
let activeBuffsCount = 2;

const maxHealth = 150;
const gameTitle = "Chronicles of Code";
const baseDamage = 15;
const inventoryItem = ["Sword", "Shield", "Health Potion", "Mana Potion"];
const enemyList = ["Goblin", "Orc", "Dragon", "Troll"];
const playerStat = {
  strength: 20,
  agility: 15,
  intelligence: 10,
  stamina: 25
};
const storePrices = [100, 150, 200, 250];
const baseMultiplier = 1.25;
const guildName = "Order of the Syntax";
const serverRegion = "Indo-Pacific";

const calculateDamage = (base, multiplier) => base * multiplier;
const formatStatus = (name, lvl) => `Hero ${name} is level ${lvl}`;
const applyBuff = (hp, boost) => hp + boost;
