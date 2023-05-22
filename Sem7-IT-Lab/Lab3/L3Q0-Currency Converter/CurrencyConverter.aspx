<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="CurrencyConverter.aspx.cs" Inherits="L3Q0_Currency_Converter.CurrencyConverter" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <asp:Label runat="server" ID="lb">Input Currency:</asp:Label>
            <asp:TextBox runat="server" ID="inputCurrency"></asp:TextBox>

            <asp:Label runat="server" ID="fromLabel">From USD:</asp:Label>
            <asp:DropDownList runat="server" ID="fromCurrencyDropDown"></asp:DropDownList>

            <br /><br />

            <asp:Label runat="server" ID="labelAns"></asp:Label>
            <br />
            <br />

            <asp:Button runat="server" Text="Convert" OnClick="SubmitClickedEvent" />
            <br /><br />
        </div>
    </form>
</body>
</html>
