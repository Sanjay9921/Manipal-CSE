<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="ECardGenerator.aspx.cs" Inherits="L3Q3_E_Card_Generator.ECardGenerator" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>

    <link rel="stylesheet" href="StyleSheet1.css" type="text/css" />


</head>
<body>
    <form id="form1" runat="server">
        <div>
            <div class="div-bg">

				<h1>Generate your personal E-Card!</h1>

				<h3>Fonts</h3>

				<asp:Label ID="lblFontFam" runat="server" Width="120px" Font-Bold="true">
					Font:
				</asp:Label>
				<asp:dropdownlist ID="dpdFontFam" runat="server" Height="22px" Width="194px"></asp:dropdownlist>
				
				<br /><br />

				<asp:Label ID="lblFontSize" runat="server" Width="120px" Font-Bold="true">
					Font Size:
				</asp:Label>
				<br />
				<asp:textbox ID="txtFontSize" runat="server" TextMode="Number" Width="183px"></asp:textbox>
				<br /><br />

				<asp:Label ID="lblFontColor" runat="server" Width="120px" Font-Bold="true">
					Font Color:
				</asp:Label>
				<br />
				<asp:DropDownList ID="dpdFontColor" runat="server" Height="22px" Width="194px"></asp:DropDownList>
				<br /><br />

				<h3>Themes and Styles</h3>

				<asp:Label ID="lblBG" runat="server" Width="120px" Font-Bold="true">
					Background Color:
				</asp:Label>
				<br />
				<asp:dropdownlist ID="dpdBG" runat="server" Height="22px" Width="194px"></asp:dropdownlist>
				<br /><br />
				
				<asp:Label ID="lblBorder" runat="server" Width="130px" Font-Bold="true">
					Choose a border style:
				</asp:Label>				
				<br />
				<asp:radiobuttonlist ID="rblBorder" runat="server" Height="59px" Width="177px" Font-Size="X-Small"></asp:radiobuttonlist>

				<asp:checkbox ID="chkPicture" runat="server" Text="Add the Default Picture" Font-Bold="true"></asp:checkbox>
				<br /><br />
				
				<asp:Label ID="lblGreet" runat="server" Width="180px" Font-Bold="true">
					Enter the greeting text below:
				</asp:Label>
				<br />
				<asp:textbox ID="txtGreeting" runat="server" Height="85px" Width="240px" TextMode="MultiLine"></asp:textbox>
				<br /><br />
				<asp:button ID="cmdUpdate" runat="server" Height="24px" Width="71px" Text="Update" onclick="cmdUpdate_Click"></asp:button>
			</div>

			<asp:panel ID="pnlCard" CssClass="pnl-bg" runat="server" Height="507px" Width="339px" HorizontalAlign="Center">
				<br />&nbsp; 
			    <asp:Label ID="lblGreeting" runat="server" Height="150px" Width="256px"></asp:Label>
			    <br /><br /><br />
			    <asp:Image ID="imgDefault" runat="server" Height="160px" Width="212px" Visible="False"></asp:Image>
		    </asp:panel>

        </div>
    </form>
</body>
</html>
