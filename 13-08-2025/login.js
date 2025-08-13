loginForm.onsubmit = e => {
  e.preventDefault();
  
  if (!email.value.trim()) {
    emailError.textContent = "Email required";
  } else if (!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email.value)) {
    emailError.textContent = "Invalid email";
  } else {
    emailError.textContent = "";
  }

  passwordError.textContent = !password.value.trim()
    ? "Password required" : "";

  if (!emailError.textContent && !passwordError.textContent) {
    alert("Login successful!");
  }
  console.log("Form submitted");
  return false;
};
