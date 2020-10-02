var api = (function () {
    var url="https://localhost:5001";

    function login(){
        let uname = document.getElementById("username").value;
        let passwd = document.getElementById("passwd").value;
        let user = {username : uname, password:passwd};
        axios.post(url+"/login",user).then(res=>{
            if(res.data!=""){
                alert("Complete all fields");
            }
            else {
                window.location.href="protected/test.html";
            }
        })
    }

    return {
        login:login,
        //serviceData:serviceData
    };
})();