let name = "Russell Athan R. Villanueva";
let year = "BSIT3A"
let age = 18;
let score = 91;

let numbers = [10, 20, 30];


for (let i = 0; i < 3; i++) {
        console.log("Loop 1 count:", i);
    }

for (let num of numbers) {
        console.log("Array item:", num);
    }

let count = 5;
while (count > 0) {
        console.log("Countdown:", count);
        count--;
    }

console.log("Hi I am ", name, " from " , year, "!");

    if (score > 95) {
        console.log("Grade: A");
    } 

    else if (score > 90){
        console.log("Grade: B");
    }

    else if (score > 85) {
        console.log("Grade: C");
    }

    else if (score > 80) {
        console.log("Grade: D");
    }

    else {
        console.log("Grade: F");
    }