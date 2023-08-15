<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form" %>


    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Department detail</title>
    </head>

    <body>

        <sp:form action="InsertDepartment" meathod="post" modelAttribute="department">
            Enter Department No:
            <sp:input path="deptno" /><br>
            Enter Department Name:
            <sp:input path="dname" /> <br>
            Enter Department Location:
            <sp:input path="loc" /><br>

            <input type="submit" value="SUBMIT" />

        </sp:form>


    </body>

    </html>