var a = 100;
var b = prompt("Enter a number: ");
var num = Number(b);
if (a == b)
{
    alert("Excellent!!! You guessed it correctly!");
}
else if (a > b)
{
    alert("Sorry!! Try a least number");
}
else
{
    alert("Sorry!! Try a greater number!");
}