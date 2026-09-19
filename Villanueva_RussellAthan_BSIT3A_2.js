const config = {discount: 10};
const status = {isOpen: true};

const categories = ["Books", "Comics"];
const inventory = [];
const logs = ["System Ready!"];

class Item{
    constructor (name, price){
        this.name = name;
        this.price = price;
    }
    getDetails(){
        return `${this.name} - $${this.price}`;
    }
}

class Book extends Item{
    getDetails(){
        return `[Book] ${this.name} ($${this.price})`;
    }
}

class Comic extends Item{
    getDetails(){
        return `[Comic] ${this.name} ($${this.price})`;
    }
}

class Store{
    #cash = 100;
    #salesCount = 0;

    constructor(owner){
        this.owner = owner;
    }

    buy(items){
        for (let i = 0; i < items.length; i++){
            inventory.push(items[i]);
            this.#salesCount++;
        }

        for (const item of items){
            if (item.price > 20){
                this.#cash += item.price - config.discount;
            }
            else if (item.price > 0){
                this.#cash += item.price;
            }
            else{
                console.log ("Free Item Processed!");
            }
        }
        
        let timer = 1;
        while (timer > 0){
            console.log(`Current Cash: $${this.#cash}`);
            timer--;
        }
    }

    showInventory(){
        inventory.forEach(i => console.log (i.getDetails()));
    }
}

const b1 = new Book ("Lord of the Rings: Fellowship", 25);
const b2 = new Book ("A Game of Thrones", 25);
const c1 = new Comic ("Marvel's Avenger", 15);
const c2 = new Comic ("DC's Justice League", 15);
const customer = {name: "Russell"};
const myStore = new Store();

myStore.buy([b1, c1, c2]);
myStore.showInventory();