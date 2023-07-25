namespace DAL;
using MySql.Data.MySqlClient;
using BOL;

public class DbManager
{
    public static string conString = @"server=localhost;port=3306;user=root;password=admin@123;database=msdotnet";

    public static bool Insert(Author a)
    {
        bool status=false;
        MySqlConnection connection=new MySqlConnection();
        connection.ConnectionString=conString;

        try{
            string query="insert into author values ("+a.authId+",'"+a.name+"','"+a.description+"','"+a.email+"','"+a.phone+"',"+a.salary+")";
            connection.Open();
            MySqlCommand cmd=new MySqlCommand(query,connection);
            cmd.ExecuteNonQuery();
            status=true;
        }catch(Exception e)
        {
            Console.WriteLine(e.Message);
        }
        finally{
            connection.Close();
        }
        return status;
    }

    public static bool Delete(int authId)
    {
        bool status=false;
        MySqlConnection connection =new MySqlConnection();
        connection.ConnectionString =conString;
        try{
            string query="delete from author where authId="+authId;
            connection.Open();
            MySqlCommand cmd=new MySqlCommand(query, connection);
           int affectedrows= cmd.ExecuteNonQuery();
           if(affectedrows>0)
            {
                status=true;
            }
        }catch(Exception e)
        {
            Console.WriteLine(e.Message);
        }finally{
            connection.Close();
        }
        return status;
    }


}
