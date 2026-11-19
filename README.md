# Strings Exercicis II: Cadenes de Text i Vectors
 
**Centre:** La Salle Gràcia (Barcelona)
**Cicle:** Desenvolupament d'Aplicacions Web (DAW-1), 
**Autor:** Sergi Cruceta
**Llenguatge:** Java
 
---
 
## Índex
 
1. Descripció del projecte
2. Requisits
3. Estructura de carpetes
4. Com compilar i executar
5. Exercici 01: Longitud d'una cadena
6. Exercici 02: Freqüència de caràcters
7. Exercici 03: Primers 2 i darrers 2 caràcters
8. Exercici 4: Afegir "ing" o "ly"
9. Exercici 05: Paraula més llarga d'un vector
10. Resum dels conceptes treballats
11. Bones pràctiques aplicades
---
 
## 1. Descripció del projecte
 
Aquest repositori recull la resolució de cinc exercicis de programació en Java. Tots treballen amb text, ja sigui amb una sola cadena (`String`) o amb un vector de cadenes (`String[]`). L'objectiu és practicar els mètodes bàsics de la classe `String`, els bucles, les condicions i l'ús d'estructures de dades com el `Map`.
 
Cada exercici es resol en un fitxer independent, amb comentaris dins del codi que expliquen cada pas. Els exercicis estan ordenats de més senzill a més complex, de manera que cada un reforça el que s'ha après a l'anterior.
 
## 2. Requisits
 
Per executar els programes cal tenir instal·lat el JDK (Java Development Kit), preferiblement la versió 17 o una de posterior. Per comprovar la versió instal·lada, s'escriu `java -version` a la terminal. Es pot treballar amb qualsevol editor, com ara IntelliJ IDEA, Eclipse o Visual Studio Code.
 
## 3. Estructura de carpetes
 
```
exercicis-java/
├── README.md
├── exercici01.java
├── exercici02.java
├── exercici03.java
├── exercici04.java
└── exercici05.java
```
 
En Java, el nom de cada fitxer ha de coincidir exactament amb el nom de la classe pública que conté, respectant les majúscules i minúscules.
 
## 4. Com compilar i executar
 
Cal obrir una terminal dins de la carpeta del projecte. Primer es compila el fitxer amb `javac` i després s'executa amb `java`, sense l'extensió. Com a exemple, per a l'exercici 1:
 
```bash
javac exercici01.java
java exercici01
```
 
Per als altres exercicis es fa el mateix, canviant el nom del fitxer i de la classe.
 
---
 
## 5. Exercici 01: Longitud d'una Cadena
 
**Fitxer:** `exercici01.java`
 
**Enunciat.** Escriu un programa per calcular la longitud d'una cadena i que ho mostri per pantalla.
 
**Resolució.** El programa guarda un text en una variable de tipus `String` i en calcula la longitud amb el mètode `length()`. El resultat és un nombre enter que compta tots els caràcters, espais inclosos. Finalment, s'imprimeix amb `System.out.println`.
 
**Conceptes treballats.** Declaració de variables, mètode `length()`, concatenació amb `+` i sortida per pantalla.
 
**Sortida per a la cadena "Hola món":**
 
```
La cadena és: Hola món
La longitud de la cadena és: 8
```
 
---
 
## 6. Exercici 02: Freqüència de Caràcters
 
**Fitxer:** `exercici02.java`
 
**Enunciat.** Escriu un programa per comptar el nombre de caràcters (freqüència de caràcters) en una cadena.
 
**Cadena de mostra:** `google.com`
 
**Resultat esperat:** `{'g': 2, 'o': 3, 'l': 1, 'e': 1, '.': 1, 'c': 1, 'm': 1}`
 
**Resolució.** El programa recorre la cadena caràcter per caràcter amb un bucle `for` i fa servir un `LinkedHashMap<Character, Integer>` per guardar cada caràcter i el nombre de vegades que apareix. Per a cada caràcter s'aplica `put(caracter, getOrDefault(caracter, 0) + 1)`, que suma un al comptador existent o el crea amb valor 1. S'ha triat `LinkedHashMap` perquè conserva l'ordre d'inserció i així el resultat coincideix amb l'enunciat. Els espais dels extrems que apareixen a l'enunciat original no es tenen en compte, ja que el resultat esperat no els inclou.
 
**Conceptes treballats.** Estructura `Map`, bucle `for`, mètodes `charAt()` i `getOrDefault()`, classe `StringBuilder` per donar format a la sortida.
 
**Sortida:**
 
```
{'g': 2, 'o': 3, 'l': 1, 'e': 1, '.': 1, 'c': 1, 'm': 1}
```
 
---
 
## 7. Exercici 03: Primers 2 i Darrers 2 Caràcters
 
**Fitxer:** `exercici03.java`
 
**Enunciat.** Escriu un programa per obtenir una cadena formada pels primers 2 i els darrers 2 caràcters d'una cadena donada. Si la longitud de la cadena és inferior a 2, retorna una cadena buida.
 
| Cadena de mostra | Resultat esperat |
|---|---|
| `"w3resource"` | `'w3ce'` |
| `"w3"` | `'w3w3'` |
| `"w"` | cadena buida |
 
**Resolució.** Primer es comprova la longitud. Si és inferior a 2, es retorna `""`. En cas contrari, els dos primers caràcters s'obtenen amb `substring(0, 2)` i els dos darrers amb `substring(length() - 2)`, i després s'uneixen. La condició és `< 2` i no `<= 2`, perquè la cadena "w3" té exactament dues lletres i ha de donar `w3w3`.
 
**Conceptes treballats.** Mètodes propis amb retorn, condicions `if`, mètode `substring()` i posicions que comencen a 0.
 
**Sortida:**
 
```
w3resource -> 'w3ce'
w3 -> 'w3w3'
w -> ''
```
 
---
 
## 8. Exercici 04: Afegir "ing" o "ly"
 
**Fitxer:** `exercici04.java`
 
**Enunciat.** Escriu un programa per afegir `ing` al final d'una cadena determinada (la longitud ha de ser com a mínim 3). Si la cadena donada ja acaba amb `ing`, afegeix `ly` al seu lloc. Si la longitud de la cadena donada és inferior a 3, deixa-la sense canvis.
 
| Cadena de mostra | Resultat esperat |
|---|---|
| `"abc"` | `"abcing"` |
| `"string"` | `"stringly"` |
 
**Resolució.** El mètode fa tres comprovacions seguides, en aquest ordre. Si la longitud és inferior a 3, retorna la cadena sense canvis. Si la cadena acaba amb `ing` (comprovat amb `endsWith("ing")`), hi afegeix `ly`. En qualsevol altre cas, hi afegeix `ing`. Els exemples de l'enunciat demostren que `ly` s'afegeix al final i no substitueix `ing`, ja que "string" dona "stringly".
 
**Conceptes treballats.** Condicions encadenades, mètode `endsWith()`, `return` anticipat i caràcters d'escapament (`\"`).
 
**Sortida:**
 
```
abc -> "abcing"
string -> "stringly"
ab -> "ab"
```
 
---
 
## 9. Exercici 05: Paraula més Llarga d'un Vector
 
**Fitxer:** `exercici05.java`
 
**Enunciat.** Escriu un programa que agafi un vector de paraules i ens digui quina és la més llarga i quina longitud té.
 
**Resolució.** S'aplica la tècnica de la campiona provisional. Primer es comprova que el vector no sigui buit. Després es parteix de la primera paraula com a campiona i es recorre el vector amb un bucle `for-each`. Cada vegada que es troba una paraula amb més caràcters, aquesta passa a ser la nova campiona. En cas d'empat es manté la primera, perquè la comparació és estricta (`>`). Al final es mostra la paraula i la seva longitud.
 
**Conceptes treballats.** Vectors (`String[]`), bucle `for-each`, diferència entre `length` (vector) i `length()` (`String`), i control del vector buit.
 
**Sortida per al vector `{"sol", "ordinador", "web", "java", "programa"}`:**
 
```
La paraula més llarga és: ordinador
La seva longitud és: 9
```
 
---
 
## 10. Resum dels Conceptes Treballats
 
| Exercici | Eina principal | Idea clau |
|---|---|---|
| 01 | `length()` | Compta tots els caràcters, espais inclosos |
| 02 | `LinkedHashMap` | Clau i valor, i `getOrDefault` per comptar |
| 03 | `substring()` | El número final no s'inclou |
| 04 | `endsWith()` | L'ordre de les comprovacions és important |
| 05 | Bucle `for-each` | Campiona provisional per trobar el màxim |
 
## 11. Bones pràctiques aplicades
 
Tots els programes segueixen les mateixes normes de qualitat. Els noms de classes s'escriuen en format `PascalCase` i els de variables i mètodes en `camelCase`, tal com recomana la convenció de Java. El codi està comentat pas a pas perquè sigui fàcil de llegir. La lògica es separa en mètodes propis quan és possible, de manera que `main` només s'encarrega de provar-los. Finalment, es controlen els casos límit (cadenes curtes i vectors buits) per evitar excepcions com `StringIndexOutOfBoundsException` i `ArrayIndexOutOfBoundsException`.
 
---
 
*Treball realitzat a La Salle Gràcia, Desenvolupament d'Aplicacions Web.*
 
