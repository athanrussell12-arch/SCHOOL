// 1. OBJECT LITERALS (2) & ARRAYS (3)
const config = { discount: 5 };          // Object Literal 1
const status = { isOpen: true };         // Object Literal 2

const categories = ["Books", "Toys"];   // Array 1
const inventory = [];                   // Array 2
const logs = ["System Ready"];          // Array 3

// 2. CLASSES (4), CONSTRUCTORS (2), ENCAPSULATION (2)
class Item {
  constructor(name, price) {             // Constructor 1
    this.name = name;                    // Property 1
    this.price = price;                  // Property 2
  }
  getDetails() {                         // Method 1 (Base for Polymorphism)
    return `${this.name} - $${this.price}`;
  }
}

// Class 2 & Inheritance 1
class Book extends Item {
  getDetails() {                         // Method 2 (Polymorphism)
    return `[Book] ${this.name} ($${this.price})`;
  }
}

// Class 3 & Inheritance 2
class Toy extends Item {
  getDetails() {                         // Method 3 (Polymorphism)
    return `[Toy] ${this.name} ($${this.price})`;
  }
}

// Class 4
class Store {
  #cash = 50;                            // Encapsulation 1
  #salesCount = 0;                       // Encapsulation 2

  constructor(owner) {                   // Constructor 2
    this.owner = owner;                  // Property 3
  }

  // Abstraction (Method 4): Hides complex processing behind one simple call
  buy(items) {
    // Loop 1
    for (let i = 0; i < items.length; i++) {
      inventory.push(items[i]);
      this.#salesCount++;
    }

    // Loop 2
    for (const item of items) {
      // Conditionals 1, 2, 3
      if (item.price > 20) {
        this.#cash += item.price - config.discount;
      } else if (item.price > 0) {
        this.#cash += item.price;
      } else {
        console.log("Free item processed.");
      }
    }

    // Loop 3
    let timer = 1;
    while (timer > 0) {
      console.log(`Current Cash: $${this.#cash}`);
      timer--;
    }
  }

  showInventory() {                      // Method 5
    inventory.forEach(i => console.log(i.getDetails()));
  }
}

// 3. OBJECT INSTANTIATION (4 Objects)
const b1 = new Book("JS Basics", 25);   // Object 1
const t1 = new Toy("Action Figure", 15); // Object 2
const myStore = new Store("Alex");      // Object 3
const customer = { name: "Sam" };        // Object 4

// EXECUTION
myStore.buy([b1, t1]);
myStore.showInventory();