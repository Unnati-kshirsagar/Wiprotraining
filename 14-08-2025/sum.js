function sum(a, b, c) { 
  return a + b + c; 
}

function showSum() {
  let numbers = [1, 2, 3];
  document.getElementById("out").innerHTML = 
    `Sum: ${sum(...numbers)}<br>Max: ${Math.max(...numbers)}`;
    console.log("This is equivalent to sum(1, 2, 3):", sum(1, 2, 3));
}
