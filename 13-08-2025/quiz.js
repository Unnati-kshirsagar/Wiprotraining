document.addEventListener("DOMContentLoaded", function() {
 const questions = [
  { q: "What does AI stand for?", o: ["Artificial Intelligence", "Automated Internet", "Applied Innovation", "Advanced Integration"], a: "Artificial Intelligence" },
  { q: "Which of these is a type of machine learning?", o: ["Supervised Learning", "Controlled Coding", "Auto Programming", "Manual Learning"], a: "Supervised Learning" },
  { q: "Which language is most popular for AI development?", o: ["Python", "Java", "C++", "HTML"], a: "Python" },
  { q: "What is the primary goal of AI?", o: ["Simulate human intelligence", "Replace humans entirely", "Store data", "Design websites"], a: "Simulate human intelligence" },
  { q: "Which is my favorite subject?", o: ["#c", "c++", "AI", "Java"], a: "AI" }
];



  let idx = 0, score = 0, wrong = 0;
  const qEl = document.getElementById("question");
  const optEl = document.getElementById("options");
  const fbEl = document.getElementById("feedback");
  const scoreEl = document.getElementById("score");
  const wrongEl = document.getElementById("wrong");
  const nextBtn = document.getElementById("nextBtn");

  function showQ() {
    let { q, o, a } = questions[idx];
    qEl.textContent = q;
    optEl.innerHTML = "";
    fbEl.textContent = "";

    o.forEach(opt => {
      let btn = document.createElement("button");
      btn.textContent = opt;
      btn.className = "option";
      btn.onclick = () => {
        if (opt === a) {
          fbEl.textContent = "Correct!";
          score++;
          scoreEl.textContent = score;
        } else {
          fbEl.textContent = "Wrong!";
          wrong++;
          wrongEl.textContent = wrong;
        }
        document.querySelectorAll(".option").forEach(b => b.disabled = true);
      };
      optEl.appendChild(btn);
    });
  }

  nextBtn.onclick = () => {
    if (++idx < questions.length) showQ();
    else {
      qEl.textContent = "Quiz Over!";
      optEl.innerHTML = "";
      fbEl.innerHTML = `Final Score: Correct: ${score} | Wrong: ${wrong}`;
      nextBtn.disabled = true;
    }
  };

  showQ();
});
