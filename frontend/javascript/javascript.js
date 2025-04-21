//1.count Vowels
function countVowels(input){
    for(let c=0;c<=input.length-1;c++){
    let count=0
    let char=input%10;
    if(char==='a' || char==='e'|| char==='i'|| char=='o'|| char=='u')
        {
        count++
    }
    input=input/10
    }
    console.log(count);
}
countVowels("Hello World")
//2.flattenandsort
let arr=[[3,2,1],[4,5,2],[1,6]]
let flatten=arr.flat(infinity)
console.log(flatten.sort());

//3.getCategorySummary(expenses)
const expenses=[
    {
        category:"Food",
        amount:120
    },

{
    category:"Travel",
        amount:300
},
{
    category:"Food",
        amount:80
},
{
    category:"Bills",
        amount:200
},
{
    category:"Travel",
        amount:100
},
];

let getCategorySummary=()=>
    {
       if(expenses.catagory==='food'){
        if(expenses.amount>=200)
        {
            console.log(expenses.catagory.food,':200');
        }
       }
       if(expenses.catagory==='travel'){
        if(expenses.amount>=400)
        {
            console.log(expenses.catagory.food,':400');
        }
       }
       if(expenses.catagory==='bills'){
        if(expenses.amount>=200)
        {
            console.log(expenses.catagory.food,':200');        }
        if(expenses.catagory==='travels'){

           catagory.amount=avg( catagory.amount)
           
           console.log("highestExpenses:",expenses.catagory.Travel);
            
       }


    }

    }
    getCategorySummary()