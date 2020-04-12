var express = require("express");
var router = express.Router();

router.get("/", function(request, response){
	var shipname = request.param("ship");
	var ship = "";
	if(shipname !== undefined)
		ship = shipname;
	response.render("main/resources/templates/astroport", {ship: ship});
	response.setHeader("Content-Type", "text/html");
});

module.exports = router;