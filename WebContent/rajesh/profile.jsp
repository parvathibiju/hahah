<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HomePage</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="./profile.css">
</head>

<body>
    <header>
        <nav class="navbar navbar-expand navbar-dark bg-dark">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
            <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
                <a class="navbar-brand" href="../rajesh/profile.jsp">Home</a>
                <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                    <li class="nav-item">
                        <a class="nav-link" href="../biju/P_create_event.jsp">Create Event</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="../tr/requestPage.jsp">Give Request</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="../tr/pendingRequest.jsp">Pending Request</a>
                    </li>

                </ul>
                <ul class="navbar-nav mt-2 mt-lg-0 nav justify-content-end ">
                    <li class="nav-item">
                        <a class="nav-link" href="#">
                            <i class="fas fa-user-alt"></i> user1
                        </a>
                    </li>
                    <li class="nav-item ">
                        <a href="../nithesh/login.jsp">
                            <button class="btn btn-outline-danger my-2 my-sm-0">Logout</button></a>

                    </li>
                </ul>



            </div>
        </nav>
    </header>

    <div class="container">
        <div class="row">
            <div class="col-9" id="container_l">
                <div class="cardl" id="h-scrollbar">
                    <div class="card-header">
                        Request History
                    </div>
                    <div class="card-body">
                        <ul class="list-group">
                            <li class="list-group-item">
                                <div class="Played">Played With : Puddin</div>
                                <div class="Played-Game">
                                    Game Played: Rainbow Six Seige
                                </div>
                                <div class="Duration">
                                    Play Duration - 1:05:30
                                    <p>
                                        <small class="text-muted">Received : 20:51</small>
                                    </p>
                                </div>
                            </li>
                            <li class="list-group-item">

                                <div class="Played">Played With : Puddin</div>
                                <div class="Played-Game">
                                    Game Played: Rainbow Six Seige
                                </div>
                                <div class="Duration">
                                    Play Duration - 1:05:30
                                    <p>
                                        <small class="text-muted">Received : 20:51</small>
                                    </p>
                                </div>

                            </li>
                            <li class="list-group-item">

                                <div class="Played">Played With : Puddin</div>
                                <div class="Played-Game">
                                    Game Played: Rainbow Six Seige
                                </div>
                                <div class="Duration">
                                    Play Duration - 1:05:30
                                    <p>
                                        <small class="text-muted">Received : 20:51</small>
                                    </p>
                                </div>

                            </li>
                            <li class="list-group-item">

                                <div class="Played">Played With : Puddin</div>
                                <div class="Played-Game">
                                    Game Played: Rainbow Six Seige
                                </div>
                                <div class="Duration">
                                    Play Duration - 1:05:30
                                    <p>
                                        <small class="text-muted">Received : 20:51</small>
                                    </p>
                                </div>

                            </li>
                            <li class="list-group-item">

                                <div class="Played">Played With : Puddin</div>
                                <div class="Played-Game">
                                    Game Played: Rainbow Six Seige
                                </div>
                                <div class="Duration">
                                    Play Duration - 1:05:30
                                    <p>
                                        <small class="text-muted">Received : 20:51</small>
                                    </p>
                                </div>
                            </li>

                        </ul>
                    </div>
                </div>

            </div>
            <div class="col-3" id="container_r">
                <div class="card">

                    <img src="https://image.freepik.com/free-vector/gamer-mascot-geek-boy-esports-logo-avatar-with-headphones-glasses-cartoon-character_8169-228.jpg" class="card-img-top" alt="...">
                    <span class="edit_icon">
                        <a href="../tr/editprofile.html">
                        <i class="fas fa-pencil-alt"></i>
                        </a>
                    </span>
                    <div class="card-body">
                        <h5 class="card-title">user1</h5>
                        <div class="card-text">

                            <p>
                                Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.
                            </p>
                            <div class="Email_Card">
                                someone@example.com
                            </div>
                            <div class="Games-Played">
                                <p>Games Played</p>
                                <div class="game-list">
                                    <ul class="list-group">
                                        <li class="list-group-item">Assains Creed</li>
                                        <li class="list-group-item">Demo</li>
                                        <li class="list-group-item">Rainbow Six Siege</li>
                                        <li class="list-group-item">Valaront</li>
                                        <li class="list-group-item">Alpha-Decoders</li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <p class="card-text last-seen"><small class="text-muted">Offline. Last seen 3 mins ago</small></p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>


</body>

</html>