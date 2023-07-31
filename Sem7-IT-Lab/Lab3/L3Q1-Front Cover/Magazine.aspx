<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Magazine.aspx.cs" Inherits="L3Q1_Front_Cover.Magazine" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <h1>Create your own front cover!!</h1>

            <h3>Fonts</h3>

            <asp:Label ID="lblFontFam" runat="server" Width="120px">
                Font Family:
            </asp:Label>
            <asp:DropDownList ID="dpdFontFam" runat="server" AutoPostBack="true"></asp:DropDownList>
            <br />
            
            <asp:Label ID="lblFontSize" runat="server" Width="120px">
                Font Size:
            </asp:Label>
            <asp:TextBox ID="txtFontSize" runat="server" TextMode="Number"></asp:TextBox>
            <br />
            <asp:Label ID="lblFontColor" runat="server" Width="120px">
                Font Color:
            </asp:Label>

            <asp:DropDownList ID="dpdFontColor" runat="server" AutoPostBack="true"></asp:DropDownList>
            <br />

            <h3>Themes and Styles</h3>

            <asp:Label ID="lblBG" runat="server" Width="120px">
                BG Color:
            </asp:Label>
            <asp:DropDownList ID="dpdBG" runat="server"></asp:DropDownList>
            <br />

            <asp:Label ID="lblBorder" runat="server" Width="120px">
                Border Style:
            </asp:Label>
            <asp:RadioButtonList ID="rblBorder" runat="server"></asp:RadioButtonList>

            <h3>Image</h3>
            <asp:Label ID="lblImg" runat="server" Width="120px">
                Select an image:
            </asp:Label>
            <asp:DropDownList ID="dpdImg" runat="server"></asp:DropDownList>

            <h3>Write a Title:</h3>
            <asp:TextBox ID="txtInput" runat="server" Height="120px" Width="200px"></asp:TextBox>
            <br /><br />
            <asp:Button ID="btnSubmit" runat="server" Text="Submit" OnClick="btnSubmit_Click" />

            <asp:Panel ID="pnl" runat="server" style="left: 450px; position: absolute; top: 100px;" Height="500px" Width="300px" HorizontalAlign="Center">
                <asp:Label ID="lblTitle" runat="server" Height="150px" Width="256px"></asp:Label>
                <br /><br /><br />

                <asp:Image ID="img" runat="server" Height="160px" Width="212px"/>
            </asp:Panel>

        </div>
    </form>
</body>
</html>
