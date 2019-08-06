function validateEmail(email) {
    var re_mail = /^[a-zA-Z0-9_\.]+@[a-zA-Z]+\.[a-zA-Z]+(\.[a-zA-Z]+)*$/;
    return re_mail.test(email);
}
function validatePhone(phone) {
    var re_phone = /^(\+84|0)[3|5|7|8|9][1-9]\d{7}$/;
    return re_phone.test(phone);
}
function check_name(name) {
    var message_name="";
    if (name.value==="") {
        name.style.border='1px solid red';
        message_name="Please enter your name !";
        document.getElementById('message_name').innerHTML=message_name;
        return 0;
    } else if (name.value.length<2) {
        name.style.border='1px solid red';
        message_name="Please enter full name !";
        document.getElementById('message_name').innerHTML=message_name;
        return 0;
    } else {
        name.style.border='1px solid green';
        message_name="";
        document.getElementById('message_name').innerHTML=message_name;
        return true;
    }
}
function check_email(mail) {
    var message_mail="";
    if (mail.value==="") {
        mail.style.border='1px solid red';
        message_mail="Please enter your Email !";
        document.getElementById('message_mail').innerHTML=message_mail;
        return 0;
    } else if (!validateEmail(mail.value)) {
        mail.style.border='1px solid red';
        message_mail="Email invalid !";
        document.getElementById('message_mail').innerHTML=message_mail;
        return 0;
    } else {
        mail.style.border='1px solid green';
        message_mail="";
        document.getElementById('message_mail').innerHTML=message_mail;
        return 1;
    }
}

function check_password(password) {
    var message_password="";
    if (password.value==="") {
        password.style.border='1px solid red';
        message_password="Please enter your password !";
        document.getElementById('message_password').innerHTML=message_password;
        return 0;
    } else if (password.value.length < 4) {
        password.style.border='1px solid red';
        message_password="Passwords must be at least 4 characters long";
        document.getElementById('message_password').innerHTML=message_password;
        return 0;
    } else {
        password.style.border='1px solid green';
        message_password="";
        document.getElementById('message_password').innerHTML=message_password;
        return 1;
    }
}
function check_conf_password(conf_password,password) {
    var message_conf_password="";
    if (conf_password.value==="") {
        conf_password.style.border='1px solid red';
        message_conf_password="Please confirm your password !";
        document.getElementById('message_conf_password').innerHTML=message_conf_password;
        return 0;
    } else if (conf_password.value!=password.value) {
        conf_password.style.border='1px solid red';
        message_conf_password="Password incorrect !";
        document.getElementById('message_conf_password').innerHTML=message_conf_password;
        return 0;
    } else {
        conf_password.style.border='1px solid green';
        message_conf_password="";
        document.getElementById('message_conf_password').innerHTML=message_conf_password;
        return 1;
    }
}
function check(){
    var name = document.getElementById('name');
    var email = document.getElementById('email');
    var password = document.getElementById('password');
    var conf_password = document.getElementById('conf_password');
    

    check_name(name);
    if (check_name(name)==0) {
        return;
    };
    check_email(email);
    if (check_email(email)==0) {
        return;
    };
    check_password(password);
    if (check_password(password)==0) {
        return;
    };
    check_conf_password(conf_password,password);
    if (check_conf_password(conf_password,password)==0) {
        return;
    };

   
   window.location.reload; //Refresh page
   
}