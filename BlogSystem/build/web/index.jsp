
<!DOCTYPE html>
<html>

<head>
    <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css'>
    <link href='https://fonts.googleapis.com/icon?family=Material+Icons' rel='stylesheet'>
    <script src='https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js'></script>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style type="text/css">
        .login-form {
            width: 340px;
            margin: 50px auto;
        }
            .login-form form {
                margin-bottom: 15px;
                background: #f7f7f7;
                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
                padding: 30px;
            }
            .login-form h2 {
                margin: 0 0 15px;
            }
        .form-control, .btn {
            min-height: 38px;
            border-radius: 2px;
        }
        .btn {
            font-size: 15px;
            font-weight: bold;
        }
    </style>
</head>
<body style="background-image:url('images/home.jpg');">
    
    <form action="dologin.jsp" method="post" class="center">
        <div class='row container right'>
        
        <div class="container-fluid center" style="width:60%;height:400px ; background-color:whitesmoke;">

            <div class="login-form">
                <br />
                <h2 class="text-center display-4">Log in</h2>
                <hr />
                <br />
                <div class="form-group">
                    <input class="form-control input-sm chat-input" name="unm" type="text" placeholder = "Username" style = "width:400px;" required>
             
                </div>
                 <br />
                <div class="form-group">
                           <input class="form-control input-sm chat-input" name="pass" type="text" placeholder = "Password" style = "width:400px;" required>
                   
                </div>
                 <br />
                <div class="form-group center ">
                        
                    <button type="submit" class="  btn center" style="width:200px">Log in</button>
                </div>
                 <br /><br />
                <a href="register.jsp">Create an Account</a>
            </div>
        
        </div>
        </div>
    </form>
</body>
</html>