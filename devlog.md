# Devlog

### Geraldo 11/11/19

1. **15:34**: To tentando entender o que tá acontencendo na classe Creation, devo mudar pra algo mais organizado. Pensando em algumas funções pra criar e retornar as classes "de pessoas" e a partir disso usar no main junto com uma UI melhor.
2. **15:39**: Acho que adicionar persistência é bem simples, talvez fazer duas classes: uma pra lidar com um banco de dados simples (vai ser um sqlite, sem tempo de setar uma coisa mais robusta) e outra classe, chamada Savable ou coisa parecida, pra lidar com o BD e a partir desse Savable herdar nas "pessoas".