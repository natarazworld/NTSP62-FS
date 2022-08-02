<%@page isELIgnored="false"  %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<c:choose>
  <c:when test="${!empty empsData }">
     <table  boder="1" align="center" bgcolor="cyan">
        <tr>
          <th> emp no </th> <th> emp name</th> <th> desg </th> <th> salary </th> <th colspan="2"> operations </th>
        </tr>
        
        <c:forEach var="emp" items="${empsData}">
          <tr bgcolor="yellow">
              <td>${emp.empno }  </td>
              <td>${emp.ename}  </td>
              <td>${emp.job }  </td>
               <td>${emp.sal }  </td>
               <td><a href="employee_edit?no=${emp.empno}"><img src="resources/images/edit.jpeg" width="30px" height="30px"></a> </td>
               <td><a href="employee_delete?no=${emp.empno}" onclick="return confirm('Do u want to Delete?')"><img src="resources/images/delete.jpeg" width="30px" height="30px"></a> </td>
          </tr>
        
        </c:forEach>
        
     </table>
    </c:when>
    
    <c:otherwise>
              <h1 style="color:red;text-align:center"> Records not found </h1>
    </c:otherwise>

</c:choose>

   <h1 style="color:red;text-align:center"><a href="employee_add"><img src="resources/images/add.jpeg" widht="50px" height="50px"></a></h1>
   
    <br><br>
                                    <h1 style="text-align:center">${resultMsg}</h1>
                                    
     <br><br>
            <center> <a href="./" ><img src="resources/images/home.jpeg"  widht="50px" height="50px"></a>  </center>
                                    