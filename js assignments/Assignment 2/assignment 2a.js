
        function fact(num){
            var fact=1;
            for(i=1;i<=num;i++){
                fact=fact*i;
            }
            return fact
        }
        console.log(fact(5))
        console.log("========================");
        
            var fact=function(num){
                var fact=1;
                for(i=1;i<=num;i++){
                fact=fact*i;

            }
            return fact;
        }
        console.log(fact(5))
        console.log("========================");

        
        
            (function(num) {
                var fact=1;
                for(i=1;i<=num;i++){
                fact=fact*i;
            }
            console.log(fact)
        })
        (3)
        console.log("========================");
        
        
            var div1=num=>{
                var fact=1;
                for(i=1;i<=num;i++){
                    fact=fact*i;
                }
                console.log(fact)
            }
            div1(3)
        