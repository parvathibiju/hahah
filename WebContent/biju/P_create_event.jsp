<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title> 					Create An Event

    </title>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>

	<link rel="stylesheet" type="text/css" href="/ncp-proj-trial-1/biju/vendor/bootstrap/css/bootstrap.min.css">

	<!-- <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css"> -->
<!--  -->
	<!-- <link rel="stylesheet" type="text/css" href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css"> -->

	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">

	<!-- <link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css"> -->

	<!-- <link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css"> -->

	<!-- <link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css"> -->

	<link rel="stylesheet" type="text/css" href="/ncp-proj-trial-1/biju/vendor/daterangepicker/daterangepicker.css">

	<link rel="stylesheet" type="text/css" href="/ncp-proj-trial-1/biju/util.css">
	
	<link rel="stylesheet" type="text/css" href="/ncp-proj-trial-1/biju/main.css">
	<link rel="stylesheet" type="text/css" href="/ncp-proj-trial-1/biju/CSS/create_event.css">
</head>
<header>
	<nav class="navbar navbar-expand navbar-dark bg-dark">
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		  </button>
		<div class="collapse navbar-collapse" id="navbarTogglerDemo01">
			<a class="nav-link" href="../rajesh/profile.jsp">Home</a>
			<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
				<li class="nav-item">
					<a class="nav-brand" href="/biju/P_create_event.jsp">Create Event</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="../tr/requestPage.jsp">GiveRequest</a>
				</li>
				<li class="nav-item">
					<a class="navbar-link" href="../tr/pendingRequest.jsp">Pending Request</a>
				</li>

			</ul>
			<ul class="navbar-nav mt-2 mt-lg-0 nav justify-content-end ">
				<li class="nav-item">
					<a class="nav-link" href="#">
						<i class="fas fa-user-alt"></i> @noobieGod_06
					</a>
				</li>
				<li class="nav-item ">
					<a href=" ../nithesh/login.html ">
						<button class="btn btn-outline-danger my-2 my-sm-0">Logout</button></a>

				</li>
			</ul>
		</div>
	</nav>
</header>
<body>
    

	<div class="container-contact100">
		<div class="contact100-map" id="google_map" data-map-x="40.722047" data-map-y="-73.986422" data-pin="images/icons/map-marker.png" data-scrollwhell="0" data-draggable="1"></div>

		<div class="wrap-contact100">
			<div class="contact100-form-title" style="background-image: url(/ncp-proj-trial-1/biju/CSS/create_event.jpeg);">
				<span class="contact100-form-title-1">
					Create An Event
				</span>

				<span class="contact100-form-title-2">
					Make your event happen!!
				</span>
			</div>

			<form class="contact100-form validate-form" action ='/ncp-proj-trial-1/insertevent' method='POST'>
			
				<div class="wrap-input100 validate-input" data-validate="Name is required">
				<label class="label-input100" for="Club">Choose the club:</label>
				<div class="select">
					  <select id="cid" name="cid">
					    <option value="1">Natya - Dance</option>
					    <option value="2">Raga - Music</option>
					    <option value="3">Kavi - Poetry</option>
					    <option value="4">Kalakriti - Art</option>
					    <option value="5">Debate Club</option>
					    <option value="6">Writers Corner</option>
  					</select>
  					</div>
				</div>
				<div class="wrap-input100 validate-input" data-validate="Name is required">
					<span class="label-input100">Event Name:</span>
					<input class="input100" type="text" name="event_name" placeholder="Enter full name">
					<span class="focus-input100"></span>
				</div>

				<div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
					<span class="label-input100">Location :</span>
					<input class="input100" type="text" name="event_loc" placeholder="Where will the event happen">
					<span class="focus-input100"></span>
				</div>

				<div class="wrap-input100 validate-input" data-validate="Phone is required">
					<span class="label-input100">Category:</span>
					<input class="input100" type="text" name="event_category" placeholder="Lone wolf or a pack?">
					<span class="focus-input100"></span>
				</div>

				<div class="wrap-input100 validate-input" data-validate = "Message is required">
					<span class="label-input100">Registration End Date:</span>
					<input class="input100" name="event_reg_enddate" type="date" placeholder="DD-MM-YYYY">
					<span class="focus-input100"></span>
				</div>
				<div class="wrap-input100 validate-input" data-validate = "Message is required">
					<span class="label-input100">Event Date:</span>
					<input class="input100" type="date" name='date' placeholder="DD-MM-YYYY">
					<span class="focus-input100"></span>
				</div>
				<div class="wrap-input100 validate-input" data-validate = "Message is required">
					<span class="label-input100">Event Time:</span>
					<input class="input100" type="time" name='time' placeholder="DD-MM-YYYY">
					<span class="focus-input100"></span>
				</div>
				<div class="wrap-input100 validate-input" data-validate = "Message is required">
					<span class="label-input100">Event Description:</span>
					<textarea class="input100" name="event_desc" placeholder="Why should people attend...(Make sure to give all the information)" required></textarea>
					<span class="focus-input100"></span>
				</div>
				<div class="wrap-input100 validate-input" data-validate = "Message is required">
					<span class="label-input100">Attendee limit:</span>
					<input class="input100" name="max_count" type="number" placeholder="How many can attend?" required>
					<span class="focus-input100"></span>
				</div>
				<div class="wrap-input100 validate-input" >
					<span class="label-input100">Event Link:</span>
					<input type="url" class="input100" placeholder="Link for more info...">
					<span class="focus-input100"></span>
				</div>
				<div class="container-contact100-form-btn">
					<input type="submit" class="contact100-form-btn" value="Create Event">
						
				</div>
			</form>
		</div>
	</div>



	

</body>
</html>
