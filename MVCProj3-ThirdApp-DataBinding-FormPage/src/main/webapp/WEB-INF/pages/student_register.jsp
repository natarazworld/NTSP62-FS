<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>


<frm:form method="POST"  action="register" modelAttribute="stud">
   <table align="center"  bgcolor="cyan">
      <tr>
        <td> student number :: </td>
         <td><frm:input path="sno"/></td>
      </tr>
       <tr>
        <td>student name :: </td>
         <td><frm:input path="sname"/></td>
      </tr>
       <tr>
        <td> address :: </td>
         <td><frm:input path="sadd"/></td>
      </tr>
       <tr>
        <td>Student Avg :: </td>
         <td><frm:input path="avg"/></td>
      </tr>
       <tr colspan="2">
          <td><input type="submit" value="register"></td>
      </tr>
   </table>


</frm:form>