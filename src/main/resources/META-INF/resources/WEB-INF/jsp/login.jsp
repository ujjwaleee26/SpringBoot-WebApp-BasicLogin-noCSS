<html>
<head>
   <title>Login Page</title>
</head>
<body>
   <h1>Login Form</h1>
   <%-- <h1> Welcome to Login Page ${name } </h1> --%>
   <pre>${error_message}</pre>
   <Form method="post">
   <span><label>Username :</label><input type="text" name="name"></span><br><br>
   <span><label>Password :</label><input type="password" name="password"></span><br><br>
   <button type="submit" >Submit</button>
   
</Form>
</body>
</html>