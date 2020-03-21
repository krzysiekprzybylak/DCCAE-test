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
