
const hoje = new Date();

console.log(dateFns.format(hoje, "DD/MM/YYYY"));

// 

const day = new Date();
const fiveDays = dateFns.addDays(day, 5);
console.log(dateFns.format(fiveDays, "DD/MM/YYYY"));


console.log("É depois?" , dateFns.isAfter(day, fiveDays));