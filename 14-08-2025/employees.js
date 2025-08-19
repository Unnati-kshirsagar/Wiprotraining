var employees = [
    { empId: 1, empName: "Unnati", salary: 50000 },
    { empId: 2, empName: "Utkarsh", salary: 60000 }
];
function printEmployees(list) {
    list.forEach(function (e) { return console.log(e); });
    return list.length;
}
console.log("Total Employees:", printEmployees(employees));
