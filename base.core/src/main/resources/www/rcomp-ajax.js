
// IMPORTANT: notice the next request is scheduled only after the
//            previous request is fully processed either successfully
//	      or not.

function refreshAgvInfo() {
	var request = new XMLHttpRequest();
        var vBoard=document.getElementById("agvinfo");
        request.onload = function() {
            vBoard.innerHTML = this.responseText;
            vBoard.style.color="black";
            setTimeout(refreshAgvInfo, 60000);
            };

  	request.open("GET", "/agvinfo", true);
	request.timeout = 60000;
  	request.send();
	}



