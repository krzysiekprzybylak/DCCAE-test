package fryzjer

class KlienciController {

    def index() {

      println "Index called ************************"
      //redirect(action:"lista")
      def klienci = Klient.list()
      assert klienci instanceof List

      def i = "Krzysiek"
    //  map."Przybylak - ${imie}" = "Krzysiek Przybylak"
    //  assert.map."Przybylak-Krzysiek"=="Krzysiek Przybylak"
     def arrayOfImiona = ['Marek','Krzysiek','Robert']
      String[]nazwiska = ['Przybylak','Tolak','Soper']
      String theSame
      assert nazwiska[0] =="Przybylak"
      theSame = "Nazwisk te same"
      def listSize = arrayOfImiona.size()
      assert arrayOfImiona instanceof List
      def kusiciel = "Jakikolwiek text"
      def ileKlientow = Klient.count()

      render(view:"klienci", model:[klienciAktualni:klienci , imiona:arrayOfImiona , surname:nazwiska, imie:i, spr:theSame ,
      listSize:listSize, kusiciel:kusiciel, ile:ileKlientow])
            }

      def zapisz(){//za kzdym razem czyta ta sama strone czy musze twozyc nowa
              def imie = params.imie
              def nazwisko = params.nazwisko
              Klient nowyKlient = new Klient(imie,nazwisko)
              nowyKlient.save()
              def klienciAktualni = Klient.list()
            //  def iluKlientow = Klient.length()
              redirect (action:"index")
              //render(view:"klienci", model:[klienciAktualni:klienciAktualni])
            }


      def usun(){
          def clientId = params.id

          def clientToRemove = Klient.get(clientId)

            println" >>>>>> client to remove is "  + clientToRemove


          clientToRemove.delete(flush:true)


          redirect (action:"index")
        }


        def update(){
        def clientId = params.id
      def clientIdToUpdate = Klient.get(clientId)
        def imien = params.imie
        println "imie"+ imien
      //  def clientName = Klient.get(imien)
        def nazwiskon = params.nazwisko
        //def clientNazwisko = Klient.get(nazwiskon)
        //println">>>>>> client id to update: "+ clientIdToUpdate +" client name to update " + clientName + " klient nazwisko " + clientNazwisko
        //Klient nowy = new Klient(clientId,imien,nazwiskon)
      //  nowy.save()
        //  def imie = params.imie
          //def nazwiskon = params.nazwisko
          //def nowyKlient = Klient.findByImieAndNazwisko(imie,nazwisko)
          Klient.executeUpdate("update klient set imie =imien, nazwisko = nazwiskon where id = clientId" )
            //  "update Person set age = :newAge where firstName = :firstNameToSearch and lastName = :lastNameToSearch",
  //  [newAge:15, firstNameToSearch:'John', lastNameToSearch:'Doe'])
      //    Person.executeUpdate("update Person set age = age + 1 where surname = 'Doe' ");
      //  Klient.executeUpdate("update Klient k set k.imie=:noweImie where k.imie =:stareImie",[noweImie:"noweImie",stareImie:"stareImie"])
          def klienciAktualni = Klient.list()
          redirect(action:"index")
        }
      //  Account.executeUpdate("update Book b set b.title=:newTitle " +
        //              "where b.title=:oldTitle",
          //            [newTitle: 'Groovy In Action', oldTitle: 'GINA'])



}
