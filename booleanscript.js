var isFemale = false;
var isOld = true;
var isOldMan = isFemale && isOld;
alert(isOldMan);

var isFemale = false;
var isOld = true;
var isOldOrFemale = isFemale || isOld;
alert(isOldOrFemale);

var isFemale = false;
var isOld = true;
var isMale =! isFemale;
alert(isMale);