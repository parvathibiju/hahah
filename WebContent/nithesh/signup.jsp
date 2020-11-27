<%@page import="dao.SignUpDAO"%>
<%@page import="servlets.SignUpServelet"%> 
<%@page import="model.SignUp"%> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>SignUp</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
        integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

    <link rel="stylesheet" type="text/css" href="signup.css">
    <!--Fontawesome CDN-->
    <link href="vendor/bootstrap/CSS/bootstrap.min.CSS" rel="stylesheet">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"
        integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
</head>


<body>

    <div class="container">
        <div class="d-flex justify-content-center h-100">
            <div class="card">
                <div class="card-header">
                    <h3>Sign Up</h3>
                </div>
                <div class="card-body">
                    <form action="<%= request.getContextPath() %>/signup" method="post">
                        <div class="input-group form-group">
                            <input type="text" name="fname" class="form-control" placeholder="First Name">
                        </div>
                        <div class="input-group form-group">
                            <input type="text" name="lname" class="form-control" placeholder="Last Name">
                        </div>
                        <div class="input-group form-group">
                            <input type="text" name="uname" class="form-control" placeholder="Username">
                        </div>
                        <div class="input-group form-group">
                            <input type="text" name="email_id" id="email" class="form-control" placeholder="Email-id">
                        </div>
                        <div class="input-group form-group">
                            <input type="text" class="form-control" id="cemail" placeholder="Confirm Email-id">
                        </div>
                        <div class="input-group form-group">
                            <div class="input-group-prepend">
                                <span class="input-group-text">Date Of Birth</span>
                            </div>

                            <input type="date" name="dob" id="datepicker" min="1900-01-01" max="2100-01-01"
                                class="form-control date">
                        </div>
                        <div class="input-group form-group">
                            <input type="password" id="pass" name="passwd" class="form-control"
                                placeholder="Password">
                        </div>
                        <div class="input-group form-group">
                            <input type="password" id="cpass" class="form-control" placeholder="Confirm Password">
                        </div>

                        <div class="form-group">
                            <input type="submit" onclick="validate()" value="Register"
                                class="btn btn-secondary btn-lg btn-block login_btn">
                        </div>
                    </form>
                </div>

            </div>
        </div>
    </div>
    <script>
        function validate() {
            var password = document.getElementById("pass").value
            var cpassword = document.getElementById("cpass").value

            var email = document.getElementById("email").value
            var cemail = document.getElementById("cemail").value

            if (password != cpassword) {
                alert("Enter correct password on both fields")
            } else {
                if (email != cemail) {
                    alert("Enter correct email on both fields")
                } else {
                    if (password.length < 8) {
                        alert("Minimum password of length 8 is required")
                    }
                }
            }
        }
    </script>
    <!-- JS, Popper.js, and jQuery -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
        integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
        integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
        crossorigin="anonymous"></script>

</body>

</html>