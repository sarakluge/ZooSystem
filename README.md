# 🦓 Zoo Management System (Java OOP Exercise)

This project is a **console-based zoo management system** written in Java.  
It is designed as an **object-oriented programming (OOP) exercise** using inheritance and composition.

---

## ✨ Features
- Show zoo status (cages, animals, zookeepers, food and waste levels)
- Add new animals (Birds, Mammals, Reptiles)
- Add new cages
- Add new zookeepers
- Assign cages to zookeepers
- Let zookeepers add food to cages and clean them
- Simulate a new day in the zoo:
    - Animals eat randomly from food in cages
    - Waste increases randomly
- Use animals’ special abilities:
    - Birds fly
    - Mammals give birth
    - Reptiles shed skin

---

## Classes Overview

### `Zoo`
- Holds lists of `Animal`s, `Cage`s, and `Zookeeper`s
- Can show animals, cages, zookeepers, and full zoo status
- Can advance all cages to the next day

### `Animal` *(abstract)*
- Base class for all animals
- Attributes: `species`, `age`, `diet`
- Subclasses implement special abilities:
    - `Bird` → fly
    - `Mammal` → give birth
    - `Reptile` → shed skin

### `Cage`
- Contains a list of animals
- Attributes: `name`, `size`, `capacity`, `food`, `waste`
- Can add animals, show status, add food, clean, and simulate next day changes

### `Zookeeper`
- Manages assigned cages
- Can add food to cages and clean them
- Attributes: `name`, list of `responsibilities` (cages)

### `Main`
- Console interface
- Handles user input with a text menu
- Allows adding animals, cages, zookeepers, assigning responsibilities, feeding, cleaning, using animal abilities, and advancing days

---

## ▶️ How to Run
1. Open the project in **IntelliJ IDEA**
2. Run the `Main.java` file.
3. Use the console menu to interact with the zoo:
    - Show zoo status
    - Add or view animals, cages, and zookeepers
    - Feed and clean cages
    - Simulate a new day

---

## 📚 Learning Goals
- Practice **object-oriented design** with inheritance and composition
- Implement relationships between objects (Zoo has Cages, Zookeeper manages Cages, Cage contains Animals)
- Use **encapsulation** to manage animal, cage, and zookeeper attributes
- Learn to write UML and design class diagrams
- Create simple **simulation mechanics** with random events and state changes

---

