# StoryFlow

StoryFlow es una aplicacion de consola en Java para crear cuentos paso a paso.

## Que hace el proyecto

- solicita el titulo y cada parte del cuento por consola
- guia al usuario por las etapas del workflow
- valida que los campos no queden vacios
- muestra el cuento completo al finalizar
- guarda el resultado en un archivo `.txt` dentro de `data/`

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
