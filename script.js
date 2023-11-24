document.addEventListener("DOMContentLoaded", function() {

  const newYearDate = new Date("January 1, 2024 00:00:00").getTime();

  const x = setInterval(function() {
    const now = new Date().getTime();

    const distance = newYearDate - now;

    const days = Math.floor(distance / (1000 * 60 * 60 * 24));
    const hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
    const minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
    const seconds = Math.floor((distance % (1000 * 60)) / 1000);

    
    document.getElementById("timer").innerHTML = `${days}d ${hours}h ${minutes}m ${seconds}s`;

    
    if (distance < 0) {
      clearInterval(x);
      document.getElementById("timer").innerHTML = "Happy New Year!";
    }
  }, 1000);
});
