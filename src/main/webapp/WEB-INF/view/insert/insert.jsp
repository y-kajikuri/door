<%@ page contentType="text/html; charset=UTF-8" %>

<html>
  <head>
    <title>JSPサンプル</title>
  </head>
  <body>
             <table class="purchase-list-tbl">
            <thead>
                <tr>
                    <th>MESSAGE</th>
                   
            </thead>
            <tbody>
               <c:forEach var="bean" items="${bean}">
                <tr>
                    <td>${f:h(bean.message)}</td>
                </tr>
                </c:forEach>    
            </tbody>
        </table>          
  </body>
</html>