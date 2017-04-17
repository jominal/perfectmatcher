<!DOCTYPE html>
<html>
<head>
<title>Qivos MatchMaker</title>
<style>
body {
	background-repeat: no-repeat;
	background-size: 80%;
	max-width: 75%;
	margin: auto;
}

.blackText {
	color: rgb(29, 30, 32);
}

.blueText {
	color: rgb(58, 100, 155);
	font-weight: bold;
}

h1 {
	float: center;
	color: rgb(27, 49, 83);
	margin: 5%;
	text-align: center;
}

header h1 {
	font-weight: normal;
	float: center;
	color: rgb(27, 49, 83);
	margin: 5%;
	text-align: center;
}

form {
	float: center;
	margin: 1%;
	text-align: center;
}
</style>
</head>
<body>

	<div id="wrapper">
		<img
			src="http://www.qivos.com/wp-content/uploads/2016/08/logo_qivos.png" />
	</div>
	<header>
		<h1>
			<span class="blackText">WE CREATE CUSTOMER</span>&nbsp;<span
				class="blueText">LOYALTY</span>
		</h1>
	</header>
	<h1>Qivos MatchMaker</h1>



	<form action="webapi/perfectmatcher/mate" name="Form1" id="Form1"
		method="post">
		<p>
			<input type="text"
				placeholder="Enter your name and find your mate..." size="35"
				maxlength="48" pattern="[A-Za-z]{4,}"
				title="INSERT 4 OR MORE ALPHABETIC CHARACTERS!!" name="malename"
				id="malename" />
		</p>
		<input type="submit" value="I'm feeling lucky" />
	</form>

	<form action="webapi/perfectmatcher/asciiSum" method="post">
		<p>
			<input type="text" placeholder="Convert name to ascii value..."
				size="35" maxlength="48" pattern="[A-Za-z]{4,}"
				title="INSERT 4 OR MORE ALPHABETIC CHARACTERS!!" name="malename"
				id="malename">
		</p>
		<input type="submit" value="Convert" />
	</form>


	<footer>
		<a href="http://www.qivos.com/" target="_blank">www.qivos.com</a>
		<p>Designed by Giannis Konomis</p>
	</footer>

</body>
</html>