#language:es

Característica: Hacer login correctamente
  Yo como automatizador de GlobalLogic
  Necesito loguearme en la app de ibank
  Para validar un login exitosamente

  Esquema del escenario: Iniciar sesion exitosamente
    Cuando El usuario ingresa el usuario y la contrasena
      | Usuario   | Contrasena   |
      | <Usuario> | <Contrasena> |
    Entonces Deberia iniciar sesion correctamente

    Ejemplos:
      | Usuario | Contrasena |
      | company | company    |
