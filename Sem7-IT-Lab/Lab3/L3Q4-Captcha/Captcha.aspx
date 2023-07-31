<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Captcha.aspx.cs" Inherits="L3Q4_Captcha.Captcha" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <h2>Test the Captcha!</h2>

            <asp:Image ID="imgCaptcha" runat="server" />
            <br />
            
            <asp:TextBox ID="txt2" runat="server"></asp:TextBox>
            <br /><br />

            <asp:Button ID="btn1" runat="server" Text="Check" OnClick="btn1_Click" EnableViewState="true"/>
            <br /><br />

            <asp:Label ID="lbl1" runat="server"></asp:Label>

        </div>
    </form>
</body>
</html>
