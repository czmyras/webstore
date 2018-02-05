<%--
  Created by IntelliJ IDEA.
  User: tomek
  Date: 2018-02-04
  Time: 19:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    <title>Produkty</title>
</head>
<body>
    <section>
        <div class="jumbotron">
            <div class="container">
                <h1>Klienci</h1>
                <p>Nasi kluczowi klienci</p>
            </div>
        </div>
    </section>
    <section class="container">
        <div class="row">
            <c:forEach items="${customers}"  var="customer">
                <div class="col-sm-6 col-md-3" style="padding-bottom: 15px;">
                    <div class="thumbnail">
                        <div class="caption">
                            <h3>${customer.name}</h3>
                            <p>${customer.address}</p>
                            <p>${customer.noOfOrdersMade}</p>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </section>
</body>
</html>
