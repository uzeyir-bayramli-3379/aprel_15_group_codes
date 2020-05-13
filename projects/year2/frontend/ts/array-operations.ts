let numbers:number[]=[3,6,8];

numbers.push(1);

console.log('orginal massiv = '+numbers+'\n\n');

console.log(numbers.length+"\n\n");

numbers.splice(1,2);

console.log('silinmeden sonra qalanlar = '+numbers+'\n\n');

let numbersCopy:number[]=numbers.slice();

console.log('kopiya alinan massiv = '+numbersCopy+'\n\n');