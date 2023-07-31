<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="FirstPage.aspx.cs" Inherits="L4Q1_Car_Manufacturer.FirstPage" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <asp:Label ID="lblMan" runat="server" Width="210px">
                Select a Car Manufacturer:
            </asp:Label>
            <asp:DropDownList ID="dpdManu" runat="server" OnSelectedIndexChanged="dpdManu_SelectedIndexChanged" AutoPostBack="true"></asp:DropDownList>

            <br /><br />

            <asp:TextBox ID="txtModel" runat="server"></asp:TextBox>

        </div>
    </form>
</body>
</html>
