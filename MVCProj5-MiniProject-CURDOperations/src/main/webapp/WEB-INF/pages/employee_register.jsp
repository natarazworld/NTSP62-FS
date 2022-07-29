<%@taglib uri="http://www.springframework.org/tags/form"  prefix="frm"%>


<h1 style="color:blue;text-align:center"> Register  Employee</h1>

 <frm:form method="POST" modelAttribute="emp" action="employee_add">
   <table border="1"  bgcolor="cyan"  align="center" >
     <tr>
       <td> Employee name:: </td>
       <td> <frm:input path="ename"/> </td>
    </tr>
    <tr>
       <td> Employee Desg:: </td>
       <td> <frm:input path="job"/> </td>
    </tr>
    <tr>
       <td> Employee Salary:: </td>
       <td> <frm:input path="sal"/> </td>
    </tr>
    <tr>
       <td colspan="2"  align="center"> <input type="submit"  value="register"></td>
    </tr>
   
   
   </table>
 
 </frm:form>