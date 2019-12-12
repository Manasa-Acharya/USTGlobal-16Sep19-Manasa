const items=[{
    name:"trimmer",
    id:1,
    price:5000,
},{
    name:"wallet",
    id:2,
    price:500,
    
},{
    name:"towel",
    id:3,
    price:600,
},{
    name:"bangles",
    id:4,
    price:1000,
}
]
// const items1=items.map(function(elem){
    
//     return{
//         name:elem.name,
//         id:elem.id,
//         price:elem.price+300,

//     }
// })
const updatedItem=items.map(function(item,index){
    item.price=item.price+300;
    return item;
    
})
console.log("items=",updatedItem)
console.log("========================");
const itemsArrow=items.map((value)=>{
    value.price=value.price+300;
    return value;
})
console.log("items=",itemsArrow)
console.log("===========================");
const filteredItems=items.filter((item)=>item.price>2000);
console.log("items=",filteredItems);
// console.log("items=",items1);
// console.log("============fat arrow====================");
// const items2=items.map(items=>items.price+300);
// console.log("items=",items2);
// console.log("==============================");
// const items5=items.filter(function(elem){
//     return{
//         name:elem.name,
//         id:elem.id,
//         price:elem.price+300,

//     }
// })
// console.log("==========fat arrow using filter======");
// const items3=items.filter(items=>items.price>1000);
// console.log("items=",items3);