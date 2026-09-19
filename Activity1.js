// --- 3 VARIABLES ---
let name = "Athan";
let age = 18;
let score = 85;

// --- 1 ARRAY (3 items) ---
let numbers = [10, 20, 30];

// --- 3 LOOPS ---

// Loop 1
for (let i = 0; i < 3; i++) {
  console.log("Loop 1 count:", i);
}

// Loop 2
for (let num of numbers) {
  console.log("Array item:", num);
}

// Loop 3
let count = 3;
while (count > 0) {
  console.log("Countdown:", count);
  count--;
}

// --- 3 CONDITIONALS ---
if (score > 90) {
  console.log("Grade: A");
} else if (score > 80) {
  console.log("Grade: B");
} else {
  console.log("Grade: C");
}