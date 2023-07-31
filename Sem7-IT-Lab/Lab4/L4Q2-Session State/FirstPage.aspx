<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="FirstPage.aspx.cs" Inherits="L4Q2_Session_State.FirstPage" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <asp:Label ID="lblName" runat="server" Width="120px">
                Name:
            </asp:Label>
            <asp:TextBox ID="txtName" runat="server"></asp:TextBox>
            <br />

            <asp:Label ID="lblRNO" runat="server" Width="120px">
                RNO:
            </asp:Label>
            <asp:TextBox ID="txtRNO" runat="server"></asp:TextBox>
            <br />

            <asp:Label ID="lblSub" runat="server" Width="120px">
                Subjects:
            </asp:Label>
            <asp:DropDownList ID="dpdSub" runat="server" OnSelectedIndexChanged="dpdSub_SelectedIndexChanged"></asp:DropDownList>

            <br /><br />

            <asp:Button ID="btnPage1" runat="server" Text="Submit" OnClick="btnPage1_Click"/>

        </div>
    </form>
</body>
</html>
