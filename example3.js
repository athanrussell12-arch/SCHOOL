/**
 * RPG BATTLE SYSTEM
 */

// ==========================================
// 1. OBJECT LITERALS (2 minimum)
// ==========================================
const healingPotion = { // Object Literal 1
    name: "Healing Potion",
    healAmount: 50
};

const magicScroll = { // Object Literal 2
    name: "Scroll of Fire",
    damageAmount: 100
};


// ==========================================
// 2. CLASSES (4 minimum), ABSTRACTION (1), ENCAPSULATION (2)
// ==========================================

// Class 1: Abstract Base Class
class Entity {
    
    // Encapsulation 1: Private property (cannot be accessed outside the class)
    #health; 

    // Constructor 1
    constructor(name, maxHealth) {
        // Abstraction 1: Preventing direct instantiation of a base class
        if (new.target === Entity) {
            throw new Error("Cannot instantiate abstract class Entity directly.");
        }
        
        // Variables / Properties (Needs 3: name, #health, isAlive flag)
        this.name = name; 
        this.#health = maxHealth;
        this.isAlive = true;
    }

    // Method 1
    getHealth() {
        return this.#health;
    }

    // Method 2
    takeDamage(amount) {
        this.#health -= amount;
        
        // Conditional 1
        if (this.#health <= 0) {
            this.#health = 0;
            this.isAlive = false;
            console.log(`${this.name} has been defeated!`);
        }
    }

    // Abstract method (to be overridden via Polymorphism)
    attack(target) {
        throw new Error("Method 'attack()' must be implemented.");
    }
}

// Class 2: Character class
// Inheritance 1: Character inherits from Entity
class Character extends Entity {
    
    // Encapsulation 2: Private property for inventory
    #inventory; 

    // Constructor 2
    constructor(name, maxHealth) {
        super(name, maxHealth);
        this.#inventory = [];
    }

    // Method 3
    receiveItem(item) {
        this.#inventory.push(item);
    }

    // Method 4
    showInventory() {
        console.log(`${this.name}'s Inventory:`);
        
        // Conditional 2
        if (this.#inventory.length === 0) {
            console.log("- Empty");
            return;
        }

        // Loop 1
        for (let i = 0; i < this.#inventory.length; i++) {
            console.log(`- ${this.#inventory[i].name}`);
        }
    }
}

// Class 3: Warrior
// Inheritance 2: Warrior inherits from Character
class Warrior extends Character {
    constructor(name, maxHealth, strength) {
        super(name, maxHealth);
        this.strength = strength; // Additional property
    }

    // Method 5 & Polymorphism 1: Overriding the abstract attack method
    attack(target) {
        const damage = this.strength * 2;
        console.log(`${this.name} swings a mighty sword at ${target.name} for ${damage} damage!`);
        target.takeDamage(damage);
    }
}

// Class 4: Mage
// Inheritance 3: Mage inherits from Character
class Mage extends Character {
    constructor(name, maxHealth, magicPower) {
        super(name, maxHealth);
        this.magicPower = magicPower; // Additional property
    }

    // Polymorphism 1: Overriding the attack method differently than Warrior
    attack(target) {
        const damage = this.magicPower * 3;
        console.log(`${this.name} casts a devastating fireball at ${target.name} for ${damage} damage!`);
        target.takeDamage(damage);
    }
}


// ==========================================
// 3. OBJECTS (4 minimum)
// ==========================================

// Creating 4 instances of our classes
const arthur = new Warrior("Arthur the Brave", 150, 15);   // Object 1
const lancelot = new Warrior("Lancelot", 140, 18);         // Object 2
const merlin = new Mage("Merlin the Wise", 80, 25);        // Object 3
const darkLord = new Mage("Lord Malakor", 300, 20);        // Object 4

// Giving items to characters
arthur.receiveItem(healingPotion);
merlin.receiveItem(magicScroll);


// ==========================================
// 4. ARRAYS (3 minimum)
// ==========================================

const heroes = [arthur, lancelot, merlin];    // Array 1
const enemies = [darkLord];                   // Array 2
const allCharacters = [...heroes, ...enemies]; // Array 3


// ==========================================
// 5. LOOPS (3 minimum) & CONDITIONALS (3 minimum)
// ==========================================

console.log("--- BATTLE START ---");

// Loop 2: Iterating over an array to display health
for (const char of allCharacters) {
    console.log(`${char.name} starts with ${char.getHealth()} HP.`);
}
console.log("--------------------");

// Loop 3: Battle Sequence loop
let round = 1;
while (darkLord.isAlive && heroes.some(hero => hero.isAlive)) {
    console.log(`\n--- ROUND ${round} ---`);
    
    // Heroes attack the enemy
    for (let i = 0; i < heroes.length; i++) {
        const currentHero = heroes[i];
        
        // Conditional 3: Only attack if the hero is alive and the enemy isn't dead yet
        if (currentHero.isAlive && darkLord.isAlive) {
            currentHero.attack(darkLord);
        }
    }

    // Enemy attacks a random hero back if still alive
    if (darkLord.isAlive) {
        // Find a living hero
        const aliveHeroes = heroes.filter(h => h.isAlive);
        const targetHero = aliveHeroes[0]; 
        darkLord.attack(targetHero);
    }

    round++;
}

console.log("\n--- BATTLE END ---");
if (darkLord.isAlive) {
    console.log("The heroes have been defeated. Darkness prevails.");
} else {
    console.log("The dark lord has fallen! The heroes are victorious!");
}