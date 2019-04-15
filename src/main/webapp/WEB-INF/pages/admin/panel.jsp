<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <!-- header -->
    <div>
        <h1>PrepList</h1>
        <p>Today <%= new java.util.Date() %></p>
    </div>

    <div>       <!-- content -->
        <div>    <!-- buttons holder -->
            <button onclick="location.href='pages/auth/list'">Login</button>
            <button onclick="location.href='pages/auth/exit'">Exit</button>
        </div>
    </div>
</body>
</html>