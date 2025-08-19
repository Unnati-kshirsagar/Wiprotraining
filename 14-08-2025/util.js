class Util {

    getDate() {
        const d = new Date();
        const dd = d.getDate();
        const mm = d.getMonth() + 1;
        const yyyy = d.getFullYear();
        return `${dd}-${mm}-${yyyy}`;
    }


    getPIValue() {
        return Math.PI;
    }


    convertC2F(celsius) {
        return (celsius * 9/5) + 32;
    }


    getFibonacci(n) {
        const fib = [0, 1];
        for (let i = 2; i < n; i++) fib.push(fib[i-1] + fib[i-2]);
        return fib.slice(0, n);
    }
}

const util = new Util();

console.log("Date:", util.getDate());
console.log("PI:", util.getPIValue());
console.log("100°C in Fahrenheit:", util.convertC2F(100));
console.log("First 6 Fibonacci numbers:", util.getFibonacci(6));
