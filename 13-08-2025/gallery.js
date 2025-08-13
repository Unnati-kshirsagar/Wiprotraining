const pics = [
    "0d9da5fd-242c-4530-a0a7-532014850016.png",
    "2e68652c-84f5-4ef8-9f79-467489697747.png",
    "82f8c0a8-c36b-4e6f-bdaa-0b89dac123f0.png",
    "49137f03-e5ce-4508-914a-4050d7242073 (1).png",
    "image-6.png"
   
];

let i = 0;
const img = document.getElementById("galleryImage");

function updateImage() {
    img.src = pics[i];
    console.log(i);
}

updateImage();

document.getElementById("nextBtn").onclick = function () {
    if (i < pics.length - 1) {
        i++;
        updateImage();
    }
};

document.getElementById("prevBtn").onclick = function () {
    if (i > 0) {
        i--;
        updateImage();
    }
};
