
function validate(){
    
    let username=document.getElementById("username").Value;
    let password=document.getElementById("password").Value;
    if(this.username.value.length <= 6 && this.password.value.length <= 5){
        document.getElementById("b1").disabled=true;
    }else{
        document.getElementById("b1").disabled=false;
    }
    
}