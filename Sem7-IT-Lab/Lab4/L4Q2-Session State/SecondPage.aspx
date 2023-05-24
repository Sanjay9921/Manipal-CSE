<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="SecondPage.aspx.cs" Inherits="L4Q2_Session_State.SecondPage" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <asp:Label ID="lblFirst" runat="server"></asp:Label>
            <br />
            <asp:Button ID="btnSecond" runat="server" Text="+1 Counter" OnClick="btnSecond_Click"/>
            <br /><br />

            <asp:Label ID="lblCounter" runat="server"></asp:Label>

        </div>
    </form>
</body>
</html>
