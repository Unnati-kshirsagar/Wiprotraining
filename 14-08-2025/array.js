const numbers = [10, 20, 30, 40, 50];

   
        const sumArray = arr => arr.reduce((total, num) => total + num, 0);

        console.log("Array:", numbers);


        console.log("Sum:", sumArray(numbers));