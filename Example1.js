// --- 1. VARIABLES (3 declared - Strings and Numbers only) ---
let storeName = "Fruit Market"; // Variable 1: String
let itemLimit = 3;              // Variable 2: Number
let targetPrice = 2;            // Variable 3: Number

console.log("Welcome to " + storeName + "!");

// --- 2. ARRAY (1 array with 3 items) ---
let inventory = ["Apple", "Banana", "Orange"];

// --- 3. LOOPS (3 total) ---

// Loop 1: Standard 'for' loop (Prints the fruits)
console.log("\n--- Store Inventory ---");
for (let i = 0; i < inventory.length; i++) {
  console.log("Item " + (i + 1) + ": " + inventory[i]);
}

// Loop 2: 'while' loop (Counts down using a number)
console.log("\n--- Restock Countdown ---");
let countdown = itemLimit;
while (countdown > 0) {
  console.log("Restocking in " + countdown + " seconds...");
  countdown--;
}

// Loop 3: 'for...of' loop (Checks each item in the array)
console.log("\n--- Price Check ---");
for (let fruit of inventory) {
  
  // --- 4. CONDITIONALS (3 total - comparing Strings and Numbers) ---
  
  // Conditional 1: 'if' statement checking a string value
  if (fruit === "Apple") {
    console.log("Apple costs $1.00 - cheaper than our target price of $" + targetPrice);
  } 
  // Conditional 2: 'else if' statement checking a string value
  else if (fruit === "Banana") {
    console.log("Banana costs $2.00 - exactly matches our target price of $" + targetPrice);
  } 
  // Conditional 3: 'else' statement catching remaining cases
  else {
    console.log(fruit + " costs $3.00 - higher than our target price of $" + targetPrice);
  }
}