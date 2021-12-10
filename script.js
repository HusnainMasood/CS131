var amountString = prompt("Enter the amount of the item: ");
var amount = Number(amountString);
var tax_amnt = 9.50;
var total;
total = tax_amnt + amount;
alert("Item Price: $" + amount + "  " + "Tax Amount: " + tax_amnt + "%" + "  " + "Total Price: $" + total);