# Devlog

### Geraldo 11/11/19

1. **15:34**: To tentando entender o que tá acontencendo na classe Creation, devo mudar pra algo mais organizado. Pensando em algumas funções pra criar e retornar as classes "de pessoas" e a partir disso usar no main junto com uma UI melhor.
2. **15:39**: Acho que adicionar persistência é bem simples, talvez fazer duas classes: uma pra lidar com um banco de dados simples (vai ser um sqlite, sem tempo de setar uma coisa mais robusta) e outra classe, chamada Savable ou coisa parecida, pra lidar com o BD e a partir desse Savable herdar nas "pessoas".
3. **15:46**: Pra fazer a interface vai ser simples, vou precisar de uma função pra desenhar o que sempre aparece, uma pra limpar o terminal e alguns comandinhos pra chamar as iterações entre as classes
4. **16:12**: Arrumei uma função pra executar um clear no console [nesse link aqui](https://stackoverflow.com/questions/2979383/java-clear-the-console)
5. **16:40**: Vou reciclar essas funções de criação, mas ainda queria arruamr outra maneira de chamar isso na main. Fiz uma classa db e uma savable, person herda de savable. Isso é só pra poder generalizar um método pra salvar no bd e deixar o professor feliz que a gente tá usando alguma coisa orientada a objeto