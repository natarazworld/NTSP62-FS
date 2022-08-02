<%@taglib uri="http://www.springframework.org/tags/form"  prefix="frm"%>


<h1 style="color:blue;text-align:center"> Modify the  Employee</h1>

 <frm:form method="POST" modelAttribute="emp" action="employee_edit">
   <table border="1"  bgcolor="cyan"  align="center" >
     <tr>
       <td> Employee no:: </td>
       <td> <frm:input path="empno" readonly="true"/> </td>
    </tr>
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
       <td colspan="2"  align="center"> <input type="submit"  value="update employee"></td>
    </tr>
   
   
   </table>
 
 </frm:form>