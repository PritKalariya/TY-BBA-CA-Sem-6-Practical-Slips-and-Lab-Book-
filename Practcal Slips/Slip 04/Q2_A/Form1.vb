Public Class Form1
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        TextBox1.Text = DateTimePicker1.Value.Day
        TextBox2.Text = DateTimePicker1.Value.Month
        TextBox3.Text = DateTimePicker1.Value.Year
    End Sub
End Class
