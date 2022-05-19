<%@ Page Language="vb" AutoEventWireup="false" CodeBehind="WebForm1.aspx.vb" Inherits="Q2_A.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <asp:RadioButtonList ID="RadioButtonList1" runat="server">
                <asp:ListItem>Flower 0</asp:ListItem>
                <asp:ListItem>Flower 1</asp:ListItem>
                <asp:ListItem>Flower 2</asp:ListItem>
            </asp:RadioButtonList>
            <br />
            <br />
            <asp:Label ID="Label1" runat="server" Text="Label"></asp:Label>
            <br />
            <br />
            <br />
            <asp:Button ID="Button1" runat="server" Text="Button" />
&nbsp;</div>
    </form>
</body>
</html>
