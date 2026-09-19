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
const checkInventory = (items) => items.length;
const calculateTotalGold = (gold, reward) => gold + reward;

console.log(`--- Game Overview ---`);
console.log(`1. Game Title: ${gameTitle}`);
console.log(`2. Server Region: ${serverRegion}`);
console.log(`3. Player Name: ${playerName}`);
console.log(`4. Player Level: ${playerLevel}`);
console.log(`5. Health Status: ${playerHealth} / ${maxHealth}`);
console.log(`6. Gold Balance: ${playerGold} coins`);
console.log(`7. Experience Points: ${currentEXP}`);
console.log(`8. Current Quest State: ${questStatus}`);
console.log(`9. Guild Affiliation: ${guildName}`);
console.log(`10. Weapon Durability: ${weaponDurability}%`);

const [primaryWeapon, secondaryWeapon] = inventoryItem;
const [firstEnemy, secondEnemy] = enemyList;
const [itemOne, itemTwo, ...remainingItems] = inventoryItem;

const {strenth} = playerStat;
const {agility, intelligence} = playerStat;
const {strength: playerStrength, stamina: playerStamina} = playerStat;

const advancedPlayerStats = {
  ...playerStat,
  luck: 5,
  charisma: 8
};
const completeCharacterProfile = {
  ...advancedPlayerStats,
  name: playerName,
  level: playerLevel
};

const discountedStorePrices = storePrices.map(price => price * 0.9);
const uppercaseInventoryItems = inventoryItem.map(item => item.toUpperCase());

 const affordablePrices = storePrices.filter(price => price <= 30);
 const longItemsNames = inventoryItem.filter(item => item.length > 5);

 const externalUserData = {user: {profile: {role : "Administrator", title: "Grandmaster"}}};
 const guildData = {guildInfo: {leader: {name: "Athan", level: 99}}};
 