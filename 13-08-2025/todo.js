const taskInput = document.getElementById("taskInput");
const addBtn = document.getElementById("addBtn");
const taskList = document.getElementById("taskList");

addBtn.onclick = () => {
    const text = taskInput.value.trim();
    if (!text) return;

    const li = document.createElement("li");
    li.textContent = text;

    const delBtn = document.createElement("button");
    delBtn.textContent = "Delete";
    delBtn.onclick = () => li.remove();

    li.appendChild(delBtn);
    taskList.appendChild(li);

    console.log("Added task:", text); // ✅ show in console

    taskInput.value = "";
};
