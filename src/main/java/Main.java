public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.patronymic = "Иванович";
        post.surname = "Иванов";
        post.passport = "4444 № 44444444";
        post.phone = "+7 (999)-999-99-99";
        post.subscription = "true";

        Post.birthday = new FormDate();
        post.birth_day = "13";
        post.birth_month = "06";
        post.birth_year = "1999";
    }
}
