console.log('Hello World');


var url = 'ws://' + window.location.host + '/marco';
var socket = new WebSocket(url);
var container = document.getElementById('message-container');

socket.onopen = function() {
    console.log('Opening');
    sayMarco();
};

socket.onmessage = function(e) {
  console.log("Received message: ", e.data);
  setTimeout(sayMarco, 2000);
  container.innerHTML += "<p class='lead text-muted'>Received message: <b>"+ e.data +"</b></p>";
};


socket.onclose = function() {
    console.log('Closing');
}



function sayMarco() {
    console.log('Sending Marco!');
    socket.send("Marco!")
}