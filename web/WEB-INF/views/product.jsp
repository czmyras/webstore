<%--
  Created by IntelliJ IDEA.
  User: tomek
  Date: 08-02-2018
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    <title>Product</title>
</head>
<body>
    <section>
        <div class="jumbotron">
            <div class="container">
                <h1>Produkt</h1>
            </div>
        </div>
    </section>
    <section class="container">
        <div class="row">
            <div class="col-md-5">
                <h3>${product.name}</h3>
                <p>${product.description}</p>
                <P>
                    <strong>Kod produktu: </strong><span class="label label-warning">${product.productId}</span>
                </P>
                <p>
                    <strong>Producent: </strong>${product.manufacturer}
                </p>
                <p>
                    <strong>Kategoria: </strong>${product.category}
                </p>
                <p>
                    <strong>Dostępna liczba sztuk</strong>:${product.unitsInStock}
                </p>
                <h4>${product.unitPrice} PLN</h4>
                <p>
                    <a href="#" class="btn btn-warning btn-large">
                        <span class="glyphicon-shopping-cart glyphicon"></span> Zamów teraz
                    </a>
                </p>

            </div>
        </div>
    </section>

</body>
</html>
