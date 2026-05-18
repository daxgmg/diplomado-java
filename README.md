# Proyecto Java - Actividades 1 al 7
## Diplomado en Programación Java

---

## Estructura del proyecto

```
proyecto_java/
├── persona1/
│   ├── actividad1/
│   │   ├── Ejemplo1.java       → Hola mundo, estructura básica
│   │   ├── Suma.java           → Suma de dos números con Scanner
│   │   └── Pares.java          → Número par o impar
│   ├── actividad2/
│   │   ├── Ej1_AreaRectangulo.java
│   │   ├── Ej2_AreaCircunferencia.java
│   │   ├── Ej3_Descuento10.java
│   │   ├── Ej4_Hipotenusa.java
│   │   ├── Ej5_PromedioNotas.java
│   │   ├── Ej6_PosNegNeutro.java
│   │   ├── Ej7_PromedioConValidacion.java
│   │   ├── Ej8_MayorDeTres.java
│   │   └── Ej9_DescuentoPorRango.java
│   └── actividad4/
│       └── InvestigacionDoWhile.java
│
└── persona2/
    ├── actividad3/
    │   ├── Ejemplo1Switch.java → Días de la semana con Switch
    │   ├── Calculadora.java    → Calculadora básica con Switch
    │   ├── EjemploWhile.java   → Primeros 1000 naturales
    │   └── EjemploFor.java     → Promedio de 10 números con For
    ├── actividad5/
    │   ├── Ej1_DescuentoEtiqueta.java
    │   ├── Ej2_ParesHastaN.java
    │   ├── Ej3_ParesEntreDosnumeros.java
    │   ├── Ej4_SumaRepetitiva.java
    │   ├── Ej5_SumaConDoWhile.java
    │   ├── Ej6_MultiplosDe5.java
    │   └── Ej7_TablaMultiplicar.java
    ├── actividad6/
    │   ├── Ejemplo1Vectores.java       → Vector de 3 nombres
    │   ├── Ejemplo2Vectores.java       → Vector de 10 ciudades con For
    │   ├── Ejemplo1Matrices.java       → Matriz 3x3 de animales
    │   └── EjemploSumaMatrices.java    → Suma de dos matrices 3x3
    └── actividad7/
        ├── Ej1_FrutasInverso.java
        ├── Ej2_PromedioNumeros.java
        ├── Ej3_ParesImpares.java
        ├── Ej4_MayorMenor.java
        ├── Ej5_ArticulosFilasInvertidas.java
        ├── Ej6_TranspuestaMatriz.java
        └── Ej7_PuntoDeSilla.java
```

---

## Configuración del repositorio GitHub

### 1. Crear el repositorio
1. Ir a [github.com](https://github.com) y crear un nuevo repositorio (ej. `diplomado-java`)
2. No inicializar con README (lo haremos manual)

### 2. Configurar localmente (en tu computadora)
```bash
# Clonar el repositorio vacío
git clone https://github.com/TU_USUARIO/diplomado-java.git
cd diplomado-java

# Copiar todos los archivos del proyecto aquí
# Luego hacer el primer commit en main
git add .
git commit -m "Estructura inicial del proyecto"
git push origin main
```

### 3. Crear las ramas requeridas
```bash
# Crear rama develop desde main
git checkout -b develop
git push origin develop

# Crear rama individual Persona 1
git checkout -b persona1
git push origin persona1

# Crear rama individual Persona 2
git checkout -b persona2
git push origin persona2
```

### 4. Flujo de trabajo colaborativo

**Persona 1** trabaja así:
```bash
git checkout persona1
# Agrega/modifica sus archivos
git add .
git commit -m "Actividad1: Ejemplo1, Suma y Pares completados"
git push origin persona1
```

**Persona 2** trabaja así:
```bash
git checkout persona2
# Agrega/modifica sus archivos
git add .
git commit -m "Actividad3: Switch y Calculadora completados"
git push origin persona2
```

### 5. Integrar en develop
```bash
git checkout develop

# Integrar persona1
git merge persona1 -m "Merge actividades persona1"

# Integrar persona2
git merge persona2 -m "Merge actividades persona2"

git push origin develop
```

### 6. Consolidar en main (entrega final)
```bash
git checkout main
git merge develop -m "Consolidación final del proyecto"
git push origin main
```

---

## Lo que revisará el facilitador
- ✅ Rama `main` con versión estable final
- ✅ Rama `develop` con integración de ambas personas
- ✅ Ramas individuales (`persona1`, `persona2`) con commits propios
- ✅ Historial de commits evidenciando trabajo colaborativo
