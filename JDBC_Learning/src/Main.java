void main() {

    //1st Way(the hardcoded way)
    //Studentjdbc sb= new Studentjdbc();
    //sb.CreateUser();
    //sb.UpdateUser();
    //sb.GetUserBasic();

    //2nd way(the dynamic way)
    dbjdbc dbj = new dbjdbc();
    dbj.CreateUser(new Student("Rahul",24,"odhisa"));
}

