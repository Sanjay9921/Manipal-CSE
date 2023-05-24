<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Login.aspx.cs" Inherits="L4Q4_Login_Page.Login" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <h1>Login Page</h1>

            <asp:Label ID="lblUName" runat="server" Width="120px">
                Username:
            </asp:Label>
            <asp:TextBox ID="txtUName" runat="server"></asp:TextBox>
            <br />

            <asp:Label ID="lblPswd" runat="server" Width="120px">
                Password:
            </asp:Label>
            <asp:TextBox ID="txtPswd" runat="server" TextMode="Password"></asp:TextBox>

            <br /><br />

            <asp:Button ID="btnLogin" runat="server" Text="Login" OnClick="btnLogin_Click" />
            <br /><br />

            <asp:Label ID="lblLoginCnt" runat="server" Width="200px"></asp:Label>

        </div>
    </form>
</body>
</html>
