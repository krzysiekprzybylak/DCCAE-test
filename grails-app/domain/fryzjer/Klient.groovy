package fryzjer

class Klient {

    String imie
    String nazwisko
    static constraints = {
    }
    Klient(imie,nazwisko){
      this.imie=imie
      this.nazwisko=nazwisko
    }
    Klient(id,imie,nazwisko)
    {
      this.id = id
      this.imie = imie
      this.nazwisko = nazwisko
    }
    // Klient(id){
    //  this.id =id
    //}

    static mapping = {
      version(false)
      id(column:"klient_id")
    }
}
