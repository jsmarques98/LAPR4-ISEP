
// IMPORTANT: notice the next request is scheduled only after the
//            previous request is fully processed either successfully
//	      or not.

function refreshAgvStatus() {
	var request = new XMLHttpRequest();
        var vBoard=document.getElementById("agvstatus");
        request.onload = function() {
            vBoard.innerHTML = this.responseText;
            vBoard.style.color="black";
            setTimeout(refreshAgvStatus, 10000);
            };

  	request.open("GET", "/agvstatus", true);
	request.timeout = 10000;
  	request.send();
}


function refreshWarehousePlant() {
    var request = new XMLHttpRequest();
    var vBoard=document.getElementById("warehouseplant");
    request.onload = function() {
        vBoard.innerHTML = this.responseText;
        vBoard.style.color="black";
        setTimeout(refreshWarehousePlant, 10000);

    };
    request.open("GET", "/warehouseplant", true);
    request.timeout = 10000;
    request.send();
}




