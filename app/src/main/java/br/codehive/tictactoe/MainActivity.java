package br.codehive.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TicTacToeGame game;
    private Button[][] buttons; // Array 2D para referenciar os botões do tabuleiro
    private TextView textViewStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        game = new TicTacToeGame();
        textViewStatus = findViewById(R.id.textViewStatus);
        buttons = new Button[3][3];

        // Mapeie os botões do XML para o array 2D
        // Isso pode ser feito de forma mais elegante, mas para o exemplo:
        buttons[0][0] = findViewById(R.id.button00);
        buttons[0][1] = findViewById(R.id.button01);
        buttons[0][2] = findViewById(R.id.button02);
        buttons[1][0] = findViewById(R.id.button10);
        buttons[1][1] = findViewById(R.id.button11);
        buttons[1][2] = findViewById(R.id.button12);
        buttons[2][0] = findViewById(R.id.button20);
        buttons[2][1] = findViewById(R.id.button21);
        buttons[2][2] = findViewById(R.id.button22);

        // Configurar Listeners para todos os botões do tabuleiro
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                final int row = i; // Necessário para a inner class anônima
                final int col = j;
                buttons[i][j].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onCellClicked(row, col); // Chama um método auxiliar com as posições
                    }
                });
            }
        }

        // Configurar listener para o botão de reset
        Button resetButton = findViewById(R.id.buttonReset);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onResetClicked();
            }
        });

        updateUI(); // Atualiza o status inicial
    }

    // Método auxiliar para lidar com cliques nas células
    private void onCellClicked(int row, int col) {
        if (game.isGameOver()) {
            return; // Não permite mais movimentos se o jogo já terminou
        }

        if (game.makeMove(row, col)) {
            // Atualiza o botão com o jogador atual
            buttons[row][col].setText(String.valueOf(game.getWinner() == '-' ? game.getCurrentPlayer() : (game.getCurrentPlayer() == 'X' ? 'O' : 'X'))); // Exibir o jogador que fez a jogada
            updateUI();
        }
    }

    // Método para reiniciar o jogo
    private void onResetClicked() {
        game.resetGame();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText(""); // Limpa o texto dos botões
                buttons[i][j].setEnabled(true); // Habilita os botões novamente
            }
        }
        updateUI();
    }

    // Método para atualizar a UI com base no estado do jogo
    private void updateUI() {
        if (game.isGameOver()) {
            char winner = game.getWinner();
            if (winner != '-') {
                textViewStatus.setText("O jogador " + winner + " venceu!");
            } else {
                textViewStatus.setText("Empate!");
            }
            disableAllButtons(); // Desabilita os botões após o fim do jogo
        } else {
            textViewStatus.setText("Vez de " + game.getCurrentPlayer());
        }
    }

    private void disableAllButtons() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setEnabled(false);
            }
        }
    }
}