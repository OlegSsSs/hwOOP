package hwSeminar5;

import hwSeminar5.controllers.UserController;
import hwSeminar5.model.FileOperation;
import hwSeminar5.model.FileOperationImpl;
import hwSeminar5.model.Repository;
import hwSeminar5.model.RepositoryFile;
import hwSeminar5.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}


/*
* ДЗ:
*   1 🎈 -> сделать удаление из справочника пользователей
*
*   2 -> сделать сохранение в другом формате, например не через запятую, а
*   через точку с запятой, и разделителем - пустой строкой. Предусмотреть
*   сохранение в старом формате (переключатель какой-то или просто класс поменять или
*   маппер переделать)
*
*   3 🎈 -> сделать валидацию для проверки ввода номера телефона*/
