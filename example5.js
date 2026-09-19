// ==========================================
// 10 LET VARIABLES
// ==========================================
let playerName = "Aria";
let playerLevel = 5;
let playerHealth = 100;
let playerGold = 250;
let currentXP = 1200;
let isAlive = true;
let questStatus = "Active";
let weaponDurability = 85;
let potionCount = 4;
let activeBuffsCount = 2;

// ==========================================
// 10 CONST VARIABLES
// ==========================================
const maxHealth = 100;
const gameTitle = "Chronicles of Code";
const baseDamage = 15;
const inventoryItems = ["Sword", "Shield", "Health Potion", "Mana Potion", "Scroll"];
const enemyList = ["Goblin", "Orc", "Dragon"];
const playerStats = { strength: 18, agility: 14, intelligence: 10 };
const storePrices = [50, 30, 20, 15, 100];
const baseMultiplier = 1.25;
const guildName = "Syntax Slayers";
const serverRegion = "US-East";

// ==========================================
// 5 ARROW FUNCTIONS
// ==========================================
const calculateDamage = (base, multiplier) => base * multiplier;
const formatStatus = (name, lvl) => `Hero ${name} is level ${lvl}`;
const applyBuff = (hp, boost) => hp + boost;
const checkInventory = (items) => items.length;
const calculateTotalGold = (gold, reward) => gold + reward;

// ==========================================
// 10 TEMPLATE LITERALS
// ==========================================
console.log(`--- Game Overview ---`);
console.log(`1. Game Title: ${gameTitle}`);
console.log(`2. Server Region: ${serverRegion}`);
console.log(`3. Player Name: ${playerName}`);
console.log(`4. Player Level: ${playerLevel}`);
console.log(`5. Health Status: ${playerHealth} / ${maxHealth}`);
console.log(`6. Gold Balance: ${playerGold} coins`);
console.log(`7. Experience Points: ${currentXP}`);
console.log(`8. Current Quest State: ${questStatus}`);
console.log(`9. Guild Affiliation: ${guildName}`);
console.log(`10. Weapon Durability: ${weaponDurability}%`);

// ==========================================
// 3 DESTRUCTURED ARRAYS
// ==========================================
const [primaryWeapon, secondaryWeapon] = inventoryItems;
const [firstEnemy, secondEnemy] = enemyList;
const [itemOne, itemTwo, ...remainingItems] = inventoryItems;

// ==========================================
// 3 DESTRUCTURED OBJECT LITERALS
// ==========================================
const { strength } = playerStats;
const { agility, intelligence } = playerStats;
const { strength: heroStrength, agility: heroAgility } = playerStats;

// ==========================================
// 2 ARRAYS USING SPREAD OPERATORS
// ==========================================
const extendedInventory = [...inventoryItems, "Magic Ring", "Spellbook"];
const combinedEnemies = [...enemyList, "Boss", "Mini-Boss"];

// ==========================================
// 2 OBJECT LITERALS USING SPREAD OPERATORS
// ==========================================
const advancedPlayerStats = { ...playerStats, stamina: 20 };
const completeCharacterProfile = { ...advancedPlayerStats, name: playerName, level: playerLevel };

// ==========================================
// 2 ARRAYS USING .map()
// ==========================================
const discountedPrices = storePrices.map(price => price * 0.9);
const uppercaseItems = inventoryItems.map(item => item.toUpperCase());

// ==========================================
// 2 ARRAYS USING .filter()
// ==========================================
const affordablePrices = storePrices.filter(price => price <= 30);
const longItemNames = inventoryItems.filter(item => item.length > 5);

// ==========================================
// 2 OBJECT LITERALS USING OPTIONAL CHAINING
// ==========================================
const externalUserData = { user: { profile: { role: "Administrator", title: "Grandmaster" } } };
const guildData = { guildInfo: { leader: { name: "Shadow", level: 99 } } };

const objectWithOptionalOne = { 
  userRole: externalUserData?.user?.profile?.role,
  userTitle: externalUserData?.user?.profile?.title 
};

const objectWithOptionalTwo = { 
  leaderName: guildData?.guildInfo?.leader?.name,
  leaderLevel: guildData?.guildInfo?.leader?.level 
};

// Quick verification output logs
console.log("\n--- Processed Results ---");
console.log("Discounted Prices:", discountedPrices);
console.log("Affordable Prices:", affordablePrices);
console.log("Optional Chaining Object 1:", objectWithOptionalOne);
console.log("Optional Chaining Object 2:", objectWithOptionalTwo);