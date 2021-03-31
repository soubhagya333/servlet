<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body background="color:red"> 

<header><center><h1>Xworkz</h1><center/></header>
<br>
<br>
<br>
       <center> <div>
            <h3> Choose File to Upload in Server </h3>
            <form action="upload" method="post" enctype="multipart/form-data">
                <input type="file" name="file" />
                <br>
                <input type="submit" value="upload" />
            </form>          
      </center>  </div>
       <br>
       <br>
       <br>
 <footer><center>copyright@2021<center/></footer>

</body>
</html>