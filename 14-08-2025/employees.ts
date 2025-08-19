interface Employee { 
     empId: number;
     empName: string;
     salary: number;
}

let employees: Employee[] = [
    { empId: 1, empName: "Unnati", salary: 50000 },
    { empId: 2, empName: "Utkarsh", salary: 60000 }
];

function printEmployees(list: Employee[]) {
    list.forEach(e => console.log(e));
    return list.length;
}

console.log("Total Employees:", printEmployees(employees));
