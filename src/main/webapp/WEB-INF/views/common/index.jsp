<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html lang="en" class="loading">
  <head>
    <title>Dashboard1 - Apex responsive bootstrap 4 admin template</title>
    <jsp:include page="headTag.jsp" />
  </head>
  <body data-col="2-columns" class=" 2-columns ">
    <div class="wrapper">
	  <jsp:include page="menu.jsp" />
	  <jsp:include page="header.jsp" />
      <div class="main-panel">
        <div class="main-content">
          <div class="content-wrapper" id="pageLoaderDiv">
          	<!--All Page are loaded Here-->
          </div>
        </div>
        <jsp:include page="footer.jsp" />
      </div>
    </div>

    <jsp:include page="notificationSidebar.jsp" />
    <jsp:include page="themeCustom.jsp" />
    <jsp:include page="footerScript.jsp" />
    <script type="text/javascript">
    $(document).ready(function(){
    	$.ajax({
            url: '${pageContext.request.contextPath}/dashboard/SalesDashboard',
            type: 'post',
            async : false,
            success :function(data){
              $('.content-wrapper').empty().html(data);
            },
          }); 
    });
      function loadPage(data){    
    	  $.ajax({
				url : data,
				type : 'post',
				async : false,
				data : {},
				success : function(data) {
					$(".content-wrapper").html(data);
					$('.content-wrapper').show();
				}
			}); 
			
    	  //$( ".content-wrapper" ).load( data );
      }
    </script>
  </body>
</html>