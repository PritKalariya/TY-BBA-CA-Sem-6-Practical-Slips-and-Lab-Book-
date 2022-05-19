Public Class WebForm1
    Inherits System.Web.UI.Page

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load

    End Sub

    Protected Sub ListBox1_SelectedIndexChanged(sender As Object, e As EventArgs) Handles ListBox1.SelectedIndexChanged
        If ListBox1.Items(0).Selected = True Then
            Image1.ImageUrl = "C:\Users\LENOVO\Pictures\Saved Pictures\09f7oeaum7251.jpg"
            Image1.Visible = True
        ElseIf ListBox1.Items(1).Selected = True Then
            Image1.ImageUrl = "C:\Users\LENOVO\Pictures\Saved Pictures\steam profile picture -steam avatar (11).jpg"
        ElseIf ListBox1.Items(2).Selected = True Then
            Image1.ImageUrl = "C:\Users\LENOVO\Pictures\Saved Pictures\IMG_20191222_001724_709.jpg"
        End If
    End Sub

    Protected Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        If ListBox1.Items(0).Selected = True Then
            Label1.Text = 400
        ElseIf ListBox1.Items(1).Selected = True Then
            Label1.Text = 700
        ElseIf ListBox1.Items(2).Selected = True Then
            Label1.Text = 200
        End If
    End Sub
End Class