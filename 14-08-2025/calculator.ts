class Calculator {
    add(a: number, b: number): number {
        return a + b;
    }
    subtract(a: number, b: number): number {
        return a - b;
    }
}
var calc = new Calculator();
console.log("Add: ", calc.add(10, 5));        
console.log("Subtract: ", calc.subtract(10, 5)); 
