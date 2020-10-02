var api = (function () {
    var url="https://localhost:5000";

    function login(){
        var user={email:document.getElementById("email").value,password:document.getElementById("password").value};
        axios.post(url+"/login",user).then(res=>{
            if(res.data!=""){
                alert(res.data)
            }
            else {
                window.location.href="secured/index.html";
            }

        })
    }

    return {
        login:login,
        serviceData:serviceData
    };
})();