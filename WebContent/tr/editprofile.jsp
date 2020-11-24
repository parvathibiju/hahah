<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Edit</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
        integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

    <link rel="stylesheet" type="text/css" href="./editprofile.css">
    <!--Fontawesome CDN-->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"
        integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
</head>


<body>

    <div class="container" style="margin-left: 20%;">
        <div class="d-flex justify-content-center h-100">
            <div class="card">
                <div class="card-header">
                    <h3>Edit</h3>
                </div>
                <div class="card-body">
                    <form action="../rajesh/profile.html" onsubmit="return validate()">
                        <div class="btn-group">
                            <button type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown"
                                aria-haspopup="true" aria-expanded="false">
                                Username
                            </button>
                            <div class="dropdown-menu">
                                <div class="input-group form-group">
                                    <input type="text" placeholder="New Username" class="form-control" name="Username">
                                </div>
                            </div>
                        </div>
                        <div class="btn-group">
                            <button type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown"
                                aria-haspopup="true" aria-expanded="false">
                                E-mail
                            </button>
                            <div class="dropdown-menu">

                                <div class="input-group form-group">
                                    <input type="text" placeholder="E-mail" class="form-control" name="Email-id">
                                </div>

                            </div>
                        </div>
                        <div class="btn-group">
                            <button type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown"
                                aria-haspopup="true" aria-expanded="false">
                                Bio
                            </button>
                            <div class="dropdown-menu">
                                <div class="input-group form-group">

                                    <textarea class="form-control text-bdy" placeholder="Bio"></textarea>

                                </div>
                            </div>
                        </div>
                        <div class="btn-group">
                            <button type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown"
                                aria-haspopup="true" aria-expanded="false">
                                Password
                            </button>
                            <div class="dropdown-menu">

                                <div class="input-group form-group pass">
                                    <input type="password" placeholder="New Password" id="pass" class="form-control"
                                        name="Password">
                                    <div>
                                        <input type="password" placeholder="Confirm New Password" id="cpass"
                                            class="form-control" name="Confirm Password">

                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <input type="submit" value="Submit" class="btn btn-secondary btn-lg btn-block login_btn">
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

            if (password != cpassword) {
                alert("Enter correct password on both fields")
                return false
            } else {
                if (password.length < 8) {
                    alert("Minimum password of length 8 is required")
                    return false
                }
            }
            return true
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