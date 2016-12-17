<%-- 
    Document   : index
    Created on : 2 Nov, 2016, 6:29:54 PM
    Author     : sai
--%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    boolean flag = true;
    try {
        Cookie cookie = null;
        Cookie[] cookies = null;

        cookies = request.getCookies();
        if (cookies != null) {

            for (int i = 0; i < cookies.length; i++) {
                cookie = cookies[i];
                
                if (cookie.getValue().toString().equals("invalid")) {
                    flag = false;
                }
            }
        }

    } catch (Exception e) {

    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link href="bootstrap-3.3.7-dist/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="font-awesome-4.6.3/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/index.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
          <section><div class="welcome"><marquee><b> WELCOME TO HDFC BANK</b></marquee></div></section>
          <form id="main" action="login1" method="post">
             
            <center><h1> Login</h1></center>
                        <div>

                            <table>
                                <tr>
                                    <td>
                                        <label id="loginlabel" style="font-family: cursive;"><h4>AccountId &nbsp</h4></label>                                    </td>
                                    <td>
                                        <input type="text" class="form-control" name="AccountId" placeholder="Enter AccountId" title="AccountId" style="width:200px;padding:10px;border-radius:5px;">
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <label id="loginlabel"><h4>Password &nbsp</h4></label>
                                    </td>
                                    <td>
                                        <input type="password" class="form-control" name="Password" placeholder="********" title="Password" style="width:200px;padding:10px;border-radius:5px;">
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        &nbsp;
                                    </td>
                                    <td>
                                        &nbsp;
                                    </td>
                                </tr>
                            </table>
                        </div>
                        <input type="submit" id="loginbtn" value="Login" name="login" class="btn btn-success" style="width: 50%;padding: 10px;border-radius:5px;">
                        
                        <center><a href="NewAccount" ><h4>Create a New Account</h4></a></center>

        </form>
          
         <script src="js/jquery.js" type="text/javascript"></script>
          <script src="src/bose.slider.js" type="text/javascript"></script>
          <script>
              $(document).ready(function() {

			$(".bose").bose({
				images : [ "images/2.jpg", "images/3.jpg", "images/4.jpg", "images/5.jpg", "images/a.jpg"],
				imageTitles: [
					['Title 1', 'Description one here'],
					['Title 2', 'Description two here'],
					['Title 3', 'Description three here']
				],
				imageAttributes: [
					{'border': '1px solid #ff0000', 'boxShadow': '0 0 5px rgba(0, 0, 0, 0.2)'},
					{'border': '1px solid #ff0000', 'boxShadow': '0 0 5px rgba(0, 0, 0, 0.2)'},
					{'border': '1px solid #ff0000', 'boxShadow': '0 0 5px rgba(0, 0, 0, 0.2)'}
				],
				onComplete : function(){
					console.log("Trigger onComplete!");
				},
				onSlideStart : function(index){
					console.log(index + ' destroying');
				},
				onSlideEnd : function(index){
					console.log(index + ' showed');
				},
				onPause : function(index){
					console.log('Paused');
				},
				pagination : { show : true, container : '.bose-pagination', text : true },
				thumbs : { show : true, container : '.bose-thumbs', dimension : { width : 150, height: 70 }, text : true },
				responsive : true,
				autofit : false
			});

			$('.play').click(function(){
				$(".bose").bose('play');
			});

			$('.pause').click(function(){
				$(".bose").bose('pause');
			});

			$('.previous').click(function(){
				$(".bose").bose('previous');
			});

			$('.next').click(function(){
				$(".bose").bose('next');
			});

		});
          </script>
    </body>
</html>
