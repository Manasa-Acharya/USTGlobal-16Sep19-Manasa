
        function fabonacci(a,b){
            var c;
            for(i=1;i<=10;i++){
                c=a+b;
                console.log(c);
                a=b;
                b=c;
            }
        }
        fabonacci(0,1);
        console.log("========================");

    
    

   var faboncci=function (a,b){
       var c;
       for(i=1;i<=10;i++){
           c=a+b;
           console.log(c);
           a=b;
           b=c;
       }
   }
   fabonacci(0,1);
   console.log("========================");

 
 
 
     (function(a,b){
         var c;
         for(i=1;i<=10;i++){
             c=a+b;
             console.log(c)
             a=b;
             b=c;
         }
     })
     (0,1)
     console.log("========================");
 
 
 
 var fabonacci=(a,b)=>{
     var c;
     for(i=1;i<=10;i++){
         c=a+b;
         console.log(c);
         a=b;b=c;
     }
 }
 fabonacci(0,1)
 console.log("========================");
 
 
 
 
 