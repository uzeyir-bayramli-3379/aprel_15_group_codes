
for(let i:number=1;i<=5;i++){
    console.log(i);

}

let numbers:number[]=[4,7,1,5,3,9];

numbers.push(24);

console.log(numbers+"\n\n");

let saygac:number=0;
for(let n of numbers){
    saygac++;
    console.log(saygac+' = '+n);
}
