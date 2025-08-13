document.getElementById("loadBtn").onclick = function () {
    const cities = ["Mumbai", "Delhi", "Kolkata", "Chennai", "Bengaluru", "Pune"];

    // Sort city names
    cities.sort();

    const dropdown = document.getElementById("cityDropdown");
    dropdown.innerHTML = ""; // Clear old options

    // Add sorted cities to dropdown
    for (let city of cities) {
        const option = document.createElement("option");
        option.textContent = city;
        dropdown.appendChild(option);
    }
    console.log("Cities loaded and sorted:", cities);
};