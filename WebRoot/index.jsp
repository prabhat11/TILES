    <%@ taglib uri="/struts-tags" prefix="s" %>  
    <s:form action="login" method="post">  
    <s:textfield name="us.name" label="Name"></s:textfield>  
    <s:password name="us.password" label="Password"></s:password>  
    <s:submit value="login"></s:submit>  
    </s:form>  