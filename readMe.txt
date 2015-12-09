
Koden finns också på Github vid: https://github.com/OliviaImner/DogRegister

Koden kan kompileras och köras genom att, i terminalen skriva:

cd /pathToProgramsRootDirectory
javac -sourcepath source source/run.java
java -cp source run

Dessa kod utvecklades för att uppfylla de krav beskriven i uppgiften här under:

Instruktioner
Den andra uppgiften går ut på att skriva ett program som hanterar ett litet register över hundar som finns på en kennel. Registret ska använda sig av en klass för att representera hundarna. För varje hund skall finnas attribut för namn, ras, ålder och vikt samt svanslängd. (Observera att attribut inte alltid måste motsvaras av en variabel.) Svanslängden för en hund kan räknas ut med den fiffiga formeln: 

svanslängden=åldern⋅vikten10

Denna formel gäller för alla hundar utom taxar. En tax har alltid svanslängden 3,7. 

Samtliga attribut skall vara inkapslade, alltså deklarerade som private. Åtkomst till attributen sker genom lämpliga metoder (som då är deklarerade som public). Forumleringen är avsiktligt vag för att man ska tvingas fundera över vilka metoder som är lämpliga att ha med. Klassen ska också ha en konstruktor som sätter alla attributen. Värdena på attributen ska alla skickas till konstruktorn som parametrar förutom svanslängden som istället räknas ut när den behövs. Klassen ska slutligen också ha en lämplig toString-metod.

Själva programmet skall vara kommandostyrt och fyra olika kommandon skall kunna ges:

Registrera: Användaren får frågor om namn, ras, ålder och vikt för hunden. Ett hundobjekt skapas och läggs in i kennel-registret.
Lista: Användaren får en fråga om minsta svanslängd och programmet skriver ut en lista på alla hundar hos kenneln som har längre svanslängd än denna minsta angivna. Om man anger 0 så kommer alltså alla hundar att skrivas ut. Anger man istället 10 så skrivs bara de hundar vars svanslängd är större eller lika med 10 ut. Vid utskriften skall alla hundens attribut samt svanslängden skrivas ut, t.ex. ''Fido Pudel 4 år 7 kg svans=2.8'' eller ''Nisse Tax 6 år 8 kg svans=3.7''.
Ta bort: Användaren får en fråga efter namnet på hunden som skall tas bort. Hunden med det angivna namnet skall tas bort ur kennel-registret. Om det inte finns någon hund med det angivna namnet så skall programmet skriva ut ''Hund med det namnet fanns ej i registret'' annars skall det skrivas ut ''Hunden med det angivna namnet är borttagen''. Ni behöver inte tänka på komplikationen att det kan finnas flera hundar med samma namn.
Avsluta: Programmet avslutas. En tråkig effekt är att när programmet avslutas så ''försvinner'' allt lagrat data (objekt som skapas ligger i primärminnet och finns bara så länge programmet körs). Alla registrerade hundar försvinner alltså varje gång vi avslutar programmet. Ett tips för att underlätta testning är därför att låta programmet lägga in ett par hundar automatiskt när det startar.
De olika Hund-objekten som skapas skall lagras i en datasamling. Här skall ArrayList<Hund> användas. (Under förutsättning att du döpte din klass till Hund och inte till Dog eller något annat.) Hantering av Hund-objekt görs då genom att skapa ett objekt av samlingsklassen och i detta objekt anropa olika metoder, exempelvis add för att addera en ny hund till samlingen.

Vid lösningen av denna uppgift kan ni förutsätta att användaren gör rätt. Om man t.ex. frågar efter ett heltal så kan ni förutsätta att ett heltal verkligen matas in (skulle något annat matas in så leder det förmodligen till ett exekveringsavbrott). Det behövs alltså inga indatakontroller för att man skall bli godkänd.

Innan ni lämnar in skall ni (givetvis) testa att ert program fungerar som det ska. Detta görs lämpligen genom att ni skapar några hundar (varav minst en är en tax) och sedan provar att lista alla dessa (genom att ange minsta svanslängd vid listningen som 0, då skall alla hundarna skrivas ut). Därefter ange lämplig annan minsta svanslängd så att ni ser att inte alla skrivs ut. Kontrollera att detta fungerar som det ska. Ta sedan bort en av hundarna, lista igen och kontrollera så att den borttagna hunden verkligen försvunnit. Det är en mycket viktig del av programmering att testa koden man skrivit för att se att den fungerar som den ska.

Förutom programmet så ingår det också i uppgiften att skapa ett komplett klassdiagram för hundklassen. Ni får gärna göra ett för hela programmet, men det är ett krav att i gör det för hundklassen.

De generella kraven på inlämningsuppgifterna gäller naturligtvis även denna uppgift.