<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link rel="stylesheet" href="webjars/bootstrap/5.2.3/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet">
    <title>
        New Todo Page
    </title>
</head>
<body>
<div class="container">
    <h1>Enter Todo Details</h1>
    <form:form method="post" modelAttribute="todo">
        <fieldset class="mb-3">
            <form:label path="description">Description</form:label>
            <form:input type="text" path="description" required="required"/>
            <form:errors path="description" cssClass="text-warning"/>
        </fieldset>
        <fieldset class="mb-3">
            <form:label path="targetDate">Target Date</form:label>
            <form:input type="text" path="targetDate" required="required"/>
            <form:errors path="targetDate" cssClass="text-warning"/>
        </fieldset>

        <form:input type="hidden" path="id" required="required"/>
        <form:input type="hidden" path="done" required="required"/>
        <input type="submit" class="btn btn-success"/>
    </form:form>
</div>
<script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.4/jquery.min.js"></script>
<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
<script type="text/javascript">
    $('#targetDate').datepicker({
        format: 'yyyy-mm-dd',
        startDate: '-3d'
    })
</script>
</body>
</html>