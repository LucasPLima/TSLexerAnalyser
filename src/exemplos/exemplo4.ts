const pets: Set<String> = new Set(["Cat", "Dog", "Hamster"]);
let people: Array<String> = ["Vitor", "Lucas", "Chris", "Anderson"];

for (let pet in pets) {
  console.log(pet);
}

for (let pet of pets) {
  console.log(pet);
}

if (people[0] == "Vitor") {
  console.log("Vitinho");
}

pet[1] === "Cat" ? console.log("Miau") : console.log("Au Au");

interface PersonPartial {
  name?: string;
  age?: number;
}
