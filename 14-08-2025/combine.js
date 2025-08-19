function combine() {
  let arr1 = [1, 2, 3], arr2 = [4, 5, 6];
  let newArr = [4, 5, ...arr1, 6, 7, ...arr2, 8, 9];
  document.getElementById("out").innerHTML = newArr;
  console.log("Combined Array:", newArr);
}
