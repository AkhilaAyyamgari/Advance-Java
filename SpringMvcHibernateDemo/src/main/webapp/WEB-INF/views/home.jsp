<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter Movie Details</h1>
<form:form action="./addMovie" method="post" modelAttribute="movie">
<form:input type="number" path="id" placeholder="Enter Id"/>
<form:input type="text" path="name" placeholder="Movie here"/>
<form:input type="text" path="releaseDate" placeholder="ReleaseDate"/>
<form:input type="long" path="budget" placeholder="Enter Budget"/>
<button>AddMovie</button>
</form:form>
<br><br><br><br>
<form:form action="./updateMovie" modelAttribute="movie">
<form:input type="number" path="id" placeholder="Enter Id"/>
<form:input type="text" path="name" placeholder="Movie here"/>
<form:input type="text" path="releaseDate" placeholder="ReleaseDate"/>
<form:input type="long" path="budget" placeholder="Enter Budget"/>
<button>UpdateMovie</button>
</form:form>
<br><br><br>
<form:form action = "./deleteMovie" modelAttribute="movie">
<button>DeleteMovie</button>
</form:form>
<br><br><br>
<form:form action = "./getAllMovies" modelAttribute="movie">
<button>GetAllMovies</button>
</form:form>
</body>
</html>