# DIO_Santander_UML
# Desafio DIO Santander
**Programação orientada a objetos.**

#### Funcionalidades a Modelar
1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### Objetivo
1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java (Opcional).

```mermaid
classDiagram
direction TB
    class Iphone {
    }

    class ReprodutorMusical {
	    +tocar()
	    +pausar()
	    +selecionarMusica(String musica)
	    +selecionarOpcao(int numero)
    }

    class AparelhoTelefone {
	    +ligar(String numero)
	    +atender()
	    +iniciarCorreioVoz()
	    +selecionarOpcao(int numero)
    }

    class NavegadorInternet {
	    +exibirPagina(String url)
	    +adicionarAba()
	    +atualizarPagina()
	    +selecionarOpcao(int numero)
    }

    Iphone --|> ReprodutorMusical
    Iphone --|> AparelhoTelefone
    Iphone --|> NavegadorInternet
```


