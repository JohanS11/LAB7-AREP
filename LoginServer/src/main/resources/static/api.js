var api = (function () {
    var url="https://ec2-34-224-97-41.compute-1.amazonaws.com:9001";

    function login(){
        let uname = document.getElementById("username").value;
        let passwd = document.getElementById("passwd").value;
        let user = {username : uname, password:passwd};
        axios.post(url+"/login",user).then(res=>{
            if(res.data!==""){
                alert("Complete all fields");
            }
            else {
                window.location.href="protected/test.html";
            }
        })
    }

    return {
        login:login
    };
})();