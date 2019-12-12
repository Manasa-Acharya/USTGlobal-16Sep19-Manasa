
                function prime(n){
                    var temp=0;
                          for(i=2;i<=n-1;i++){
                              if(n%i==0){
                                  temp=temp+1;
                              }
                          }
                          if(temp>0){
                              console.log('Not Prime')
                          }
                          else{
                              console.log('Number Is Prime')
                          }
                      }
                      prime(6)
                      console.log("========================");
                       
                     var prime=function(n){
                      var temp=0;
                          for(i=2;i<=n-1;i++){
                              if(n%i==0){
                                  temp=temp+1;
                              }
                          }
                          if(temp>0){
                              console.log('Not Prime')
                          }
                          else{
                              console.log('Number Is Prime')
                          }
                      }
                      prime(7)
                      console.log("========================");
                     
                     (function(n){
                      var temp=0;
                          for(i=2;i<=n-1;i++){
                              if(n%i==0){
                                  temp=temp+1;
                              }
                          }
                          if(temp>0){
                              console.log('Not Prime')
                          }
                          else{
                              console.log('Number Is Prime')
                          }
                   })
                   (8)
                   console.log("========================");
                   var prime=n=>{
                   var temp=0;
                          for(i=2;i<=n-1;i++){
                              if(n%i==0){
                                  temp=temp+1;
                              }
                          }
                          if(temp>0){
                              console.log('Not Prime')
                          }
                          else{
                              console.log('Number Is Prime')
                          }
                   }
              prime(6) 
              console.log("========================");
               