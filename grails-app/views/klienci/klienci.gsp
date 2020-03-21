<h1> Lista aktualnych klientow</h1>
<h2>Aktualnie mamy ${ile} klientow </h2>
Cokolwiek ${imie}
<br>
pierwszy element z nazwisk ${surname[0]}
<br>
pierwszy element z imion ${imiona[0]}
<br>
Wynik ${spr}
<br>
dlugosc listy: ${listSize}
<br>
Text ze zmiennej ${kusiciel}
<table>
    <thead>
        <tr>
            <th>Id</th>
            <th>Imie Klienta</th>
            <th>Nazwisko Klienta</th>
        </tr>

    </thead>
    <tbody>
        <g:each var="k" in="${klienciAktualni}" status = "i">
                <tr>
                    <td>${k.id}.</td>
                    <td>${k.imie}</td>
                    <td>${k.nazwisko}</td>
                </tr>
        </g:each>
    </tbody>
</table>
<hr>
<g:form controller = "Klienci" action = "zapisz">
  <label> Imie </label>
  <br>
  <g:textField name = "imie" maxlength = "50" minlength ="3"></g:textField>
  <br>
  <label> Nazwisko</label>
  <br>
  <g:textField name = "nazwisko" maxlength = "50" minlength ="3"></g:textField>
  <br>
  <input value="Submit" type ="submit"/>
</g:form>
<hr>
<g:form controller = "Klienci" action = "usun">
<label>ID</label>
<br>
<g:textField name = "id" ></g:textField>
<input value = "Usun" type = "submit">
</g:form>
<hr>
<h1>Update customer</h1>
<g:form controller = "Klienci" action = "update">
<label> Id </label>
<br>
<g:textField name = "id"></g:textField>
<br>
<label> Imie</label>
<br>
<g:textField name = "imie"></g:textField>
<br>
<label>Nazwisko</label>
<br>
<g:textField name = "nazwisko"></g:textField>
<br>
<br>
<input value = "Update" type = "submit">
</g:form>
