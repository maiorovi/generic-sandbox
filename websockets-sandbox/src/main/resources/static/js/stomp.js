var url = 'http://'+ window.location.host + '/stomp/marcopolo';

var sock = new SockJS('/marcopolo');

var stomp = Stomp.over(sock);

var payload = JSON.stringify({'message' : 'Marco!'});

stomp.connect('guest', 'guest', function(frame) {
    stomp.send("/app/marco", {}, payload)
})