<%@page language="java" %>

<html>
<head>
 <link rel="stylesheet" href="style.css">
</head>
    <body>
       <h2>Calculator</h2>
       <div>
           <form action="addAlien" method="post">
               <label for="aid">Id :</label>
               <input type="text" id="aid" name="aid"><br><br>

               <label for="aname">Name :</label>
               <input type="text" id="aname" name="aname"><br><br>

               <button type="submit">Submit</button>
           </form>
       </div>
    </html>
</body>