var reGexPass =/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/;

function checkAllData() {
  isValidPass = checkPass();
  isValidCPass = checkPassConfirm();

  isValid = isValidPass && isValidCPass;

  return isValid;
}

function checkPass() {
pass = $("#password").val();
  if (pass === "") {
      $("#txtPasswordMessage").html("Password cannot be left blank!");
  } else if (reGexPass.test(pass) === false) {
      $("#txtPasswordMessage").html("Invalid password!");
  } else {
      $("#txtPasswordMessage").html("");
  }
  return pass !== "" && reGexPass.test(pass);
}

function checkPassConfirm() {
pass = $("#re-password").val();
  if (pass === "") {
      $("#txtRePasswordMessage").html("Confirm password cannot be left blank!");
  } else if (reGexPass.test(pass) === false) {
      $("#txtRePasswordMessage").html("Invalid confirm password!");
  } else {
      $("#txtRePasswordMessage").html("");
  }
  return pass !== "" && reGexPass.test(pass);
}

$(document).ready(function () {
  $("#password").blur(function () {
    checkPass();
  });

  $("#re-password").blur(function () {
    checkPassConfirm();
  });

  $("#myForm").bind({
      'submit': function () {
          return checkAllData();
      }
  });
});

