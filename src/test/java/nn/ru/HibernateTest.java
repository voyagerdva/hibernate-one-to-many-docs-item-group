package nn.ru;

import nn.ru.entity.Doc;
import nn.ru.entity.Group;
import nn.ru.entity.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;
import org.w3c.dom.ranges.DocumentRange;

public class HibernateTest {

    @Test
    public void test_DocItemGroup_simple_save() {

        // СОЗДАЕМ КОНФИГУРАЦИЮ И ДОБАВЛЯЕМ СУЩНОСТИ:
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(nn.ru.entity.Doc.class);
        configuration.addAnnotatedClass(nn.ru.entity.Item.class);
        configuration.addAnnotatedClass(nn.ru.entity.Group.class);

        // СОЗДАЕМ ФАКБРИКУ СЕССИЙ, ОТКРЫВАЕМ СЕССИЮ И ОТКРЫВАЕМ ТРАНЗАКЦИЮ:
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        // РАБОТА С ДАННЫМИ:
        Doc doc = new Doc();
        Item item = new Item();
        Group group = new Group();

        session.save(item);
        item.setGroup(group);
        doc.setItem(item);
        session.save(group);
        session.save(doc);

        // ЗАКРЫВАЕМ СЕССИЮ и ФАКБРИКУ:
        session.getTransaction().commit();
        session.close();
        factory.close();
    }

    @Test
    public void test_DocItemGroup_simple_save_tryWith_1_DIG() {

        // СОЗДАЕМ КОНФИГУРАЦИЮ И ДОБАВЛЯЕМ СУЩНОСТИ:
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(nn.ru.entity.Doc.class);
        configuration.addAnnotatedClass(nn.ru.entity.Item.class);
        configuration.addAnnotatedClass(nn.ru.entity.Group.class);

        // СОЗДАЕМ ФАКБРИКУ СЕССИЙ, ОТКРЫВАЕМ СЕССИЮ И ОТКРЫВАЕМ ТРАНЗАКЦИЮ:

        try (SessionFactory factory = configuration.buildSessionFactory();
             Session session = factory.openSession();) {
            Transaction transaction = session.beginTransaction();

            // РАБОТА С ДАННЫМИ:
            Doc doc = new Doc();
            Item item = new Item();
            Group group = new Group();

            session.save(doc);
            session.save(item);
            session.save(group);

            item.setGroup(group);
            doc.setItem(item);


            session.getTransaction().commit();
        }
    }

    @Test
    public void test_DocItemGroup_simple_save_tryWith_2_DGI() {

        // СОЗДАЕМ КОНФИГУРАЦИЮ И ДОБАВЛЯЕМ СУЩНОСТИ:
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(nn.ru.entity.Doc.class);
        configuration.addAnnotatedClass(nn.ru.entity.Item.class);
        configuration.addAnnotatedClass(nn.ru.entity.Group.class);

        // СОЗДАЕМ ФАКБРИКУ СЕССИЙ, ОТКРЫВАЕМ СЕССИЮ И ОТКРЫВАЕМ ТРАНЗАКЦИЮ:

        try (SessionFactory factory = configuration.buildSessionFactory();
             Session session = factory.openSession();) {
            Transaction transaction = session.beginTransaction();

            // РАБОТА С ДАННЫМИ:
            Doc doc = new Doc();
            Item item = new Item();
            Group group = new Group();

            session.save(doc);
            session.save(group);
            session.save(item);

            item.setGroup(group);
            doc.setItem(item);


            session.getTransaction().commit();
        }
    }

    @Test
    public void test_DocItemGroup_simple_save_tryWith_3_GID() {

        // СОЗДАЕМ КОНФИГУРАЦИЮ И ДОБАВЛЯЕМ СУЩНОСТИ:
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(nn.ru.entity.Doc.class);
        configuration.addAnnotatedClass(nn.ru.entity.Item.class);
        configuration.addAnnotatedClass(nn.ru.entity.Group.class);

        // СОЗДАЕМ ФАКБРИКУ СЕССИЙ, ОТКРЫВАЕМ СЕССИЮ И ОТКРЫВАЕМ ТРАНЗАКЦИЮ:

        try (SessionFactory factory = configuration.buildSessionFactory();
             Session session = factory.openSession();) {
            Transaction transaction = session.beginTransaction();

            // РАБОТА С ДАННЫМИ:
            Doc doc = new Doc();
            Item item = new Item();
            Group group = new Group();

            session.save(group);
            session.save(item);
            session.save(doc);

            item.setGroup(group);
            doc.setItem(item);


            session.getTransaction().commit();
        }
    }

    @Test
    public void test_DocItemGroup_simple_save_tryWith_4_GDI() {

        // СОЗДАЕМ КОНФИГУРАЦИЮ И ДОБАВЛЯЕМ СУЩНОСТИ:
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(nn.ru.entity.Doc.class);
        configuration.addAnnotatedClass(nn.ru.entity.Item.class);
        configuration.addAnnotatedClass(nn.ru.entity.Group.class);

        // СОЗДАЕМ ФАКБРИКУ СЕССИЙ, ОТКРЫВАЕМ СЕССИЮ И ОТКРЫВАЕМ ТРАНЗАКЦИЮ:

        try (SessionFactory factory = configuration.buildSessionFactory();
             Session session = factory.openSession();) {
            Transaction transaction = session.beginTransaction();

            // РАБОТА С ДАННЫМИ:
            Doc doc = new Doc();
            Group group = new Group();
            Item item = new Item();

            session.save(group);
            session.save(doc);
            session.save(item);

            session.getTransaction().commit();
        }
    }

    @Test
    public void test_DocItemGroup_simple_save_tryWith_5_IDG() {

        // СОЗДАЕМ КОНФИГУРАЦИЮ И ДОБАВЛЯЕМ СУЩНОСТИ:
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(nn.ru.entity.Doc.class);
        configuration.addAnnotatedClass(nn.ru.entity.Item.class);
        configuration.addAnnotatedClass(nn.ru.entity.Group.class);

        // СОЗДАЕМ ФАКБРИКУ СЕССИЙ, ОТКРЫВАЕМ СЕССИЮ И ОТКРЫВАЕМ ТРАНЗАКЦИЮ:

        try (SessionFactory factory = configuration.buildSessionFactory();
             Session session = factory.openSession();) {
            Transaction transaction = session.beginTransaction();

            // РАБОТА С ДАННЫМИ:
            Doc doc = new Doc();
            Item item = new Item();
            Group group = new Group();

            session.save(item);
            session.save(doc);
            session.save(group);

            item.setGroup(group);
            doc.setItem(item);


            session.getTransaction().commit();
        }
    }

    @Test
    public void test_DocItemGroup_simple_save_tryWith_6_IGD() {

        // СОЗДАЕМ КОНФИГУРАЦИЮ И ДОБАВЛЯЕМ СУЩНОСТИ:
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(nn.ru.entity.Doc.class);
        configuration.addAnnotatedClass(nn.ru.entity.Item.class);
        configuration.addAnnotatedClass(nn.ru.entity.Group.class);

        // СОЗДАЕМ ФАКБРИКУ СЕССИЙ, ОТКРЫВАЕМ СЕССИЮ И ОТКРЫВАЕМ ТРАНЗАКЦИЮ:

        try (SessionFactory factory = configuration.buildSessionFactory();
             Session session = factory.openSession();) {
            Transaction transaction = session.beginTransaction();

            // РАБОТА С ДАННЫМИ:
            Doc doc = new Doc();
            Item item = new Item();
            Group group = new Group();

            session.save(item);
            session.save(group);
            session.save(doc);

            item.setGroup(group);
            doc.setItem(item);

            session.getTransaction().commit();
        }
    }
}
