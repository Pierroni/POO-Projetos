public class TestaAcademico {
        public static void main(String[] args) {
            Aluno aluno1 = new Aluno(653, "Lucas", "10958706", "ADS");
            Aluno aluno2 = new Aluno(924, "Ana", "10978909", "DSM");

            Disciplina disc1 = new Disciplina(1, "Programação orientada a objeto", "Daniel");

            // AGREGAÇÃO
            disc1.matricularAluno(aluno1);
            disc1.matricularAluno(aluno2);

            // COMPOSIÇÃO
            disc1.criarAvaliacao(1, "Prova Semestral");

            // COMPOSIÇÃO ANINHADA
            Avaliacao av = disc1.getAvaliacoes().get(0);

            av.adicionarQuestao(1, "O que é POO?", 2.0f);
            av.adicionarQuestao(2, "Explique herança", 3.0f);
            av.adicionarQuestao(3, "Explique polimorfismo", 5.0f);

            // Impressão final
            System.out.println(disc1);
        }
    }

