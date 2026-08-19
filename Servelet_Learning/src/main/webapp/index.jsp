<!DOCTYPE html>
<html>
<head>
    <title>Servlet Learning</title>

    <link rel="stylesheet"
          href="<%= application.getContextPath() %>/css/style.css">
</head>

<body>
<jsp:include page="nav.jsp" />
<h1>Hello from JSP</h1>

<img src="images/logo.svg" alt="Logo" width="200">

<br><br>

<form action="<%= application.getContextPath() %>/third" method="POST">
    <input type="text" id="name" name="name" placeholder="enter name"><br>
        <button type="submit">Submit</button>
</form>

<script src="js/script.js"></script>

</body>
</html>
