document.addEventListener("DOMContentLoaded", function() {
    var formUser = document.getElementById("userInfoForm");
    formUser.addEventListener("submit", function(event) {
        if(!validateForm(formUser)){
        event.preventDefault(); 
    }// Prevent default form submission
    });
});
function validateForm(form){
    
    let username = form.username;
    if(username.value === "" ){
        alert("Debe proporcionar un nombre de usuario");
        return false;
    }
    
    let password = form.password;
    if(password.value === "" || password.value.length < 3){
        alert("Debe proporcionar un password al menos de 3 caracteres");
        return false;
    }
    
    let technologies = form.technologies;
    let checkSelected = false;
    
    for(let i = 0; i < technologies.length; i++){
        if(technologies[i].checked){
            checkSelected = true;
        }
    }
    
    if(!checkSelected){
        alert("Debe seleccionar una tecnología");
        return false;
    }
    
    let gender = form.gender;
    let radioSelected = false;
    
    for(let i = 0; i < gender.length; i++){
        if(gender[i].checked){
            radioSelected = true;
        }
    }
    
    if(!radioSelected){
        alert("Debe seleccionar un genero");
        return false;
    }
    
    let position = form.position;
    if(position.value === ""){
        alert("Debe seleccionar una ocupacion");
        return false;
    }
    
    //Formulario es valido
    alert("Formulario valido, enviado datos al servidor");
    return true;
}