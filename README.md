# StoryFlow

StoryFlow es una aplicacion de consola en Java para crear cuentos paso a paso mediante un workflow sencillo.

## Objetivo

El proyecto ayuda a construir un cuento de forma ordenada, guiando al usuario por cada etapa y guardando el resultado final en consola y en un archivo de texto.

## Estructura del proyecto

```text
StoryFlow/
|-- src/
|   |-- app/
|   |   `-- Main.java
|   |-- model/
|   |   `-- Cuento.java
|   |-- util/
|   |   `-- ArchivoUtil.java
|   `-- workflow/
|       |-- EtapaCuento.java
|       `-- WorkflowCuento.java
|-- data/
|-- out/
|-- .gitignore
`-- README.md
```

## Como compilar

```bash
javac -d out src/model/Cuento.java src/workflow/EtapaCuento.java src/workflow/WorkflowCuento.java src/util/ArchivoUtil.java src/app/Main.java
```

## Como ejecutar

```bash
java -cp out app.Main
```

## Donde se guarda el archivo

El cuento se guarda automaticamente en la carpeta `data/` con un nombre como `cuento_mi_historia.txt`.

## Nota

Esta es una primera version por consola, pensada para aprender y dejar una base clara para futuras mejoras.
