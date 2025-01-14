<%@page language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="calculator.css">
</head>
    <body>
      <h2>Calculator</h2>

      <form action="add">
          <label for="num1">Enter first number : </label>
          <input type="text" id="num1" name="num1"><br>
          <label for="num2">Enter second number : </label>
          <input type="text" id="num2" name="num2"><br>
          <input type="submit" value="Submit"><br>
      </form>
    </body>
</html>