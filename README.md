# Java_8th_Exercise_Automovil

mkdir Java_8th_Exercise_Automovil<br>
cd Java_8th_Exercise_Automovil<br>
mkdir -p src/main/java/com/example/automovil/model<br>
mkdir -p src/main/java/com/example/automovil/service<br>
mkdir -p src/main/java/com/example/automovil/enums<br>
mkdir -p src/test/java/com/example/automovil/service<br>

Enunciado:
Se requiere un programa que modele el concepto de un automóvil. Un automóvil tiene los siguientes atributos:<br>
-Marca: el nombre del fabricante.<br>
-Modelo: año de fabricación.<br>
-Motor: volumen en litros del cilindraje del motor de un automóvil.<br>
-Tipo de combustible: valor enumerado con los posibles valores de gasolina, bioetanol, diésel, biodiésel, gas natural.<br>
-Tipo de automóvil: valor enumerado con los posibles valores de carro de ciudad, subcompacto, compacto, familiar, ejecutivo, SUV.<br>
-Número de puertas: cantidad de puertas.<br>
-Cantidad de asientos: número de asientos disponibles que tiene el vehículo.<br>
-Velocidad máxima: velocidad máxima sostenida por el vehículo en km/h.<br>
-Color: valor enumerado con los posibles valores de blanco, negro, rojo, naranja, amarillo, verde, azul, violeta.<br>
-Velocidad actual: velocidad del vehículo en un momento dado.<br>
.
.

# Estructura del Proyecto
Java_8th_Exercise_Automovil/<br>
├── src/<br>
│   ├── main/<br>
│   │   ├── java/<br>
│   │   │   └── com/<br>
│   │   │       └── automovil/<br>
│   │   │           ├── enums/<br>
│   │   │           │   ├── Combustible.java<br>
│   │   │           │   ├── TipoAutomovil.java<br>
│   │   │           │   └── Color.java<br>
│   │   │           ├── model/<br>
│   │   │           │   └── Automovil.java<br>
│   │   │           ├── service/<br>
│   │   │           │   └── AutomovilService.java<br>
│   │   │           └── Main.java<br>
│   └── test/<br>
│       ├── java/<br>
│       │   └── com/<br>
│       │       └── automovil/<br>
│       │           └── service/<br>
│       │               └── AutomovilServiceTest.java<br>
├── .vscode/<br>
│   └── settings.json<br>
├── .gitignore<br>
├── pom.xml<br>
└── README.md<br>
└── UML/<br>
    └── Diagrama_de_Clases.png<br>

Entregable:
- Repositorio de git
- Obligatorio realizar los pruebas unitarias

# Diagrama de Clases
[UML]https://www.planttext.com/

![Diagrama de Clases](UML/Diagrama_de_Clases.png)

# Texto Enunciado:
[Link Enunciado Automovil]https://docs.google.com/document/d/1HSwCVitQpPok5EwDl61T0VQKN-uPVGkjE3AkqKhbedo/edit