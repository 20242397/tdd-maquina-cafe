# TDD Máquina de Café

![CI](https://github.com/TU_USUARIO/tdd-maquina-cafe/actions/workflows/ci-pipeline.yml/badge.svg)

Máquina dispensadora de café desarrollada con Test Driven Development (Rojo, Verde, Refactor) en Java y JUnit 4.

- Clases: `Vaso`, `Cafetera`, `Azucarero`, `MaquinaDeCafe` (más `Main`, el programa de consola)
- Pruebas: 19 pruebas unitarias en `test/`

## Ejecutar las pruebas

```bash
mvn test
```

## CI/CD

El workflow `.github/workflows/ci-pipeline.yml` compila el proyecto y ejecuta las pruebas con cada push y pull request.
