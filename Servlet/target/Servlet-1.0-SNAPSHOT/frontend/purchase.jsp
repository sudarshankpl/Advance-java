<%-- 
    Document   : purchase
    Created on : Apr 27, 2023, 9:42:01 AM
    Author     : Prasid
--%>


<jsp:include page="menu.jsp"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="main-content">
            <div class="title">Purchase</div>
            <div class="content">

                <form action="../SavePurchase" method="post">
                    <label>Item Name</label> <span id ="combo"></span>
                    <label>Price</label><input type="text" name="itemPrice"/>
                    <label>Quantity</label><input type="text" name="quantity"/>
                    <input type="submit" />
                </form>
            </div>
            
            
          <script type="text/javascript">
     $(document).ready(function(){
        console.log("started");
        $.ajax({
            type: "get",
            url: "../GetItemSelectBox",
            data: null,
            beforeSend: function(){},
            success: function(data,status){
                            $("#combo").html(data);
            },
            
            error:function(xhr,data,status){}
        });
});
</script>

        </div>
    </body>
</html>


