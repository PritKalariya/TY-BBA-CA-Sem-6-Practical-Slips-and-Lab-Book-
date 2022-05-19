<%@ Page Language="vb" AutoEventWireup="false" CodeBehind="WebForm1.aspx.vb" Inherits="Q2_A.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <asp:Label ID="Label1" runat="server" Text="User name:"></asp:Label>
&nbsp;&nbsp;&nbsp;
            <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
            <br />
            <br />
            <br />
            <asp:Label ID="Label2" runat="server" Text="Mode of Payment"></asp:Label>
&nbsp;&nbsp;&nbsp;
            <asp:RadioButtonList ID="RadioButtonList1" runat="server">
                <asp:ListItem>Credit Card</asp:ListItem>
                <asp:ListItem>UPI</asp:ListItem>
                <asp:ListItem>Cash on Dilivery</asp:ListItem>
            </asp:RadioButtonList>
            <br />
            <asp:Label ID="Label3" runat="server" Text="Appropriate Credit Card"></asp:Label>
&nbsp;&nbsp;&nbsp;
            <asp:TextBox ID="TextBox3" runat="server" ValidateRequestMode="Enabled"></asp:TextBox>
            <br />
            <br />
            <br />
            <br />
            <asp:Button ID="Button1" runat="server" Text="Validate" />
        </div>
    </form>
</body>
</html>
