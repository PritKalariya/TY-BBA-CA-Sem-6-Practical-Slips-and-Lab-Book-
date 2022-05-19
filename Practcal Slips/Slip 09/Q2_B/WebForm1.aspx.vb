Public Class WebForm1
    Inherits System.Web.UI.Page

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load

    End Sub

    Protected Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        If GetNum.Text = StrReverse(GetNum.Text) Then
            LblDisplay.Text = "The number is a palindrome"
        Else
            LblDisplay.Text = "The number is not a palindrome"
        End If
    End Sub
End Class