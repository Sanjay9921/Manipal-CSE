<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="ShoppingCart.aspx.cs" Inherits="L4Q3_Shopping_Cart.FirstPage" %>

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

            <asp:Label ID="lblProds" runat="server" Width="120px">
                Select:    
            </asp:Label>
            <asp:DropDownList ID="dpdProds" runat="server"></asp:DropDownList>

            <br />

            <asp:Label ID="lblQuant" runat="server" Width="120px">
                Qunatity:
            </asp:Label>
            <asp:TextBox ID="txtQuant" runat="server" TextMode="Number"></asp:TextBox>

            <br />

            <asp:Button ID="btnSubmit" runat="server" Text="Continue Shopping" OnClick="btnSubmit_Click"/>

            <br />

            <asp:Label ID="lblCart" runat="server"></asp:Label>

        </div>
    </form>
</body>
</html>
