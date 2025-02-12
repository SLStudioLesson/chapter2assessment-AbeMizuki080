package data;

import java.io.IOException;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;

public class RecipeFileHandler {
    public String filePath= "src/main/resources/recipes.txt";  

    public RecipeFileHandler() {
        
    }

    public RecipeFileHandler(String filePath) {
        this.filePath = filePath;
    }

    /**
     * 設問1: 一覧表示機能
     * recipes.txtからレシピデータを読み込み、それをリスト形式で返します。 <br> 
     * IOExceptionが発生したときは<i>Error reading file: 例外のメッセージ</i>とコンソールに表示します。
     *
     * @return レシピデータ
     */
    public ArrayList<String> readRecipes() {
        ArrayList<String> recipes = new ArrayList<>();

        try 
            (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/recipes.txt"))){
                String line;
                ArrayList<String> lines = new ArrayList<>();
                for(int i = 0; i<lines.size(); i++){
                    String recipe = lines.get(i);
                    lines.add(recipe);
                }
        } catch (IOException ex) {
            System.out.println("Error reading file: " + ex.getMessage());
        }
        return recipes;
    }

    /**
     * 設問2: 新規登録機能
     * 新しいレシピをrecipes.txtに追加します。<br>
     * レシピ名と材料はカンマ区切りで1行としてファイルに書き込まれます。
     *
     * @param recipeName レシピ名
     * @param ingredients 材料名
     */
     // 
    public void addRecipe(String recipeName, String ingredients) {

        try 
            (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))){
                writer.write(recipeName + "," + ingredients);
                writer.newLine();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error writing to file: " + e.getMessage());
        }


        // try {

        // } catch (IOException e) {

        // }
    }
}
