var x = 50; 
var y = "Russell Athan Villanueva"; 
var isActivityDone = true;

// --- 3 ARRAYS ---
var myArray1 = [1, 2, 3, 4, 5]; 
var myArray2 = ["apple", "banana", "orange"]; 
var myArray3 = []; // empty array just in case

// --- 2 OBJECT LITERALS ---
var CarLiteral = {
    color: "red",
    wheels: 4
};

var PizzaLiteral = {
    toppings: "pepperoni",
    slices: 8
};

// --- 3 CONDITIONALS ---
if (x == 10) {
    console.log("x is definitely 10!");
}

if (y == "hello world") {
    console.log("The string says hello");
} else {
    console.log("The string says something else");
}

if (isHomeworkDone == true) {
    console.log("Yay I can go play video games now");
}

// --- 3 LOOPS ---
console.log("Printing numbers:");
for (var i = 0; i < myArray1.length; i++) {
    console.log(myArray1[i]);
}

console.log("Printing fruits:");
for (var j = 0; j < myArray2.length; j++) {
    console.log(myArray2[j]);
}

var counter = 0;
while (counter < 3) {
    console.log("While loop is running... " + counter);
    counter++;
}

// =================================================================
// OOP STUFF STARTS HERE (This part was really hard)
// =================================================================

// CLASS 1 (and 1 ABSTRACTION)
class AbstractAnimal {
    // CONSTRUCTOR 1
    constructor() {
        // Abstraction: you can't make just an "AbstractAnimal"
        if (this.constructor === AbstractAnimal) {
            throw new Error("Teacher says you can't instantiate an abstract class!");
        }
    }
    
    // METHOD 1
    makeSound() {
        throw new Error("Must override this method!");
    }
}

// CLASS 2 (and 1 INHERITANCE)
class Animal extends AbstractAnimal {
    // 1 ENCAPSULATION
    #secretAge; 

    // CONSTRUCTOR 2
    constructor(name, age) {
        super();
        this.name = name; // property
        this.#secretAge = age; // private property
    }

    // METHOD 2
    getAge() {
        return this.#secretAge; // getting the encapsulated variable
    }

    // METHOD 3
    sleep() {
        console.log(this.name + " is going to sleep Zzz...");
    }
}

// CLASS 3 (and 2 INHERITANCE)
class Dog extends Animal {
    // 2 ENCAPSULATION
    #favoriteToy;

    constructor(name, age, toy) {
        super(name, age);
        this.#favoriteToy = toy;
    }

    // METHOD 4 (and 1 POLYMORPHISM - overriding makeSound from AbstractAnimal)
    makeSound() {
        console.log(this.name + " says WOOF WOOF!");
    }

    // METHOD 5
    fetch() {
        console.log(this.name + " is fetching the " + this.#favoriteToy);
    }
}

// CLASS 4
class Cat extends Animal {
    constructor(name, age) {
        super(name, age);
    }

    // POLYMORPHISM - Cat does it differently than Dog
    makeSound() {
        console.log(this.name + " says MEOW!");
    }
}

// --- 4 OBJECTS ---
var myDog1 = new Dog("Fido", 3, "tennis ball");
var myDog2 = new Dog("Spot", 5, "stick");
var myCat1 = new Cat("Fluffy", 2);
var myCat2 = new Cat("Garfield", 10);

// Testing the objects so the teacher sees it works
myDog1.makeSound();
myDog1.fetch();
console.log("Fido is " + myDog1.getAge() + " years old.");

myCat1.makeSound();
myCat2.sleep();

console.log("End of script. It works!!!");