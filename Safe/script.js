function sendSOS() {
  document.getElementById("status").innerText = "🚨 Emergency Activated!";

  alert("SOS sent to your emergency contacts!");

  // Future: integrate SMS API
}

function getLocation() {
  if (navigator.geolocation) {
    navigator.geolocation.getCurrentPosition(function(pos) {
      let lat = pos.coords.latitude;
      let lon = pos.coords.longitude;

      let link = "https://maps.google.com/?q=" + lat + "," + lon;

      document.getElementById("output").innerHTML =
        "📍 Your Location: <br><a href='" + link + "' target='_blank'>" + link + "</a>";
    });
  } else {
    alert("Location not supported");
  }
}

function fakeCall() {
  alert("📞 Incoming call from Mom...");
}

function startRecording() {
  alert("🎙️ Recording started (Demo Feature)");
}