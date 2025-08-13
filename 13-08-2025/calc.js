const n1 = document.getElementById("num1");
const n2 = document.getElementById("num2");
const out = document.getElementById("output");

const add = document.getElementById("addBtn");
const sub = document.getElementById("subBtn");
const mul = document.getElementById("mulBtn");
const div = document.getElementById("divBtn");

add.onclick = () => out.textContent = "Result: " + (parseFloat(n1.value) + parseFloat(n2.value));
sub.onclick = () => out.textContent = "Result: " + (parseFloat(n1.value) - parseFloat(n2.value));
mul.onclick = () => out.textContent = "Result: " + (parseFloat(n1.value) * parseFloat(n2.value));
div.onclick = () => {
  out.textContent = parseFloat(n2.value) === 0 ? "Result: Cannot divide by zero" : "Result: " + (parseFloat(n1.value) / parseFloat(n2.value));
};
