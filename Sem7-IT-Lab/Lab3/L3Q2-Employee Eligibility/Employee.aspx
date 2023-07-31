<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Employee.aspx.cs" Inherits="L3Q2_Employee_Eligibility.Employee" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <asp:Label ID="lblID" runat="server" Width="120px">
                Employee ID:
            </asp:Label>
            <asp:DropDownList ID="dpdID" runat="server" OnSelectedIndexChanged="dpdID_SelectedIndexChanged" AutoPostBack="true" AppendDataBoundItems="true">
                <asp:ListItem id="liID" runat="server" Value="" Text="Select an ID"></asp:ListItem>
            </asp:DropDownList>

            <br />

            <asp:Label ID="lblName" runat="server" Width="120px">
                Employee Name:
            </asp:Label>
            <asp:TextBox ID="txtName" runat="server"></asp:TextBox>

            <br />

            <asp:Label ID="lblDOJ" runat="server" Width="120px">
                DOJ(dd-mm-yyyy):
            </asp:Label>
            <asp:TextBox ID="txtDOJ" runat="server"></asp:TextBox>

            <br /><br />

            <asp:Button ID="btnAIE" runat="server" Text="Am I Eligible?" OnClick="btnAIE_Click"/>

            <br />

            <asp:Panel ID="pnl" style="LEFT: 350px; POSITION: absolute; TOP: 16px" runat="server" 
			Height="307px" Width="339px" HorizontalAlign="Center">
                <asp:Image id="img" runat="server" Height="500px" Width="400px" />
                <br /><br /><br />
                <asp:Label ID="lblMsg" runat="server"></asp:Label>
            </asp:Panel>
        </div>
    </form>
</body>
</html>
